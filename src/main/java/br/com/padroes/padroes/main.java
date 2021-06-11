package br.com.padroes.padroes;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Jogo jogo = new Jogo();
        Bloco bloco1 = new BlocoEasy();
        Bloco bloco2 = new BlocoNormal();
        Bloco bloco3 = new BlocoHard();
        
        //INSTÂNCIA DE OBJETOS TIPO QUESTAO
        Questao qstEasy1 = new Questao("Quanto é 1 + 1?", "2");
        Questao qstNormal1 = new Questao("Quanto é 10²", "100");
        Questao qstHard1 = new Questao("Em em um triangulo retangulo, b = 3 e c = 4. Qual o valor da hipotenusa", "5");

        
        //CLONES DE OBJETOS DO TIPO QUESTAO
        Questao qstEasy2 = (Questao) qstEasy1.clone();
        Questao qstNormal2 = (Questao) qstNormal1.clone();
        Questao qstHard2 = (Questao) qstHard1.clone();
        
        qstEasy2.setQst("Quanto é 20 - 10?");
        qstEasy2.setResposta("10");
        qstNormal2.setQst("Quanto é 5 x 5?");
        qstNormal2.setResposta("25");
        qstHard2.setQst("Quanto é (-2²)");
        qstHard2.setResposta("-4");
        
        System.out.println("Questao Normal 1 e 2: " + qstNormal1.getQst() + " ... " + qstNormal2.getQst() + "Questao Dificil 1 e 2: " + qstHard1.getQst() + " ... " + qstHard2.getQst());
        
        //QUESTOES ADICIONADAS EM BLOCOS
        bloco1.addQst(qstEasy1);
        bloco1.addQst(qstEasy2);

        bloco2.addQst(qstNormal1);
        bloco2.addQst(qstNormal2);

        bloco3.addQst(qstHard1);
        bloco3.addQst(qstHard2);
        
        //BLOCOS ADICIONADOS AO JOGO
        jogo.addBloco(bloco1);
        jogo.addBloco(bloco2);
        jogo.addBloco(bloco3);
        
        //Start QUIZ
        jogo.play();
        
    }
}
