// 6. Leia um número N, calcule e escreva os N primeiros termos de seqüência de Fibonacci
// (0,1,1,2,3,5,8,...). O valor lido para N sempre será maior ou igual a 2.

package lista_03;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Digite o valor de N > 2: ");
        int n = scanner.nextInt();

        int termo1 = 0, termo2 = 1;

        System.out.print("Sequência de Fibonacci com " + n + " termos: ");
        System.out.print(termo1 + ", " + termo2);

        for(int i = 1; i < n; i++){
            int prox_termo = termo1 + termo2;
            System.out.print(", " + prox_termo);
            termo1 = termo2;
            termo2 = prox_termo;
        }
        System.out.println();
        scanner.close();
    }
}
