package quarto;

public class Vip extends Ingresso {

    private double valorAdicional = 100;

    @Override
    public void imprimeValor(double valorAdicionalTipo) {
        super.imprimeValor(valorAdicional + valorAdicionalTipo);
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
