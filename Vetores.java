public class Vetores {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        // Atribuindo valores ao vetor
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        // Acessando elementos do vetor
        System.out.println(vetor[0]); // Saída: 1
        System.out.println(vetor[2]); // Saída: 3
        System.out.println(vetor[4]); // Saída: 5

        // Iterando sobre os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
