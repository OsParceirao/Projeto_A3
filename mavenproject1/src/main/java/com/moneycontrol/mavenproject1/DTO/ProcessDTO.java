package com.moneycontrol.mavenproject1.DTO;

public class ProcessDTO {

    private int id;
    private String agencia;
    private String conta;
    private String despesa;
    private String tipo_despesa;
    private String valor_despesa;
    private String parcelas;
    private String parcelas_pagas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDespesa() {
        return despesa;
    }

    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    public String getTipo_despesa() {
        return tipo_despesa;
    }

    public void setTipo_despesa(String tipo_despesa) {
        this.tipo_despesa = tipo_despesa;
    }

    public String getValor_despesa() {
        return valor_despesa;
    }

    public void setValor_despesa(String valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public String getParcelas_pagas() {
        return parcelas_pagas;
    }

    public void setParcelas_pagas(String parcelas_pagas) {
        this.parcelas_pagas = parcelas_pagas;
    }
}
