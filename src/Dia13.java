import java.util.Scanner;

public class Dia13 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] nota = new int[3];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            nota[i] = num.nextInt();
        }
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Sua nota: " + nota[i]);
        }
        int soma = 0;

        for (int i = 0; i < nota.length; i++) {
            soma = soma + nota[i];
        }
        int media = soma / nota.length;
        System.out.println("Sua média " + media);
    }
}
