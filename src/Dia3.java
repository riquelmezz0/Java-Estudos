import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Você gosta de Java? ");
        boolean gostaDeJava = entrada.nextBoolean();
        entrada.close();

        System.out.println("===================");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gosta de Java? " + gostaDeJava);
        System.out.println();
        System.out.println("===================");


    }
}