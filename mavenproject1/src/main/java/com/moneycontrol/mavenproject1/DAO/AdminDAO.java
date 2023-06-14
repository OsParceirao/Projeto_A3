package com.moneycontrol.mavenproject1.DAO;

import com.moneycontrol.mavenproject1.DTO.AdminDTO;
import com.moneycontrol.mavenproject1.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AdminDAO {

    Connection conn = new ConnectionFactory().obtemConexao();
    String query;
    //method de autentificação de admin

    public ResultSet autentificacaoAdmin(AdminDTO adminDTO) {
        try
        {
            query = "SELECT * FROM tb_admin WHERE usuario = ? AND senha = ?;";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, adminDTO.getUsuarioAdmin());
            stmt.setString(2, adminDTO.getSenhaAdmin());

            //executrando query
            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "erro de login admin" + erro);
            return null;
        }
    }

    //metodo de exclusao de usuario    
    public void excluiUsuario(AdminDTO adminDTO) {

        try
        {
            //tentando ação em banco
            query = "delete from tb_usuarios where id =  ?;";

            //compilando query
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, adminDTO.getId());

            //executando query
            stmt.execute();

        } catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);

        }
    }

    //methos de tirar relatorio de despesas
    public List<AdminDTO> tirarRelatorioUsuario(String nomeUsuario) {

        //query que vai executar a ação
        query = "SELECT * FROM tb_usuarios WHERE usuario LIKE ? ;";

        //tentando execução
        try
        {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + nomeUsuario + "%");
            ResultSet rs = stmt.executeQuery();

            //criando array list para setar depois na tabela
            List<AdminDTO> relatorioUsuario = new ArrayList<>();
            while (rs.next())
            {

                //gerando array
                AdminDTO adminDTO = new AdminDTO();
                adminDTO.setId(rs.getInt("id"));
                adminDTO.setUsuarioAdmin(rs.getString("usuario"));
                adminDTO.setSenhaAdmin(rs.getString("senha"));

                //salvando todos os itens do array numa variavel
                relatorioUsuario.add(adminDTO);

            }
            return relatorioUsuario;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);
            return null;

        }
    }

    // method de autentificação de usuário     
    public ResultSet autentificacaoUsuario(UsuarioDTO userDTO) {

        //tentando executar ação de verificação no banco
        try
        {
            //query sql que vaii fazer a ação no banco
            String query = "select * from tb_usuarios where usuario =  ? and senha =  ?";

            //compilando campos que vao inserir os dados
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, userDTO.getNome_usuario());
            stmt.setString(2, userDTO.getSenha_usuario());

            //execuando query
            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);
            return null;
        }
    }

    //method de editar usuario
    public void editarUsuario(AdminDTO adminDTO) {

        //query que vai executar açãono banco de dados
        query = "update tb_usuarios set usuario = ?,senha = ? where id = ?;";
        try
        {

            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, adminDTO.getUsuarioAdmin());
            stmt.setString(2, adminDTO.getSenhaAdmin());
            stmt.setInt(3, adminDTO.getId());

            stmt.execute();

        } catch (SQLException erro)
        {

            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);

        }
    }

    //method de criar novo usuario
    public void cadastraUsuario(UsuarioDTO userDTO) {
        //tentando ação em banco de dados
        try
        {
            query = "insert into tb_usuarios(usuario,senha) values(?,?)";

            //complando prepared statements
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, userDTO.getNome_usuario());
            stmt.setString(2, userDTO.getSenha_usuario());
            //stmt.setInt(3,userDTO.getId_despesa().getId());

            stmt.execute();

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);

        }
    }

    //method para pesquisar despesa
    public AdminDTO pesquisaUsuario(int id) {
        try
        {
            query = "select * from tb_usuarios where id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            AdminDTO adminDTO = new AdminDTO();

            //passando as informações do resultSet para os campos 
            rs.first();
            //jogando o resultado pra dentro da variavel curso
            adminDTO.setId(id);
            adminDTO.setUsuarioAdmin(rs.getNString("usuario"));
            adminDTO.setSenhaAdmin(rs.getString("senha"));

            return adminDTO;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "AdminDAO erro: " + erro);

        }
        return null;

    }

}
