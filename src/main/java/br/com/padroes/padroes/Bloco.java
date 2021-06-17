package br.com.padroes.padroes;

import java.util.ArrayList;
import java.util.List;

public abstract class Bloco {
    List<Questao> questoes;
    private Bloco proxNivel;
    
    public void proximoNivel(Bloco proxBloco){
        this.proxNivel = proxBloco;
    }
    
    public Bloco(){
        this.questoes = new ArrayList();
    }
    
    public void addQst(Questao qst){
        this.questoes.add(qst);
    }
    
    public void removeAll(){
        this.questoes.removeAll(questoes);
    }
    
    public void removeQst(Questao qst){
        this.questoes.remove(qst);
    }

    
}
