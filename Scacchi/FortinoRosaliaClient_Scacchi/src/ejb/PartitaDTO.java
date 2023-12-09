package ejb;

import java.io.Serializable;

public class PartitaDTO implements Serializable {
    private int id;
    private String mosse;
    private String risultato;

    public PartitaDTO(int id, String mosse, String risultato) {
        this.id = id;
        this.mosse = mosse;
        this.risultato = risultato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMosse() {
        return mosse;
    }

    public void setMosse(String mosse) {
        this.mosse = mosse;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }
}
