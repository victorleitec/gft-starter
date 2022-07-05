package quarto;

public class CamaroteSuperior extends Vip {
    public static void main(String[] args) {
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        camaroteSuperior.imprimeValor(100);
    }
    private String localizacao = "Camarote Superior";

    @Override
    public void imprimeValor(double valorAdicional) {
        super.imprimeValor(valorAdicional);
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
