/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;
import java.util.ArrayList;


/**
 *
 * @author mathias
 */
public class Prova {
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private ArrayList<Questao> listaQuestoes;
    
    
    public Prova(String nome){
        this.peso=10;
        this.nomeDisciplina=nome;
        this.listaQuestoes=new ArrayList();
    }
    /**
    *Método que retorna a descrição da prova
    @return hsuhsus
    */
     public String obtemDetalhes(){
        return "Nome: "+this.getNomeDisciplina()+"\nPeso: "+this.getPeso()+"\nLocal: "+this.getLocal()+
                "\nData: "+this.getData();
        
        
    }
     public String obtemProvaImpressao(){
         String provaImpressao="Nome da Disciplina: "+this.getNomeDisciplina()+
                 "\nPeso da Prova: "+this.getPeso()+
                 "\nLocal da Prova: "+this.getLocal()+
                 "\nData da Prova: "+this.getData()+
                 "\n\n\t====Perguntas Discursivas=====\n";
         
         
         for (int i = 0; i < this.listaQuestoes.size(); i++) {
             provaImpressao+="Questão "+(i+1)+") "+this.listaQuestoes.get(i).retornaQuestao();
         }

         return provaImpressao;
     }


    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the listaQuestoes
     */
    public ArrayList<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    /**
     * @param listaQuestoes the listaQuestoes to set
     */
    public void setListaQuestoes(ArrayList<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }
}
