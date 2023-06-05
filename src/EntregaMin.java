import java.util.Scanner;
import java.util.Random;

public class EntregaMin {

    // - Sistema sorteia
    // - Faz as comparações
    // - Exibe a pontuação

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Boas-vindas! Vamos jogar? Eu irei pensar em um número aleatório entre 0 e 10 e você tem que advinhá-lo!" +
                " Acha que consegue? Vamos tentar!");

        Random aleatorio = new Random();

        int numeroAleat = aleatorio.nextInt(11);

        System.out.println("Já escolhi o meu número!");
        System.out.println("Qual você acha que é o número que eu pensei?");
        int numero = resp.nextInt();

        System.out.println("Você disse o número: " + numero);
        System.out.println("O número que pensei foi o: " + numeroAleat);

        if (numero == numeroAleat){
            System.out.println("Parabéns! Você acertou! Tome aqui 10 pontos!");
            System.out.println("Sua pontuação final é: 10 pontos!");
        } if (((numero + 1) == numeroAleat) || ((numero - 1) == numeroAleat)){
            System.out.println("Faltou muito pouco! Mas tudo bem! Toma aqui 5 pontos!");
            System.out.println("Sua pontuação final é: 5 pontos!");
        } else if (numero != numeroAleat){
            System.out.println("Sinto muito! Não foi dessa vez! Boa sorte na próxima!");
        }
    }
}
