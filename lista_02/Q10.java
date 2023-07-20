// 10. Leia 1 (um) número inteiro e escreva se este número é par ou impar.

package lista_02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean par;

        if(numero % 2 == 0){
            // System.out.println("Numero Par");
            par = true;
        } else {
            // System.out.println("Numero Impar");
            par = false;
        }

        if(par){
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }

        scanner.close();
    }
}