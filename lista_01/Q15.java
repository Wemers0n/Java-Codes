package lista_01;
// 15. Leia o valor da base e altura de um triângulo, calcule e escreva sua área. 
// (área=(base * altura)/2)

import java.util.Scanner;

public class Q15 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Altura: ");
    double altura = scanner.nextDouble();

    System.out.println("Base: ");
    double base = scanner.nextDouble();

    double area = (base * altura) / 2;

    System.out.println("A area do triangulo e igual a: " + area);
    scanner.close();
   } 
}
