package darthorg.com.horarioonibus.model;

/**
 * Created by Gustavo on 16/03/2016.
 */
public class Linha {
    private String numeroLinha;
    private String tipoLinha;
    private String nomeLinha;

    public Linha(String numeroLinha, String tipoLinha, String nomeLinha) {
        this.numeroLinha = numeroLinha;
        this.tipoLinha = tipoLinha;
        this.nomeLinha = nomeLinha;
    }

    public String getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(String numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public String getTipoLinha() {
        return tipoLinha;
    }

    public void setTipoLinha(String tipoLinha) {
        this.tipoLinha = tipoLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }
}
