package lista_01;
// 6. Leia uma velocidade em km/h, calcule e escreva esta velocidade em m/s. (Vm/s = Vkm/h / 3.6)
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("km/h: ");
        int v_km = input.nextInt();

        double v_ms = v_km / 3.6;
        int c_ms = (int) v_ms; // casting -->> Conversão explicita

        System.out.printf("%dkm/h equivale a %dm/s", v_km, c_ms);
        input.close();
    }
}
