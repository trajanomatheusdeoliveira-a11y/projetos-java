import java.util.*;
import java.lang.*;
import java.io.*;

// testar no onlinegb ou em algum progrma em tempo real
class Main {
    public static void main(String[] args) {
        System.out.println("jogo de adivinhção");
        Random gerador = new Random();
        int rand = gerador.nextInt(10) + 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("vou pensar em um numero de 1 a 10 e você deve adivinhar");
        while (true) {
        System.out.println("digite a sua suposição");
        int num = teclado.nextInt();
            if (num == rand) {
                //System.out.printf("o numero certo é %/",rand);
                System.out.println("você venceu o jogo parabens");
                break;
            } 
            else {
                System.out.println("você errou");
            }
        }
    }
}