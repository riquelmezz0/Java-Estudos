import java.util.Scanner;

public class DesafioDia4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Sua nota: ");
        int nota = entrada.nextInt();
        entrada.close();

        if (nota >= 7) {
            System.out.print("Aprovado");}
        else if (nota >= 5) {
            System.out.print("Recuperação");}
        else {
            System.out.println("Reprovado");

        }
        }

}

