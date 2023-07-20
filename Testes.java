import javax.swing.JOptionPane;

class Testes {
  public static void main(String[] args) {
    String valor1 = JOptionPane.showInputDialog("Valor 1: ");
    String valor2 = JOptionPane.showInputDialog("Valor 2: ");
    String op = JOptionPane.showInputDialog("Operador: ");

    // System.out.println(valor1 + valor2);

    double num1 = Double.parseDouble(valor1);
    double num2 = Double.parseDouble(valor2);

    // int num3 = Integer.parseInt(valor1);
    // int num4 = Integer.parseInt(valor2);
    
    // System.out.println(num1 + num2);
    // System.out.println(num3 + num4);

    double resultado = "+".equals(op) ? num1 + num2 : 0;

    System.out.println("Resultado: "+ resultado);

  }
}
