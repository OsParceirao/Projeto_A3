package com.moneycontrol.mavenproject1.DTO;

public class AdminDTO {

    private int id;
    private String usuarioAdmin;
    private String senhaAdmin;
    private AdminDTO id_usuario;

    public AdminDTO getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(AdminDTO id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

}
