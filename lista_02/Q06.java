// 6. Leia 3 (três) números (cada número corresponde a um ângulo interno do triângulo), verifique e escreva
// se os 3 (três) números formam um triângulo (a soma dos ângulos internos é igual a 180º). Se formam,
// verifique se formam um triângulo acutângulo (3 ângulos < 90º), retângulo (1 ângulo = 90º) ou
// obtusângulo (1 ângulo > 90º). Não existe ângulo com tamanho 0º (zero grau).

package lista_02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Primeiro Angulo: ");
        int angulo1 = scanner.nextInt();

        System.out.printf("Segundo Angulo: ");
        int angulo2 = scanner.nextInt();

        System.out.printf("Terceiro Angulo: ");
        int angulo3 = scanner.nextInt();

        int soma_angulo = angulo1 + angulo2 + angulo3;

        if (soma_angulo == 180) {
            if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                System.out.println("Triângulo acutângulo.");
            } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("Triângulo retângulo.");
            } else {
                System.out.println("Triângulo obtusângulo.");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }
        scanner.close();
    }
}
