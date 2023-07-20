// 1. Leia N e escreva todos os números inteiros de 1 a N.

package lista_03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
