package primerio;

import java.util.Scanner;

public class CalculadoraEscola {

    public static void main(String[] args) {
        calcularAprovacao();
    }

    public static double calcularAprovacaoMedia(double somaNotas) {
        return somaNotas / 3;
    }

    public static double calcularAprovacaoFrequencia(double aulasFrequentadas, double aulasTotais) {
        return (aulasFrequentadas / aulasTotais) * 100;
    }

    public static void calcularAprovacao() {
        Scanner scanner = new Scanner(System.in);

        int totalAprovado = 0;
        int totalReprovado = 0;

        double reprovadoFrequencia = 0;
        double maiorNota = 0;
        double menorNota = 0;

        double somaNotas = 0;
        double aulasFrequentadas = 0;
        double aulasTotais = 0;

        try {
            System.out.print("Número de aulas totais: ");
            aulasTotais = scanner.nextInt();

            for (int i = 1; i <= 5; i++) {
                System.out.print("Número da matrícula do aluno " + i + ": ");
                String matricula = scanner.next();
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Nota " + j + ": ");
                    double nota = scanner.nextDouble();
                    somaNotas += nota;
                    if (nota > maiorNota) {
                        maiorNota = nota;
                    }
                    if (nota < menorNota) {
                        menorNota = nota;
                    }
                }
                do {
                    System.out.print("Aulas frequentadas: ");
                    aulasFrequentadas = scanner.nextDouble();

                    if (aulasFrequentadas > aulasTotais)
                        System.out.println("O número de aulas frequentadas não pode ser maior que o total de aulas!");
                }
                while (aulasFrequentadas > aulasTotais);
                double media = calcularAprovacaoMedia(somaNotas);
                double frequencia = calcularAprovacaoFrequencia(aulasFrequentadas, aulasTotais);
                if (frequencia < 75) {
                    reprovadoFrequencia++;
                }

                if (media >= 7 && frequencia >= 75) {
                    System.out.printf("Mátricula: %s - Aprovado com média %.2f - Frequência %.2f%%\n", matricula, media, frequencia);
                    somaNotas = 0;
                    totalAprovado++;
                } else {
                    System.out.printf("Mátricula: %s - Média %.2f - Frequência %.2f%%\n", matricula, media, frequencia);
                    if (media >= 7 && frequencia < 75) {
                        System.out.printf("Reprovado por frequência\n");
                    } else if (media <= 7 && frequencia >= 75) {
                        System.out.printf("Reprovado por média\n");
                    } else {
                        System.out.printf("Reprovado por média e frequência\n");
                    }
                    somaNotas = 0;
                    totalReprovado++;
                }
            }
            System.out.println("A maior nota da turma foi: " + maiorNota);
            System.out.println("Total de alunos aprovados: " + totalAprovado);
            System.out.println("Total de alunos reprovados: " + totalReprovado);
            System.out.println("Porcentagem de alunos reprovados por frequência: " + reprovadoFrequencia / 5 * 100 + "%");
        } catch (Exception e) {
            System.out.println("Algo deu errado!");
        }
    }
}

