package br.com.fiap.entities.relato;

public class Relato {
    private int id;
    private Integer fk_morador;
    private String tipo;
    private String local;
    private String status;

    public Relato() {
    }

    public Relato(Integer fk_morador, String tipo, String local, String status) {
        this(0, fk_morador, tipo, local, status);
    }

    public Relato(int id, Integer fk_morador, String tipo, String local, String status) {
        this.id = id;
        this.fk_morador = fk_morador;
        this.tipo = tipo;
        this.local = local;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getFk_morador() {
        return fk_morador;
    }

    public void setFk_morador(Integer fk_morador) {
        this.fk_morador = fk_morador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
