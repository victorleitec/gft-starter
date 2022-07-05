package segundo;

import java.util.Scanner;

public class CalculadoraPrecoCarro {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean finalizado = false;
        while (!finalizado) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o valor do carro: ");
                double valorCarro = scanner.nextDouble();
                System.out.println("--- SELECIONE UMA OPÇÃO ---");
                System.out.println("1 - 6x");
                System.out.println("2 - 12x");
                System.out.println("3 - 18x");
                System.out.println("4 - 24x");
                System.out.println("5 - 30x");
                System.out.println("6 - à vista");
                int opcao = scanner.nextInt();
                menuParcelas(valorCarro, opcao);
                System.out.println("Digite 1 para continuar ou 2 para sair: ");
                if (scanner.nextInt() == 2) {
                    finalizado = true;
                }
            } catch (Exception e) {
                System.out.println("Algo deu errado, tente novamente!");
            }
        }
    }

    public static void menuParcelas(double valorDoCarro, int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("6x de " + valorDoCarro);
                System.out.println("Valor de cada parcela: " + calcularParcelas(6, valorDoCarro));
                System.out.println("Valor final: " + calcularValorFinal(valorDoCarro, 0.03));
                break;
            case 2:
                System.out.println("12x de " + valorDoCarro);
                System.out.println("Valor de cada parcela: " + calcularParcelas(12, valorDoCarro));
                System.out.println("Valor final: " + calcularValorFinal(valorDoCarro, 0.06));
                break;
            case 3:
                System.out.println("18x de " + valorDoCarro);
                System.out.println("Valor de cada parcela: " + calcularParcelas(18, valorDoCarro));
                System.out.println("Valor final: " + calcularValorFinal(valorDoCarro, 0.09));
                break;
            case 4:
                System.out.println("24x de " + valorDoCarro);
                System.out.println("Valor de cada parcela: " + calcularParcelas(24, valorDoCarro));
                System.out.println("Valor final: " + calcularValorFinal(valorDoCarro, 0.12));
                break;
            case 5:
                System.out.println("30x de " + valorDoCarro);
                System.out.println("Valor de cada parcela: " + calcularParcelas(30, valorDoCarro));
                System.out.println("Valor final: " + calcularValorFinal(valorDoCarro, 0.15));
                break;
            case 6:
                System.out.println("Pagamento à vista: " + calcularDesconto(valorDoCarro, 0.2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static double calcularParcelas(int parcelas, double valorDoCarro) {
        return valorDoCarro / parcelas;
    }

    public static double calcularValorFinal(double valorDoCarro, double acrescimo) {
        return valorDoCarro + (valorDoCarro * acrescimo);
    }

    public static double calcularDesconto(double valorDoCarro, double desconto) {
        return valorDoCarro - (valorDoCarro * desconto);
    }
}
