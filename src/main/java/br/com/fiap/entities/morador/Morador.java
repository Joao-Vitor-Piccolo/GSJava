package br.com.fiap.entities.morador;

public class Morador {
    private int id;
    private String nome;
    private String telefone;
    private String rua;
    private String numero;
    private String quarteirao;

    public Morador() {
    }

    public Morador(String nome, String telefone, String rua, String numero, String quarteirao) {
        this(0, nome, telefone, rua, numero, quarteirao);
    }

    public Morador(int id, String nome, String telefone, String rua, String numero, String quarteirao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.quarteirao = quarteirao;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }
}
