package Basico;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de indices do vetor: ");
        int qtd = scanner.nextInt();
        
        int[] vetor = new int[qtd];

        // Iterando sobre os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {      
            System.out.printf("Valor para o indice %d do vetor: ", i);    
            vetor[i] = scanner.nextInt();
        }

        // for(int i = 0; i <vetor.length; i++){
        //     System.out.printf("Indice %d do vetor: %d\n", i, vetor[i]);          
        // }
        
        System.out.println(Arrays.toString(vetor));

        scanner.close();
    }
}
