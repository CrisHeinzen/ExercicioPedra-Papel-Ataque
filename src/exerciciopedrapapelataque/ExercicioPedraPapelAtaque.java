
package exerciciopedrapapelataque;

import java.util.Random;
import javax.swing.JOptionPane;


public class ExercicioPedraPapelAtaque {
    

    public static void main(String[] args) {
        
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Ataque Aéreo"};

     // Obter a quantidade de rodadas usando JOptionPane
        String input = JOptionPane.showInputDialog("Quantidade de rodadas:");
        int quantidadeDeRodadas = Integer.parseInt(input);
        

        for (int rodada = 1; rodada <= quantidadeDeRodadas; rodada++) {
            
     // Gerar escolha aleatória para o Jogador 1 sendo que a escolha aqui é apenas na posição da tabela
            int indiceAleatorioJogador1 = random.nextInt(opcoes.length);
     // Baseado na posição escolhida acima, traz o resultado.   
            String escolhaJogador1 = opcoes[indiceAleatorioJogador1];

      // Gerar escolha aleatória para o Jogador 2
            int indiceAleatorioJogador2 = random.nextInt(opcoes.length);
            String escolhaJogador2 = opcoes[indiceAleatorioJogador2];

      // Exibir as escolhas e determinar o vencedor usando JOptionPane
            JOptionPane.showMessageDialog(null, "Rodada " + rodada +
                    "\nJogador 1 escolheu: " + escolhaJogador1 +
                    "\nJogador 2 escolheu: " + escolhaJogador2 +
                    "\nResultado da Rodada " + rodada + ": " + determinarVencedor(escolhaJogador1, escolhaJogador2));
      
      // Linha apenas para conferencia      
            System.out.println("Resultado da Rodada " + rodada + ": " + determinarVencedor(escolhaJogador1, escolhaJogador2));
            
        }
    }
    

      // Método para determinar o vencedor de uma rodada
    private static String determinarVencedor(String escolhaJogador1, String escolhaJogador2) {
        
     // Lógica para determinar o vencedor conforme as regras fornecidas
        if (escolhaJogador1.equals("Ataque Aéreo") && escolhaJogador2.equals("Pedra") ||
            escolhaJogador1.equals("Pedra") && escolhaJogador2.equals("Papel") ||
            escolhaJogador1.equals("Papel") && escolhaJogador2.equals("Ataque Aéreo")) {
            return "Jogador 1 venceu";
        } else if (escolhaJogador2.equals("Ataque Aéreo") && escolhaJogador1.equals("Pedra") ||
                   escolhaJogador2.equals("Pedra") && escolhaJogador1.equals("Papel") ||
                   escolhaJogador2.equals("Papel") && escolhaJogador1.equals("Ataque Aéreo")) {
            return "Jogador 2 venceu";
        } else if (escolhaJogador1.equals("Papel") && escolhaJogador2.equals("Papel")) {
            return "Ambos ganham";
        } else if (escolhaJogador1.equals("Ataque Aéreo") && escolhaJogador2.equals("Ataque Aéreo")) {
            return "Aniquilação Mútua";
        } else {
            return "Sem ganhador";
        }
    }
}
