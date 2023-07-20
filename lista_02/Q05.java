// 5. Leia 3 (três) números e escreva-os em ordem crescente.

package lista_02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.printf("Terceiro numero: ");
        int numero3 = scanner.nextInt();

         // Verificar a ordem e trocar os números, se necessário
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Escrever os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);


        scanner.close();
    }
}
