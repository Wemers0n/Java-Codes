package lista_01;
// 03. Leia um valor em minutos, calcule e escreva o equivalente em horas e minutos.
import java.util.Scanner;


public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Minutos: ");
        int v_min = input.nextInt();

        int hrs = v_min / 60;
        int min = v_min % 60;

        System.out.printf("%d Horas e %d Minutos", hrs, min);

        input.close();
    }
}
