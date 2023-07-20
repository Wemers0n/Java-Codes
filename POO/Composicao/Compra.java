package POO.Composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;

    ArrayList<Item> Itens = new ArrayList<>();

    void AddItens(String nome, int Qtd, double preco){
        this.AddItens(new Item(nome, Qtd, preco));
    }

    void AddItens(Item itens){
        this.Itens.add(itens);
        itens.Compra = this;
    }

    double ObterValor(){
        double valor = 0;

        for(Item item: Itens){
            valor += item.Qtd * item.preco;
        }
        return valor;
    }
}
