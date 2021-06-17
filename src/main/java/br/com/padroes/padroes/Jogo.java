package br.com.padroes.padroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo{
    List<Bloco> blocos;
    Player player;
    
    Scanner ler = new Scanner(System.in);
    
    //TESTE
    public void verificarQst(){
        for(int i = 0; i < blocos.size(); i++){
            for(int j = 0; j < blocos.get(i).questoes.size(); j++){
                System.out.println((j + 1) + "° questão do Bloco " + (i + 1) + ": " + blocos.get(i).questoes.get(j).getQst()+"\n");
            }    
        }
    }
    
    public void play(){
        int nivel = 0;
        boolean verif;
        System.out.println("\nNome do jogador: ");
        player.setNome(ler.next());
        System.out.println("Responda as Questões: \n");
        switch(nivel){
            case 0:
                if(verif = playQsts(nivel))
                    nivel++;
                else
                    break;
                
            case 1:
                if(verif = playQsts(nivel))
                    nivel++;
                else
                    break;
            
            case 2:
                if(verif = playQsts(nivel))
                    //6 é o total de qsts
                    //System.out.println("\nAnálise de Desempenho: Acertos: " + (player.getAcertos() / 6) * 100 + "%  | Erros: " + (player.getErros() / 6) * 100 + "%\n");
                break;              
                
        }
        System.out.println("\nFIM DO JOGO! O jogador " + player.getNome() + " teve um total de " + player.getAcertos() + " acertos e " + player.getErros() + " erros! \n");
    }
    
    public boolean playQsts(int bloco){
        for(int j = 0; j < blocos.get(bloco).questoes.size(); j++){
            System.out.println((j + 1) + "° questão do Bloco " + (bloco + 1) + ": " + blocos.get(bloco).questoes.get(j).getQst());
            player.setResposta(ler.next());
            if(player.getResposta().equals(blocos.get(bloco).questoes.get(j).getResposta())){
                player.setAcertos(player.getAcertos() + 1);
                System.out.println("\nRESPOSTA CORRETA!");
            }else{
                player.setErros(player.getErros() + 1);
                System.out.println("\nRESPOSTA ERRADA! R: " + blocos.get(bloco).questoes.get(j).getResposta());
            }
        }
        if(player.getAcertos() > blocos.get(bloco).questoes.size() / 2){
            System.out.println("\nVoçê foi aprovado na etapa " + (bloco + 1) + "! O jogador " + player.getNome() + " teve um total de " + player.getAcertos() + " acertos e " + player.getErros() + " erros! \n");
            return true;           
        }else{
            System.out.println("\nFIM DO JOGO! O jogador " + player.getNome() + " teve um total de " + player.getAcertos() + " acertos e " + player.getErros() + " erros e foi REPROVADO! \n");
            return false;
        }
        
    }
    
    public Jogo(){
        this.player = new Player();
        this.blocos = (List<Bloco>) new ArrayList();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    public void addBloco(Bloco bloco){
        this.blocos.add(bloco);
    }
    
    
    
    
}
