package lista_01;
// 12. Leia o salário de um trabalhador e escreva seu novo salário com um aumento de 25%.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Salario: R$");
        double salario = input.nextDouble();

        double aumento = salario * (1 + 0.25);

        System.out.printf("O aumento do salario de RS%.2f ficou R$%.2f", salario, aumento);
        input.close();

    }
}
