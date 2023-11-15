package Basico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JogoSenhaa {
    private final List<Integer> senha;
    private int contadorPesquisa;

    public JogoSenhaa() {
        senha = gerarSenha();
        contadorPesquisa = 0;
    }

    private List<Integer> gerarSenha() {
        Set<Integer> valoresUnicos = new HashSet<>();
        Random random = new Random();

        while (valoresUnicos.size() < 30) {
            int numero = random.nextInt(100) + 1;
            valoresUnicos.add(numero);
        }

        return new ArrayList<>(valoresUnicos);
    }

    public int realizarTentativa(int[] palpite) {
        contadorPesquisa += palpite.length;

        Set<Integer> senhaSet = new HashSet<>(senha);
        int acertos = 0;

        for (int num : palpite) {
            if (senhaSet.contains(num)) {
                acertos++;
            }
        }
        return acertos;
    }

    public int[] realizarTentativa() {
        Scanner scanner = new Scanner(System.in);
        int[] palpite = new int[5];

        System.out.println("Digite 5 números separados por espaço: ");

        for (int i = 0; i < 5; i++) {
            palpite[i] = scanner.nextInt();
        }
        return palpite;
    }

    public String getSenha() {
        if (senha.size() == 30) {
            return senha.toString();
        } else {
            return "A senha ainda não foi gerada";
        }
    }

    public int getContadorPesquisa() {
        return contadorPesquisa;
    }

    public static void main(String[] args) {
        JogoSenhaa jogo = new JogoSenhaa();
        int tentativas = 0;

        while (tentativas <= 5) {
            int[] palpite = jogo.realizarTentativa();
            int acertos = jogo.realizarTentativa(palpite);
            tentativas++;

            if (acertos == 5) {
                System.out.println("Senha Descoberta!");
                System.out.println("Senha: " + jogo.getSenha());
                break;
            } else if (tentativas == 5) {
                System.out.println("Numero de tentativas acabou. Tente novamente!");
                System.out.println("Senha: "+ jogo.getSenha());
            } else {
                System.out.println("Tentativa: " + tentativas + "\nAcertos: " + acertos);
            }
        }
        System.out.println("Número total de comparações: " + jogo.getContadorPesquisa());
    }
}