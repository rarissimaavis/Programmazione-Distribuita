package babbonatale;

import java.io.Serializable;

public class BambinoDTO implements Serializable {
    private int id;
    private String stato;

    public BambinoDTO(int id, String stato) {
        this.id = id;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public String getStato() {
        return stato;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
