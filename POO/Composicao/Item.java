package POO.Composicao;

public class Item {
    String nome;
    int Qtd;
    double preco;
    public Compra Compra;

    Item(String nome, int Qtd, double preco){
        this.nome = nome;
        this.Qtd = Qtd;
        this.preco = preco;
    }
}
