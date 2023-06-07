import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EntregaBonus {

    // - Printar apenas os números com resultado
    // - Adicionar modo personalizado
    // - Adicionar mensagem especial dependendo da pontuação final
    // - ASCII

    public static void main(String[] args) {
        System.out.println("Boas-vindas! Vamos jogar? Eu irei pensar em um número aleatório e você tem que advinhá-lo!" +
                    " Acha que consegue? Vamos tentar!");

        System.out.println("   _____");
        System.out.println("  | . . | ");
        System.out.println("  |  u  |");
        System.out.println("o=|_____|=b");
        System.out.println("    | |");
        System.out.println("    0 0");

        Scanner resp = new Scanner(System.in);

        int min = 0;
        int max = 0;

        System.out.println("Por favor selecione a dificuldade! (digite o número)");
        System.out.println("1) Fácil = números de 0 a 10");
        System.out.println("2) Médio = números de 0 a 100");
        System.out.println("3) Difícil = números de 0 a 1000");
        System.out.println("4) Personalizado = você decide os números!");
        int selecao = resp.nextInt();
        switch (selecao){
            case 1:
                min = 0;
                max = 10;
                System.out.println("Você selecionou o modo fácil! Essa partida será com números de 0 a 10!");
                break;
            case 2:
                min = 0;
                max = 100;
                System.out.println("Você selecionou o modo médio! Essa partida será com números de 0 a 100!");
                break;
            case 3:
                min = 0;
                max = 1000;
                System.out.println("Você selecionou o modo difícil! Essa partida será com números de 0 a 1000!");
                break;
            case 4:
                System.out.println("Por favor, diga qual o menor número possível:");
                min = resp.nextInt();
                System.out.println("Por favor, diga qual o maior número possível:");
                max = resp.nextInt();
                System.out.println("Essa partida será com números de " + min + " até " + max + "!");
                break;
            default:
                System.out.println("Seleção inválida");

        }

        int pontos = 0;

        if ((selecao == 1) || (selecao == 2) || (selecao == 3) || (selecao == 4)) {
            System.out.println("Selecione quantos turnos você quer:");
            int turnos = resp.nextInt();

            System.out.println("Você pediu por " + turnos + " turno(s)!");

            System.out.println("----------");

            List<Integer> acertos = new ArrayList<Integer>();
            List<Integer> quase = new ArrayList<Integer>();
            List<Integer> erros = new ArrayList<Integer>();

            for (int turno = 1; turno <= turnos; turno++) {
                System.out.println("Esse é o " + turno + "º turno!");

                int numeroAleat = ThreadLocalRandom.current().nextInt(min, max + 1);

                System.out.println("Já escolhi o meu número!");
                System.out.println("Qual você acha que é o número que eu pensei?");
                int numero = resp.nextInt();

                System.out.println("Você disse o número: " + numero);
                System.out.println("O número que pensei foi o: " + numeroAleat);

                if (numero == numeroAleat) {
                    System.out.println("Parabéns! Você acertou! Tome aqui 10 pontos!");
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|^ ^|");
                    System.out.println("| u |");
                    System.out.println("|___|");
                    pontos = pontos + 10;
                    acertos.add(numeroAleat);
                    System.out.println("----------");
                }
                if (((numero + 1) == numeroAleat) || ((numero - 1) == numeroAleat)) {
                    System.out.println("Faltou muito pouco! Mas tudo bem! Toma aqui 5 pontos!");
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|. .|");
                    System.out.println("| v |");
                    System.out.println("|___|");
                    pontos = pontos + 5;
                    quase.add(numeroAleat);
                    System.out.println("----------");
                } if ((numero != numeroAleat) && ((numero + 1) != numeroAleat) && ((numero - 1) != numeroAleat)) {
                    System.out.println("Sinto muito! Não foi dessa vez! Boa sorte na próxima!");
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|T T|");
                    System.out.println("| - |");
                    System.out.println("|___|");
                    pontos = pontos + 0;
                    erros.add(numeroAleat);
                    System.out.println("----------");
                }
            }

            System.out.println("Seus turnos acabaram!");
            System.out.println("----------");

            Iterator<Integer> iterator1 = acertos.iterator();
            if (iterator1.hasNext()) {
                System.out.println("Você acertou os números:");
                while (iterator1.hasNext()) {
                    System.out.println(iterator1.next());
                }
            }

            Iterator<Integer> iterator2 = quase.iterator();
            if (iterator2.hasNext()) {
                System.out.println("Você quase acertou os números:");
                while (iterator2.hasNext()) {
                    System.out.println(iterator2.next());
                }
            }

            Iterator<Integer> iterator3 = erros.iterator();
            if (iterator3.hasNext()) {
                System.out.println("Você errou os números:");
                while (iterator3.hasNext()) {
                    System.out.println(iterator3.next());
                }
            }

            System.out.println("----------");

            System.out.println("Sua pontuação final é: " + pontos + " pontos!");

            if (pontos == turnos*10){
                System.out.println("Maravilhoso! Você é incrível!");
            } if ((pontos < turnos*10) && (pontos > (turnos*10)/2)){
                System.out.println("Que legal! Parabéns!");
            } if ((pontos < (turnos*10)/2) && (pontos != 0)){
                System.out.println("Boa!");
            } if (pontos == 0){
                System.out.println("Ai...");
            }
        }
    }
}
