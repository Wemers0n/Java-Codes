package Generics;

public class Teste {
    public static void main(String[] args) {
        Objeto<String> obj1 = new Objeto<>();
        obj1.guardar("Livro");
        System.out.println(obj1.abrir());

        Objeto<Double> obj2 = new Objeto<>();
        obj2.guardar(2.3);
        System.out.println(obj2.abrir());

        ObjetoInt obj3 = new ObjetoInt();
        obj3.guardar(123);
        System.out.println(obj3.abrir());

        ObjetoNumero<Double> obj4 = new ObjetoNumero<>();
        obj4.guardar(1.2);
        System.out.println(obj4.abrir());

        ObjetoNumero<Integer> obj5 = new ObjetoNumero<>();
        obj5.guardar(100);
        System.out.println(obj5.abrir());
    }
}
