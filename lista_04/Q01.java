// 1. Leia uma lista de números e que para cada número lido, escreva o próprio número e a relação de seus
// divisores. (flag número = 0).

package lista_04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.print("Divisores de " + numero + ": ");
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        } while (numero != 0);
        scanner.close();
    }
}
