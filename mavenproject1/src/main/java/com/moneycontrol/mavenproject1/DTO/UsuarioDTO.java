package com.moneycontrol.mavenproject1.DTO;

public class UsuarioDTO {

    private int id;
    private String nome_usuario;
    private String senha_usuario;
    private ProcessDTO id_despesa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public ProcessDTO getId_despesa() {
        return id_despesa;
    }

    public void setId_despesa(ProcessDTO id_despesa) {
        this.id_despesa = id_despesa;
    }

}
