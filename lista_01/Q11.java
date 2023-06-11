package lista_01;
// # 11. Leia um número inteiro (3 dígitos) e escreva o inverso do número. (Ex.: número = 532 ; inverso = 235)

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digiteum numero inteiro de 3 digitos: ");
        int numero = input.nextInt();

        int inverso = 0;
        int num = numero;

        inverso += numero % 10 * 100;
        numero /= 10;

        inverso += numero % 10 * 10;
        numero /= 10;

        inverso += numero % 10;

        System.out.printf("O inverso de %d e %d", num, inverso);

        input.close();
    }
}
