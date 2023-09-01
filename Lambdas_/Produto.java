package Lambdas_;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
    }

    
}
