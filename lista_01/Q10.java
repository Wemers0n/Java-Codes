package lista_01;
// 10. Leia 2 números inteiros, calcule e escreva o quociente e o resto da divisão do 1o pelo 2o.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        int quociente = num1 / num2;
        int resto = num1 % num2;

        System.out.printf("O quociente da divisão de %d por %d é %d e o resto é %d.", num1, num2, quociente, resto);

        input.close();
    }
}



// Alguns calculos estao retornando 0,0000