package lista_01;
// 14. Leia 3 notas de um aluno e o peso de cada nota, calcule e escreva a média ponderada

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Peso da primeira nota");
        double peso1 = scanner.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Peso da segunda nota");
        double peso2 = scanner.nextDouble();

        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Peso da terceira nota");
        double peso3 = scanner.nextDouble();

        double med_pond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.println("A media ponderada e igual: " + med_pond);

        scanner.close();
    }
}
