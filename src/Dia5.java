import java.util.Scanner;

    public class Dia5 {
        public static void main(String[] args) {

            Scanner sistema = new Scanner(System.in);

            double saldo = 500;
            System.out.println("Seu saldo: " + saldo);
            System.out.print("Nome: ");
            String nome = sistema.nextLine();
            System.out.println("Olá " + nome);
            System.out.print("Quanto deseja sacar? ");
            double saque = sistema.nextDouble();
            sistema.close();

            if (saque > saldo) {
                System.out.println("Saldo insuficiente, faça um depósito para continuar");
            }
            else {saldo = saldo - saque;
                System.out.println("Saque realizado! ");
                System.out.println("=====================");
                System.out.println("     Comprovante");
                System.out.println("Cliente: " + nome);
                System.out.println("Valor Sacado: " + saque);
                System.out.println("Saldo Final: " + saldo);
                System.out.println("=====================");}

        }
    }