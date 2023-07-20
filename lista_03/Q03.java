// 3. Leia um número, calcule e escreva seu fatorial.

package lista_03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        if(numero < 0){
            System.out.println("Numero invalido. o numero nao deve ser negativo");
        } else {
            for(int i = 1; i <= numero; i++){
                fatorial *= i;
            }
            System.out.printf("O fatorial de %d e: %d", numero, fatorial);
        }
        scanner.close();
    }
}
