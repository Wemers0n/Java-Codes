// 4. Leia um número N, some todos os números inteiros entre 1 e N e escreva o resultado obtido.

package lista_03;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int somatorio = 0;

        for(int i = 1; i <= numero; i++){
            somatorio += i;
        }
        System.out.printf("A soma dos elementos entre 1 e %d e: %d", numero, somatorio);
        scanner.close();
    }
}
