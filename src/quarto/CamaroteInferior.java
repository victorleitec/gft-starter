package quarto;

public class CamaroteInferior extends Vip{
    public static void main(String[] args) {
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.imprimeValor(100);
        camaroteInferior.imprimeLocalizacao();
    }

    private String localizacao = "Camarote Inferior";

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
