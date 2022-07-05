package quarto;

public class Ingresso {
    private double valor = 100;

    public void imprimeValor(double valorAdicional) {
        System.out.println("Valor: R$" + valor + valorAdicional);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
