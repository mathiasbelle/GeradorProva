/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;

/**
 *
 * @author mathias
 */
public class Objetiva extends Questao {
    private String[] opcoes=new String[5];
    private int respostaCorreta;

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public String retornaQuestao() {
        String retornaObjetiva="";
         String[] opcoes=new String[5];
         String[] caracteres={"a","b","c","d","e"};
         
        
             retornaObjetiva+=this.getPergunta()+"\nAlternativas:\n";
             
             opcoes=this.getOpcoes();
             for (int j = 0; j < 5; j++) {
                 retornaObjetiva+=caracteres[j]+") "+opcoes[j]+"\n";        
         }
        
        
        
        return retornaObjetiva;
    }
}
