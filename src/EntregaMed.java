import java.util.Random;
import java.util.Scanner;

public class EntregaMed {

    // - Jogar mais de uma vez
    // - Soma as pontuações

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Boas-vindas! Vamos jogar? Eu irei pensar em um número aleatório entre 0 e 10 e você tem que advinhá-lo!" +
                " Acha que consegue? Vamos tentar!");

        System.out.println("Selecione quantos turnos você quer:");
        int turnos = resp.nextInt();

        System.out.println("Você pediu por " + turnos + " turno(s)! Vamos jogar!");

        System.out.println("----------");

        Random aleatorio = new Random();

        int pontos = 0;

        for (int turno = 1; turno <= turnos; turno++){
            System.out.println("Esse é o " + turno + "º turno!");

            int numeroAleat = aleatorio.nextInt(11);

            System.out.println("Já escolhi o meu número!");
            System.out.println("Qual você acha que é o número que eu pensei?");
            int numero = resp.nextInt();

            System.out.println("Você disse o número: " + numero);
            System.out.println("O número que pensei foi o: " + numeroAleat);

            if (numero == numeroAleat){
                System.out.println("Parabéns! Você acertou! Tome aqui 10 pontos!");
                pontos = pontos + 10;
                System.out.println("----------");
            } if (((numero + 1) == numeroAleat) || ((numero - 1) == numeroAleat)){
                System.out.println("Faltou muito pouco! Mas tudo bem! Toma aqui 5 pontos!");
                pontos = pontos + 5;
                System.out.println("----------");
            } else if (numero != numeroAleat) {
                System.out.println("Sinto muito! Não foi dessa vez! Boa sorte na próxima!");
                pontos = pontos + 0;
                System.out.println("----------");
            }
        }

        System.out.println("Seus turnos acabaram!");
        System.out.println("Sua pontuação final é: " + pontos);
    }
}
