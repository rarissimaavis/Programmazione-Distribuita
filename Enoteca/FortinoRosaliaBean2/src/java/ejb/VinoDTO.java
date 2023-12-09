package ejb;

import java.io.Serializable;

public class VinoDTO implements Serializable {
    private int id;
    private int numBottiglieDisponibili;

    public VinoDTO(int id, int numBottiglieDisponibili) {
        this.id = id;
        this.numBottiglieDisponibili = numBottiglieDisponibili;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumBottiglieDisponibili() {
        return numBottiglieDisponibili;
    }

    public void setNumBottiglieDisponibili(int numBottiglieDisponibili) {
        this.numBottiglieDisponibili = numBottiglieDisponibili;
    }
}
