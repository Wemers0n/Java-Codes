import java.util.Scanner;

public class Entrada_Saida{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a;
        float b;

        System.out.printf("Valor Inteiro de de A: ");
        a = input.nextInt(); // Ler um valor inteiro 

        System.out.printf("Valor Real de B: ");
        b = input.nextFloat(); // Ler valor com casa decimal

        System.out.println(a);
        System.out.println(b);

        // InputMismatchException --->> Separador decimal do sistema é representado por uma vírgula e não um ponto. 
    }
}