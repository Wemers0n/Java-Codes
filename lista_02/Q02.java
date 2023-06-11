// 2. Leia 2 (dois) números, verifique e escreva o menor e o maior entre os números lidos.
package lista_02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro numero");
        int num1 = scanner.nextInt();

        System.out.println("Segundo numero");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.printf("O numero %d e maior que o numero %d", num1, num2);
        } else {
            System.out.printf("O numero %d e menor que o numero %d", num1, num2);
        }
        scanner.close();
    }
}
