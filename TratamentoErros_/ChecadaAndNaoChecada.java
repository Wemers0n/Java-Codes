package TratamentoErros_;

public class ChecadaAndNaoChecada {
    public static void main(String[] args){

//        error1();
//        error2();

        try{
            error1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            error2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }

    }

    // Não checada ou Não verificada
    static void error1(){
        throw new RuntimeException("Error ==> RuntimeExeption");
    }

    // Checada ou Verificada
    static void error2() throws Exception{
        throw new Exception("Error ==> Exception");
    }
}
