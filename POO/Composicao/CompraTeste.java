package POO.Composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        
        compra1.cliente = "UserTeste";
        compra2.cliente = "UserTeste2";

        compra1.AddItens("Caneta", 10, 2.50);
        compra1.AddItens("Lapis", 6, 1.75);

        compra2.AddItens("Caneta", 20, 2.50);
        compra2.AddItens("Lapis", 10, 1.75);

        // System.out.println(compra1.ObterValor());

        // Relação Bidirecional
        double total = compra2.Itens.get(0).Compra.Itens.get(1).Compra.ObterValor();
        System.out.println(total);
    }
}
