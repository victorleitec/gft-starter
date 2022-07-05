package quarto;

public class Normal extends Ingresso {

    @Override
    public void imprimeValor(double valorAdicional) {
        System.out.println("Ingresso Normal");
        super.imprimeValor(0);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }
}
