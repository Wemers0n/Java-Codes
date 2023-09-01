package POO.Heranca;

public class Carro implements Luxo {
    String nome;
    private int ano;
    boolean ligarAr;

    Carro(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", ano=" + ano + ", ligarAr=" + ligarAr + "]";
    }

    public void Acelerar(){
        System.out.println(nome + " Andando");
    }

    public void Frear(){
        System.out.println(nome + " Parado");
    }

    @Override
    public void LigarArC() {
        ligarAr = true;
    }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

}
