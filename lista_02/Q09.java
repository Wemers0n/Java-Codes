// Leia 1 (um) número entre 0 e 100, verifique e escreva se o número é ou não primo

package lista_02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 100: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 100) {
            System.out.println("Número inválido. O número deve estar entre 0 e 100.");
        } else {
            boolean primo = true;

            if (numero == 0 || numero == 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
        scanner.close();
    }
}