package br.com.padroes.padroes;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Jogo jogo = new Jogo();
        Bloco bloco1 = new BlocoEasy();
        Bloco bloco2 = new BlocoNormal();
        Bloco bloco3 = new BlocoHard();
        
        //INSTÂNCIA DE OBJETOS TIPO QUESTAO
        Questao qstEasy1 = new Questao("easy");
        Questao qstNormal1 = new Questao("normal");
        Questao qstHard1 = new Questao("hard");

        //CHAIN OF RESPONSIBILITY
        bloco1.proximoNivel(bloco2);
        bloco2.proximoNivel(bloco3);
        
        //CLONES DE OBJETOS DO TIPO QUESTAO
        Questao qstEasy2 = (Questao) qstEasy1.clone();
        Questao qstNormal2 = (Questao) qstNormal1.clone();
        Questao qstHard2 = (Questao) qstHard1.clone();
        
        qstEasy2.gerarQstEasy();
        qstNormal2.gerarQstNormal();
        qstHard2.gerarQstHard();

        
        
        //QUESTOES ADICIONADAS EM BLOCOS
        bloco1.addQst(qstEasy1);
        bloco1.addQst(qstEasy2);

        bloco2.addQst(qstNormal1);
        bloco2.addQst(qstNormal2);

        bloco3.addQst(qstHard1);
        bloco3.addQst(qstHard2);
        
        
        //Start GAME
        jogo.play(bloco1);
        
    }
}
