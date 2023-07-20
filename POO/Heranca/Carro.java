package POO.Heranca;

public class Carro {
    String nome;
    private int ano;

    Carro(String nome){
        this.nome = nome;
    }

    void Acelerar(){
        System.out.println(nome + " Andando");
    }

    void Frear(){
        System.out.println(nome + " Parado");
    }

    int getAno(){ return ano; }
    void setAno(int ano){ this.ano = ano; }
}
