package POO.Heranca;

public class Teste {
    public static void main(String[] args) {
        Civic c1 = new Civic("Civic", 4);
        // c1.nome = "Civic";
        c1.setAno(2021);
        // c1.portas = 4;
        
        c1.Acelerar();
        c1.Frear();
        
        System.out.println(c1.getAno());
        c1.anoCarSet(2022);
        System.out.println(c1.getAno());
        System.out.println(c1.nomeCar());
        System.out.println(c1.portas);
    }
}
