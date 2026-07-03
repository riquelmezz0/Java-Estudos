import java.util.Random;
import java.util.Scanner;

public class Dia7 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner jogo = new Scanner(System.in);

        System.out.println("Bem Vindo! vamos jogar PPT?");
        System.out.print("Faça sua escolha: ");
        String escolha = jogo.nextLine();
        int numero = aleatorio.nextInt(3);
        String computador;

        if (numero == 0) {
            computador = "Pedra";
        }
        else if (numero == 1) {
            computador = "Papel";
        }
        else {
            computador = "Tesoura";
        }
        if (escolha.equalsIgnoreCase("Papel")) {
            System.out.println("Você escolheu: " + escolha);
            System.out.println("O Computador escolheu: " + computador);
        }
        else if (escolha.equalsIgnoreCase("Pedra")) {
            System.out.println("Você escolheu: " + escolha);
            System.out.println("O Computador escolheu: " + computador);
        }
        else if (escolha.equalsIgnoreCase("Tesoura")) {
            System.out.println("Você escolheu: " + escolha);
            System.out.println("O Computador escolheu: " + computador);
        }
        else {
            System.out.println("Jogada Inválida");
        }
        if (escolha.equalsIgnoreCase("Pedra") && computador.equals("Pedra")) {
            System.out.println("Empate!");
        }
        else if (escolha.equalsIgnoreCase("Pedra") && computador.equals("Papel")) {
            System.out.println("Você Perdeu!");
        }
        else if (escolha.equalsIgnoreCase("Pedra") && computador.equals("Tesoura")) {
            System.out.println("Você Venceu!");
        }
        if (escolha.equalsIgnoreCase("Papel") && computador.equals("Pedra")) {
            System.out.println("Você Venceu!");
        }
        else if (escolha.equalsIgnoreCase("Papel") && computador.equals("Papel")) {
            System.out.println("Empate!");
        }
        else if (escolha.equalsIgnoreCase("Papel") && computador.equals("Tesoura")) {
            System.out.println("Você Perdeu!");
        }
        if (escolha.equalsIgnoreCase("Tesoura") && computador.equals("Pedra")) {
            System.out.println("Você Perdeu!");
        }
        else if (escolha.equalsIgnoreCase("Tesoura") && computador.equals("Papel")) {
            System.out.println("Você Venceu!");
        }
        else if (escolha.equalsIgnoreCase("Tesoura") && computador.equals("Tesoura")) {
            System.out.println("Empate!");
        }
    }
}
