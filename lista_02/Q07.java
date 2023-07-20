// 7. Leia 3 (três) números (cada número corresponde a um lado do triângulo), verifique e escreva se os 3
// (três) números formam um triângulo (a soma de dois lados não pode ser menor que o terceiro lado). Se
// formam, verifique se formam um triângulo equilátero (3 lados iguais), isósceles (2 lados iguais) ou
// escaleno (3 lados diferentes). Não existe lado com tamanho 0 (zero). 

package lista_02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }
        scanner.close();
    }
}
