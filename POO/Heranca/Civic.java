package POO.Heranca;

public class Civic extends Carro {
    int portas;

    public Civic(String nome, int potas) {
        super(nome);
        this.portas = potas;
    }  

    public String nomeCar(){
        return super.nome;
    }

    public void anoCarSet(int ano){
        super.setAno(ano);
    }
}
