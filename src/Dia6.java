import java.util.Scanner;

public class Dia6 {
    public static void main(String[] args) {

        Scanner jogo = new Scanner(System.in);

        System.out.println("Bem Vindo, vamos jogar PPT? ");
        System.out.print("Faça sua escolha: ");
        String escolha = jogo.nextLine();
        String computador = "Pedra";
        jogo.close();

        if (escolha.equalsIgnoreCase("Papel")) {
            System.out.println("Você escolheu " + escolha);
            System.out.println("Computador escolheu " + computador);
            System.out.println("Você Venceu!");
        }
        else if (escolha.equalsIgnoreCase("Pedra")) {
            System.out.println("Você escolheu " + escolha);
            System.out.println("O Computador escolheu " + computador);
            System.out.println("Empate!");
        }
        else if (escolha.equalsIgnoreCase("Tesoura")) {
            System.out.println("Você escolheu " + escolha);
            System.out.println("O Computador escolheu " + computador);
            System.out.println("Você Perdeu!");
        }
        else {
            System.out.println("Jogada inválida");
        }

    }
}
