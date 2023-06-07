import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Anotacoes {

    public static void main(String[] args) {

        // Formas de fazer aleatório

        int min = 0;
        int max = 0;

        //

        Random aleatorio = new Random();
        int numeroAleat = aleatorio.nextInt(10);

        System.out.println(numeroAleat);

        //

        int randomNum = min + (int)(Math.random() * max);

        System.out.println(randomNum);

        //

        int randomNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomNum1);



    }
}
