import java.util.Scanner;
import java.util.Random;

public class Dia10 {
    public static void main(String[] args) {

        Scanner jogo = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Vamos Jogar(s/n)? ");
        String resposta = jogo.nextLine();


        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("tente adivinhar o número que eu escolhi! (de 0 à 10)");
            int escolha = jogo.nextInt();
            System.out.println("Número escolhido: " + escolha);
            int num = aleatorio.nextInt(11);

            if (escolha > 10) {
                System.out.println("Número inválido!");
            }
            else if (escolha < 0) {
                System.out.println("Número inválido!");
            }
            while (escolha != num && resposta.equalsIgnoreCase("s")) {
                System.out.println("Número errado!");
                System.out.println("Escolha da máquina: " + num);
                System.out.println("Deseja tentar novamente? (s/n) ");
                jogo.nextLine();
                resposta = jogo.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    num = aleatorio.nextInt(11);
                    System.out.println("Digite outro número: ");
                    escolha = jogo.nextInt();
                }
                else {
                    System.out.println("Até a próxima!");
                }
            }
            if (escolha == num) {
                System.out.println("Parabéns você acertou!");
            }
        }
        else {
            System.out.println("Até a próxima!");
        }
    }
}