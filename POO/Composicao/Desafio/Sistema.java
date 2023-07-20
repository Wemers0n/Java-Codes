package POO.Composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria");
        Compra compra1 = new Compra();

        compra1.addItens("Caneta", 2.50, 10);
        compra1.addItens("Caderno", 25.0, 5);

        c1.addCompras(compra1);

        System.out.println(c1.ValorTotal());
        System.out.println(compra1.obterValorTotal());
    }
}
