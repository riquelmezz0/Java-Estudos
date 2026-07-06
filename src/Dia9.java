import java.util.Scanner;

public class Dia9 {
    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.println("Vamos Jogar(s/n): ");
        String resposta = sys.nextLine();

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite um número: ");
            int num = sys.nextInt();
            sys.nextLine();
            System.out.println("Número esolhido: " + num);
            System.out.println("Deseja continuar(s/n)?: ");
            resposta = sys.nextLine();
        }
        if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Até a proxima! ");
        }
        else {
            System.out.println("Termo inválido! ");}
    }
}
