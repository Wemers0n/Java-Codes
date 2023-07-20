package POO.Composicao.Desafio;

import java.util.ArrayList;

public class Cliente {
    String nomeCliente;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    void addCompras(Compra c){
        this.compras.add(c);
    }

    double ValorTotal(){
        double total = 0;

        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
