package Basico;

public class Repeticao_While {
    public static void main(String[] args) {
        int i = 1;

        while(i != 0){
            System.out.println(i++);

            if(i == 10){
                break;
            }
        }
    }
}
