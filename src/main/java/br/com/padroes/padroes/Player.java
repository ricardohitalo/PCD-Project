package br.com.padroes.padroes;


public class Player implements Cloneable{
    private String nome, resposta;
    private int acertos, erros;
    
    public Player(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    
}
