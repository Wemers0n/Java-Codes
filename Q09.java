// 9. Leia 2 números (A, B) e escreva-os em ordem inversa (B, A).

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Primeiro numero: ");
        int a = input.nextInt();

        System.out.printf("Segundo numero: ");
        int b = input.nextInt();

        System.out.printf("%d %d", b, a);

        input.close();
    }
}
