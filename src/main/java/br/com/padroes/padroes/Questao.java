package br.com.padroes.padroes;
import static java.lang.Math.sqrt;
import java.util.Random;

public class Questao implements Cloneable{
    private String qst, resposta;
    
    
    public void gerarQstEasy(){
        Random r = new Random();
        int a = r.nextInt(11);
        int b = r.nextInt(11);
        int formula = r.nextInt(3);
        
        switch(formula){
            case 0:
                this.qst = "Qual o valor da adição: " + a + " + " + b;
                this.resposta = String.valueOf(a + b);
                break;
            case 1:
                this.qst = "Qual o valor da subtração: " + a + " - " + b;
                this.resposta = String.valueOf(a - b);
                break;
            case 2:
                this.qst = "Qual o valor da multiplicação: " + a + " x " + b;
                this.resposta = String.valueOf(a * b);
                break;
        }
    }
    
    public void gerarQstNormal(){
        Random r = new Random();
        int a = r.nextInt(21);
        int b = r.nextInt(21);
        int c = r.nextInt(11);
        
        int formula = r.nextInt(3);
        
        switch(formula){
            case 0:
                this.qst = "Qual o valor da expressão: " + a + " * (" + b + " + " + c + ")";
                this.resposta = String.valueOf(a * (b + c));
                break;
            case 1:
                this.qst = "Qual o valor da expressão: (" + a + " - " + b + ") * " + c;
                this.resposta = String.valueOf((a - b) * c);
                break;
            case 2:
                this.qst = "Qual o valor da expressão: " + b + " + " + c + " * (" + a + " + " + c + ")";
                this.resposta = String.valueOf(b + c * (a + c));
                break;
        }
    }
    
    public void gerarQstHard(){
        Random r = new Random();
        int a = r.nextInt(11);
        int b = r.nextInt(11);
        int c = r.nextInt(101);
        int d = r.nextInt(1001);
        
        int formula = r.nextInt(3);
        
        switch(formula){
            case 0:
                this.qst = "Qual o valor da hipotenusa de um triângulo retângulo com lados -> a = " + a + " e b = " + b;
                this.resposta = String.valueOf(sqrt((a * a) + (b * b)));
                break;
            case 1:
                this.qst = "Quanto é " + c + "% de R$ " + d;
                this.resposta = String.valueOf((c * d) / 100);
                break;
            case 2:
                this.qst = "Qual o valor da expressão: " + d + " - " + c + " * (" + a + "² - " + a + ")";
                this.resposta = String.valueOf(d - c * ((a * a) - a));
                break;
        }
    }
    
    
    
    public Questao(String dificuldade){
        switch(dificuldade){
            case "easy":
                gerarQstEasy();
                break;
            case "normal":
                gerarQstNormal();
                break;
            case "hard":
                gerarQstHard();
                break;
        }
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
