package POO.Composicao.Desafio;

public class Item {
    int qtd;
    Produto produto;

    Item(Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }
}
