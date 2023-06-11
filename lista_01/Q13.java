package lista_01;
// 13. Leia um valor em real (R$), calcule e escreva 70% deste valor. 

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor em R$: ");
        double valor = scanner.nextDouble();

        double porcentagem = valor * 0.7;

        System.out.printf("70%% do valor é: %.2f", porcentagem);

        scanner.close();
    }
}
