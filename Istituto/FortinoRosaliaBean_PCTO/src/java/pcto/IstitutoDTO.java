package pcto;

import java.io.Serializable;

public class IstitutoDTO implements Serializable {
    private int id;
    private int studentiAmmessi;

    public IstitutoDTO(int id, int studentiAmmessi) {
        this.id = id;
        this.studentiAmmessi = studentiAmmessi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentiAmmessi() {
        return studentiAmmessi;
    }

    public void setStudentiAmmessi(int studentiAmmessi) {
        this.studentiAmmessi = studentiAmmessi;
    }
}
