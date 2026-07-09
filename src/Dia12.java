import java.util.Scanner;

public class Dia12 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] nota = new int[3];

        nota[0] = 10;
        nota[1] = 8;
        nota[2] = 6;

        for(int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]);
        }
    }
}
