// 5. Leia um número inteiro (3 dígitos), calcule e escreva a soma de seus elementos (C + D + U).
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite uma numero com tres elementos: ");
        int num = input.nextInt();

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        int soma = centenas + dezenas + unidades;
        
        System.out.printf("A soma dos tres elementos da variavel e: %d", soma);


        input.close();
    }
}
