// 3. Leia um número e divida-o por dois (sucessivamente) até que o resultado seja menor que 1. Escreva o
// resultado da última divisão efetuada.

package lista_04;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Digite um numero: ");
        double numero = scanner.nextDouble();

        while(numero >= 1){
            numero /= 2;
        }
        System.out.println("A ultima divisao foi: " + numero);
        scanner.close();
    }
}
