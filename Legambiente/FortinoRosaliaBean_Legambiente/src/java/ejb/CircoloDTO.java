package ejb;

import java.io.Serializable;

public class CircoloDTO implements Serializable {
    private int id;
    private String nome;
    private String responsabile;

    public CircoloDTO(int id, String nome, String responsabile) {
        this.id = id;
        this.nome = nome;
        this.responsabile = responsabile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }
}
