import java.util.*;

public class EntregaMax {

    // - Nível de dificuldade
    // - Números que o usuário errou e acertou

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Boas-vindas! Vamos jogar? Eu irei pensar em um número aleatório e você tem que advinhá-lo!" +
                " Acha que consegue? Vamos tentar!");

        int dificuldade = 0;

        System.out.println("Por favor selecione a dificuldade! (digite o número)");
        System.out.println("1) Fácil = números de 0 a 10");
        System.out.println("2) Médio = números de 0 a 100");
        System.out.println("3) Difícil = números de 0 a 1000");
        int selecao = resp.nextInt();
        switch (selecao){
            case 1:
                dificuldade = 11;
                break;
            case 2:
                dificuldade = 101;
                break;
            case 3:
                dificuldade = 1001;
                break;
            default:
                System.out.println("Seleção inválida");

        }

        Random aleatorio = new Random();

        int pontos = 0;
        if ((dificuldade == 11) || (dificuldade == 101) || (dificuldade == 1001)) {
            System.out.println("Selecione quantos turnos você quer:");
            int turnos = resp.nextInt();

            System.out.println("Você pediu por " + turnos + " turno(s)!");

            System.out.println("----------");

            List<Integer> acertos = new ArrayList<Integer>();
            List<Integer> quase = new ArrayList<Integer>();
            List<Integer> erros = new ArrayList<Integer>();

            for (int turno = 1; turno <= turnos; turno++) {
                System.out.println("Esse é o " + turno + "º turno!");

                int numeroAleat = aleatorio.nextInt(dificuldade);

                System.out.println("Já escolhi o meu número!");
                System.out.println("Qual você acha que é o número que eu pensei?");
                int numero = resp.nextInt();

                System.out.println("Você disse o número: " + numero);
                System.out.println("O número que pensei foi o: " + numeroAleat);

                if (numero == numeroAleat) {
                    System.out.println("Parabéns! Você acertou! Tome aqui 10 pontos!");
                    pontos = pontos + 10;
                    acertos.add(numeroAleat);
                    System.out.println("----------");
                }
                if (((numero + 1) == numeroAleat) || ((numero - 1) == numeroAleat)) {
                    System.out.println("Faltou muito pouco! Mas tudo bem! Toma aqui 5 pontos!");
                    pontos = pontos + 5;
                    quase.add(numeroAleat);
                    System.out.println("----------");
                } else {
                    System.out.println("Sinto muito! Não foi dessa vez! Boa sorte na próxima!");
                    pontos = pontos + 0;
                    erros.add(numeroAleat);
                    System.out.println("----------");
                }
            }

            System.out.println("Seus turnos acabaram!");
            System.out.println("Sua pontuação final é: " + pontos);

            System.out.println("Você acertou os números:");
            Iterator<Integer> iterator1 = acertos.iterator();
            while (iterator1.hasNext()){
                System.out.println(iterator1.next());
            }

            System.out.println("Você quase acertou os números:");
            Iterator<Integer> iterator2 = quase.iterator();
            while (iterator2.hasNext()){
                System.out.println(iterator2.next());
            }

            System.out.println("Você errou os números:");
            Iterator<Integer> iterator3 = erros.iterator();
            while (iterator3.hasNext()){
                System.out.println(iterator3.next());
            }

            System.out.println("Muito obrigado por jogar!");
        }
    }
}
