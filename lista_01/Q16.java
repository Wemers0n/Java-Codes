package lista_01;
// 16. Leia o valor do lado de um quadrado, calcule e escreva sua área. (área = lado2)

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lado do quadrilatero: ");
        double lado = scanner.nextDouble();

        double area = (lado * lado);

        System.out.printf("A area do quadrado e igual a: %.2f", area);

        scanner.close();
    }
}
