import java.util.Scanner;

class Soma {
  public static int resultado(int a, int b){
    return (a + b);
  }
  public static float resultado_t(float c, float d){
    return (c + d);
  }
}

class Funcao {  
  public static void main(String args[]) { 
    Scanner input = new Scanner(System.in);

    int a, b;
    float c, d;
    
    System.out.printf("A: ");
    a = input.nextInt();

    System.out.printf("B: ");
    b = input.nextInt();

    System.out.printf("C: ");
    c = input.nextFloat();

    System.out.printf("D: ");
    d = input.nextFloat();

    System.out.println("Soma dos valores inteiros = "+ Soma.resultado(a, b));
    System.out.println("Soma dos valores reais = "+ Soma.resultado_t(c, d));
    
  } 
}