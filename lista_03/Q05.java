// 5. Leia N e uma lista de N números e escreva a soma e a média de todos os números da lista.

package lista_03;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int qtd_numero = scanner.nextInt();

        int somatorio = 0;
        if(qtd_numero < 0){
            System.out.println("Invalido!. Digite um numero inteiro positivo");
        } else {
            for(int i = 1; i <= qtd_numero; i++){
                System.out.printf("Digite o %d numero: ", i);
                int dig_numero = scanner.nextInt();
                
                somatorio += dig_numero;
            }
            System.out.println("O somatorio dos numeros digitados e igual: " + somatorio);
        }
        scanner.close();
    }
}
