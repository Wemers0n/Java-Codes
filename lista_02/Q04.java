// Leia 1 (um) número de 2 (dois) dígitos, verifique e escreva se o algarismo da dezena é 
// igual ou diferente do algarismo da unidade.

package lista_02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de dois digitos: ");
        int num = scanner.nextInt();

        int dezena = (num % 100) / 10;
        int unidade = (num % 10);
        

        if(dezena == unidade){
            System.out.printf("O digito %d e igual ao digito %d", dezena, unidade);
        } else{
            System.out.printf("O digito %d e diferente do digito %d", dezena, unidade);
        }

        scanner.close();
    }
}
