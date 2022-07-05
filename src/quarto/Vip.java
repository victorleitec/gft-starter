package quarto;

public class Vip extends Ingresso {

    private double valorAdicional;

    @Override
    public void imprimeValor(double valorAdicional) {
        super.imprimeValor(valorAdicional);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
