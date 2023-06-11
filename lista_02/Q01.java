// 1. Leia 3 (três) números, verifique e escreva quantos números iguais existem entre os números.
package lista_02;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int quantidadeIguais = 0;

        if (numero1 == numero2) {
            quantidadeIguais++;
        }

        if (numero1 == numero3) {
            quantidadeIguais++;
        }

        if (numero2 == numero3) {
            quantidadeIguais++;
        }

        if (quantidadeIguais == 0) {
            System.out.println("Não existem números iguais.");
        } else {
            System.out.println("Existem " + quantidadeIguais + " números iguais.");
        }
        scanner.close();
    }
}
