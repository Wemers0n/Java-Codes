package TratamentoErros_;

public class Basico {

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }

    public static void main(String[] args) {
        Aluno a1 = null; // --> NullPointerException

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e){
            System.out.println("Erro ao imprimir nome do ususario");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Fim");
    }
}
