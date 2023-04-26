// 4. Leia o valor do dólar e um valor em dólar, calcule e escreva o equivalente em real (R$).
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Valor da cotacao do dolar: ");
        float v_dol = input.nextFloat();

        System.out.printf("Valor a ser convertido: ");
        float c_dol = input.nextFloat();

        float conv_dol = v_dol * c_dol;

        System.out.printf("O valor $%.2f equivale a R$%.2f", v_dol, conv_dol);
        input.close();
    }
    
}
