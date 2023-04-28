package controle;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int numero = random.nextInt(100);
        int palpite = 0;

        System.out.println("Acerte o número de 0 a 100 em 10 palpites!!!");

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.printf("Tentativa %d: ", i);
                palpite = scan.nextInt();
            if (palpite < 0 || palpite > 100) {
                System.out.println("Palpite inválido. Tente novamente.");
                i--;
                continue;
            }
            if (palpite == numero) {
                System.out.printf("Acertou!!! Precisou de %d tentativas!", i);
                break;
            } else if (palpite < numero) {
                System.out.println("Mais!");
            } else {
                System.out.println("Menos!");
            }
            } catch (InputMismatchException ex) {
                System.out.println("Erro. Digite um número inteiro!");
                scan.nextLine();
                i--;
            }
        }
        if (palpite != numero) {
            System.out.println("Errou!!! A resposta era: " + numero);
        }
    }
}

