/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;

import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author mathias
 */

    public class GeradorProva{
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);

            
            System.out.print("Entre com o nome da disciplina: ");
            Prova p= new Prova(s.nextLine());
            
            System.out.print("Entre com a data da prova: ");
            p.setData(s.nextLine());
            System.out.print("Entre com a sala da prova: ");
            p.setLocal(s.nextLine());
            System.out.print("Entre com o peso da prova: ");
            p.setPeso(s.nextInt());
            s.nextLine();
            
            while(true){
                System.out.print("QUal tipo de questão? \n"
                        + "o para Objetiva, d para Discursiva, x para sair.");
                String decisao=s.nextLine();
                if(decisao.equalsIgnoreCase("x")){
                    break;
                }else if(decisao.equalsIgnoreCase("o")){
                    // criar uma questão objetiva
                    Objetiva objetivas=new Objetiva();
                    String[] troca=new String[5];

                    System.out.print("Entre com a pergunta da questão: ");
                    objetivas.setPergunta(s.nextLine());


                    for (int j = 0; j < 5; j++) {
                         System.out.print("Entre com a "+(j+1)+"ª alternativa da questão: ");
                         troca[j]=s.nextLine();
                    }
                    objetivas.setOpcoes(troca);
                    System.out.print("Entre com a resposta correta da questão: ");
                    objetivas.setRespostaCorreta(s.nextInt()-1);
                    s.nextLine();
                    System.out.print("Entre com o peso da questão: ");
                    objetivas.setPeso(s.nextInt());
                    s.nextLine();
                    p.getListaQuestoes().add(objetivas);
                    
                }else if(decisao.equalsIgnoreCase("d")){
                    // criar discursiva
                    Discursiva disc;
                    disc=new Discursiva();
                    System.out.print("Digite a pergunta da questão: ");

                    disc.setPergunta(s.nextLine());
                    System.out.print("Digite o peso da questão: ");
                    disc.setPeso(s.nextDouble());
                    s.nextLine();
                    System.out.print("Digite o critério de avaliação da questão: ");
                    disc.setCriterioCorrecao(s.nextLine());
                    p.getListaQuestoes().add(disc);
                    

                }else{
                    System.out.println("Opção inválida!!");
                }

                
                
                
            }

//            for (int i = 0; i < qtd; i++) {
//                disc=new Discursiva();
//                System.out.print("Digite a pergunta da "+(i+1)+"ª questão: ");
//                
//                disc.setPergunta(s.nextLine());
//                System.out.print("Digite o peso da "+(i+1)+"ª questão: ");
//                disc.setPeso(s.nextDouble());
//                s.nextLine();
//                System.out.print("Digite o critério de avaliação da "+(i+1)+"ª questão: ");
//                disc.setCriterioCorrecao(s.nextLine());
//            }
//            p.setDiscursivas(disc);
//            
//            
//            
//            System.out.print("Entre com a quantidade de questões objetivas: ");
//            qtd=s.nextInt();
//            s.nextLine();
//            String[] troca=new String[5];
//            Objetiva[] objetivas=new Objetiva[qtd];
//
//            for (int i = 0; i < qtd; i++) {
//                objetivas[i]=new Objetiva();
//                System.out.print("Entre com a pergunta da "+(i+1)+"ª questão: ");
//                objetivas[i].setPergunta(s.nextLine());
//
//                
//                for (int j = 0; j < 5; j++) {
//                     System.out.print("Entre com a "+(j+1)+"ª alternativa da "+(i+1)+" questão: ");
//                     troca[j]=s.nextLine();
//                }
//                objetivas[i].setOpcoes(troca);
//                System.out.print("Entre com a resposta correta da "+(i+1)+"ª questão: ");
//                objetivas[i].setRespostaCorreta(s.nextInt()-1);
//                s.nextLine();
//                System.out.print("Entre com o peso da "+(i+1)+" questão: ");
//                objetivas[i].setPeso(s.nextInt());
//                s.nextLine();
//                   
//            }
//            p.setObjetivas(objetivas);

            String prova=p.obtemProvaImpressao();

            System.out.println("\n Impressao Prova:\n"+prova);
            System.out.print("Salvar em arquivo?(Sim/Nao)");
            String resposta=s.next();
            System.out.println(resposta);
            if(resposta.toLowerCase().equals("sim")){
                try{
                    System.out.print("Nome do arquivo com extensão: ");
                    String arquivoAbrir=s.next();
                    File aqrv=new File(arquivoAbrir);
                    FileWriter out=new FileWriter(aqrv);
                    out.write(prova);
                    Desktop.getDesktop().open(aqrv);
                    
                    out.close();
	  	}catch(Exception e){}
                
            }
	  		
            
            //p.peso=3;
            
            //System.out.println(p.obtemDetalhes());
            JOptionPane.showMessageDialog(null, prova);
        }
       
        
    }
    

