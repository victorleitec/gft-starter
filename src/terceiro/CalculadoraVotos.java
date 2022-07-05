package terceiro;

import java.util.Scanner;

public class CalculadoraVotos {
    public static void main(String[] args) {
        urna();
    }

    public static void urna() {
        Scanner scanner = new Scanner(System.in);

        int totalCandidato1 = 0;
        int totalCandidato2 = 0;
        int totalCandidato3 = 0;
        int totalCandidato4 = 0;
        int totalNulo = 0;
        int totalBranco = 0;
        int totalVotos = 0;

        try {

            boolean finalizado = false;
            while (!finalizado) {

                System.out.println("--- SELECIONE UMA OPÇÃO ---");
                System.out.println("1 - Para votar no candidato 1");
                System.out.println("2 - Para votar no candidato 2");
                System.out.println("3 - Para votar no candidato 3");
                System.out.println("4 - Para votar no candidato 4");
                System.out.println("5 - Para votar nulo");
                System.out.println("6 - Para votar em branco");
                System.out.println("0 - Para finalizar");
                System.out.print("Digite a opção desejada: ");
                int opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:
                        System.out.println("Você votou no candidato 1");
                        totalCandidato1++;
                        totalVotos++;
                        break;
                    case 2:
                        System.out.println("Você votou no candidato 2");
                        totalCandidato2++;
                        totalVotos++;
                        break;
                    case 3:
                        System.out.println("Você votou no candidato 3");
                        totalCandidato3++;
                        totalVotos++;
                        break;
                    case 4:
                        System.out.println("Você votou no candidato 4");
                        totalCandidato4++;
                        totalVotos++;
                        break;
                    case 5:
                        System.out.println("Você votou nulo");
                        totalNulo++;
                        totalVotos++;
                        break;
                    case 6:
                        System.out.println("Você votou em branco");
                        totalBranco++;
                        totalVotos++;
                        break;
                    case 0:
                        finalizado = true;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado, tente novamente!");
        }


        if (totalVotos > 0) {
            System.out.println("Total de votos do candidato 1: " + totalCandidato1);
            System.out.println("Total de votos do candidato 2: " + totalCandidato2);
            System.out.println("Total de votos do candidato 3: " + totalCandidato3);
            System.out.println("Total de votos do candidato 4: " + totalCandidato4);
            System.out.println("Total de votos nulos: " + totalNulo);
            System.out.println("Total de votos em branco: " + totalBranco);
            System.out.println("Porcentagem de votos nulos: " + (totalNulo * 100) / totalVotos + "%");
            System.out.println("Porcentagem de votos em branco: " + (totalBranco * 100) / totalVotos + "%");
        } else {
            System.out.println("Não houve votos");
        }
    }
}