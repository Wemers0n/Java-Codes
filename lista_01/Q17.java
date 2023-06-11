package lista_01;
// 17. Leia o valor da base e altura de um retângulo, calcule e escreva sua área. 
// (área = base * altura)

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Base: ");
        double base = scanner.nextDouble();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A Area do retangulo e igual a: %.2f", area);

        scanner.close();
    }
}
