package Basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoSenha {
    private List<Integer> senha;
    private int countPesquisa;

    public JogoSenha(){
        senha = new ArrayList<>();
        gerarSenha();
        countPesquisa = 0;
    }

    public void gerarSenha(){
        Random random = new Random();
        while (senha.size() < 30){
            int numero = random.nextInt(100) + 1;
            if(!senha.contains(numero)){
                senha.add(numero);
            }
        }
    }

    public int realizarTentativa(int[] palpite){
        int acertos = 0;
        for (int i = 0; i < palpite.length; i++){
            if(senha.contains(palpite[i])){
                acertos++;
            }
        }
        countPesquisa += palpite.length;
        return acertos;
    }

    public int realizarTentativa(){
        Scanner scanner = new Scanner(System.in);
        int[] palpite = new int[5];
        System.out.println("Digite 5 numeros separados por espaco: ");
        for (int i = 0; i < 5; i++){
            palpite[i] = scanner.nextInt();
        }
        return realizarTentativa(palpite);
    }

    public String getSenha(){
        if(senha.size() == 30){
            StringBuilder senhaStr = new StringBuilder();
            for(int num : senha){
                senhaStr.append(num).append(" ");
            }
            return senhaStr.toString();
        }
        else {
            return "A senha ainda não foi descoberta";
        }
    }

    public int Pesquisa(){
        return countPesquisa;
    }
    public static void main(String[] args) {
        JogoSenha joguino = new JogoSenha();
        int tentativas = 0;

        while(true){
            int acertos = joguino.realizarTentativa();
            tentativas++;

            if(acertos == 5){
                System.out.println("Senha Descoberta!");
                System.out.println("Senha: " + joguino.getSenha());
                break;
            }
            else {
                System.out.println("Tentativa: " + tentativas + "\nAcertos: " + acertos);
            }
        }
        System.out.println("Numero total de comparacaoes: " + joguino.Pesquisa());
    }
}