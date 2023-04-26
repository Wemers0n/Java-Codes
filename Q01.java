// 01. Leia uma velocidade em m/s, calcule e escreva esta velocidade em km/h. (Vkm/h = Vm/s * 3.6)

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    int velocidade;
    System.out.printf("Velocidade em m/s: ");
    velocidade = ler.nextInt();

    System.out.printf("Velocidade em Km/h: "+ velocidade * 3.6);
    ler.close();
    }
}