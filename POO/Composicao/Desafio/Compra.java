package POO.Composicao.Desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void addItens(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    void addItens(String nome, double preco, int qtd){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtd));
    }

    double obterValorTotal(){
        double total = 0;

        for (Item itens : itens) {
            total += itens.qtd * itens.produto.preco;
        }
        return total;
    }
}
