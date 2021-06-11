package br.com.padroes.padroes;


public class Questao implements Cloneable{
    private String qst, resposta;
    
    public Questao(String qst, String resposta){
        this.qst = qst;
        this.resposta = resposta;
    }

    public String getQst() {
        return qst;
    }

    public void setQst(String qst) {
        this.qst = qst;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
}
