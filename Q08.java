// 8. Leia 2 números, calcule e escreva a divisão da soma pela subtração dos números lidos.

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Primeiro numero: ");
        int num1 = input.nextInt();

        System.out.printf("Segundo numero: ");
        int num2 = input.nextInt();

        int calculo = (num1 + num2) / (num1 - num2);

        System.out.printf("A divisão da soma pela subtração e igual a -->> %d", calculo);

        input.close();
    }
}
