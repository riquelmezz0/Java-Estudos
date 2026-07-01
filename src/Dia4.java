import java.util.Scanner;

public class Dia4 {
    static void main() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.close();

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade ");


        }
    }
}