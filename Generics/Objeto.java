package Generics;

public class Objeto<T>{
    private T coisa;

    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return coisa;
    }
}
