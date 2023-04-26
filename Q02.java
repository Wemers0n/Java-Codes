// 02. Leia um valor em horas e um valor em minutos, calcule e escreva o equivalente em minutos.
import java.util.Scanner;


public class Q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Horas: ");
        int hrs = input.nextInt();

        System.out.printf("Minutos: ");
        int min = input.nextInt();

        int e_min = (hrs * 60) + min;

        System.out.println("Equivalente em minutos: " + e_min);

        input.close();
    }
}
