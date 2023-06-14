package com.moneycontrol.mavenproject1.DAO;

//importando biblioecas que vão fazer a conexão com o banco
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "";
    private String host = "127.0.0.1";
    private String porta = "3306";
    private String bd = "money_control";

//conectando
    public Connection obtemConexao() {
        try
        {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return conn;
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
