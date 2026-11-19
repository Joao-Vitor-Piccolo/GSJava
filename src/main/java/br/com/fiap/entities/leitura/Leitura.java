package br.com.fiap.entities.leitura;

import java.sql.Timestamp;

public class Leitura {
    private int id;
    private String codigo;
    private Integer ovos;
    private Double nivel_agua;
    private Double temperatura;
    private Double umidade;
    private Timestamp data_hora;

    public Leitura() {
    }

    public Leitura(String codigo, Integer ovos, Double nivel_agua, Double temperatura, Double umidade,
            Timestamp data_hora) {
        this(0, codigo, ovos, nivel_agua, temperatura, umidade, data_hora);
    }

    public Leitura(int id, String codigo, Integer ovos, Double nivel_agua, Double temperatura, Double umidade,
            Timestamp data_hora) {
        this.id = id;
        this.codigo = codigo;
        this.ovos = ovos;
        this.nivel_agua = nivel_agua;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.data_hora = data_hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getOvos() {
        return ovos;
    }

    public void setOvos(Integer ovos) {
        this.ovos = ovos;
    }

    public Double getNivel_agua() {
        return nivel_agua;
    }

    public void setNivel_agua(Double nivel_agua) {
        this.nivel_agua = nivel_agua;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public Timestamp getData_hora() {
        return data_hora;
    }

    public void setData_hora(Timestamp data_hora) {
        this.data_hora = data_hora;
    }
}
