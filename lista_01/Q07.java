package lista_01;
// 7. Leia 3 números, calcule e escreva a soma dos 2 primeiros e a diferença entre os 2 últimos.
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Primeiro Valor: ");
        double a = input.nextDouble();

        System.out.printf("Segundo Valor: ");
        double b = input.nextDouble();

        System.out.printf("Terceiro Valor: ");
        double c = input.nextDouble();

        double soma = a + b;
        double diferenca = b - c;

        System.out.printf("A soma dos dois primeiros numeros: %.2f e a diferenca dos dois ultimos: %.2f", soma, diferenca);
        
        input.close();
    }
}