package com.moneycontrol.mavenproject1.DAO;

import com.moneycontrol.mavenproject1.DTO.ProcessDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProcessDAO {

    Connection conn = new ConnectionFactory().obtemConexao();
    String query;
    //method de criar um novo usuario

    //methods de editar usuario
    //methods de adição de atributos do banco de dados    
    public void cadastraDespesa(ProcessDTO processDTO) {
        //tentando ação em banco de dados
        try
        {
            query = "insert into tb_despesas(despesa,tipo_despesa,valor_despesa,parcelas,parcelas_pagas,agencia,conta) values(?,?,?,?,?,?,?)";

            //complando prepared statements
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, processDTO.getDespesa());
            stmt.setString(2, processDTO.getTipo_despesa());
            stmt.setString(3, processDTO.getValor_despesa());
            stmt.setString(4, processDTO.getParcelas());
            stmt.setString(5, processDTO.getParcelas_pagas());
            stmt.setString(6, processDTO.getAgencia());
            stmt.setString(7, processDTO.getConta());

            stmt.execute();

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "ProcessDAO erro: " + erro);

        }
    }

    //methods de exclusão de atributos do banco de dados   
    public void excluiDespesa(ProcessDTO processDTO) {

        try
        {
            //tentando ação em banco
            query = "delete from tb_despesas where id =  ?;";

            //compilando query
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, processDTO.getId());

            //executando query
            stmt.execute();

        } catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null, "ProcessDAO erro: " + erro);

        }
    }

    //method de edição de despesa    
    public void editarDespesa(ProcessDTO processDTO) {

        //query que vai executar açãono banco de dados
        query = "update tb_despesas set despesa = ?,tipo_despesa = ?,valor_despesa = ?,parcelas = ?,parcelas_pagas = ?,agencia = ?,conta = ? where id = ?";
        try
        {

            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, processDTO.getDespesa());
            stmt.setString(2, processDTO.getTipo_despesa());
            stmt.setString(3, processDTO.getValor_despesa());
            stmt.setString(4, processDTO.getParcelas());
            stmt.setString(5, processDTO.getParcelas_pagas());
            stmt.setString(6, processDTO.getAgencia());
            stmt.setString(7, processDTO.getConta());
            stmt.setInt(8, processDTO.getId());
            stmt.execute();

        } catch (SQLException erro)
        {

            JOptionPane.showMessageDialog(null, "ProcessDAO erro: " + erro);

        }
    }

    //methos de tirar relatorio de despesas
    public List<ProcessDTO> tirarRelatorio(String nomeDespesa) {

        //query que vai executar a ação
        query = "SELECT * FROM tb_despesas WHERE despesa LIKE ? ;";

        //tentando execução
        try
        {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + nomeDespesa + "%");
            ResultSet rs = stmt.executeQuery();

            //criando array list para setar depois na tabela
            List<ProcessDTO> relatorio = new ArrayList<>();
            while (rs.next())
            {

                //gerando array
                ProcessDTO processDTO = new ProcessDTO();
                processDTO.setId(rs.getInt("id"));
                processDTO.setDespesa(rs.getString("despesa"));
                processDTO.setTipo_despesa(rs.getString("tipo_despesa"));
                processDTO.setValor_despesa(rs.getString("valor_despesa"));
                processDTO.setParcelas(rs.getString("parcelas"));
                processDTO.setParcelas_pagas(rs.getString("parcelas_pagas"));
                processDTO.setAgencia(rs.getString("agencia"));
                processDTO.setConta(rs.getString("conta"));

                //salvando todos os itens do array numa variavel
                relatorio.add(processDTO);

            }
            return relatorio;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "ProcessDAO erro: " + erro);
            return null;

        }
    }

    //method para pesquisar despesa
    public ProcessDTO pesquisaDespesa(int id) {
        try
        {
            query = "select * from tb_despesas where id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            ProcessDTO processDTO = new ProcessDTO();

            //passando as informações do resultSet para os campos 
            rs.first();
            //jogando o resultado pra dentro da variavel curso
            processDTO.setId(id);
            processDTO.setDespesa(rs.getString("despesa"));
            processDTO.setTipo_despesa(rs.getString("tipo_despesa"));
            processDTO.setValor_despesa(rs.getString("valor_despesa"));
            processDTO.setParcelas(rs.getString("parcelas"));
            processDTO.setParcelas_pagas(rs.getString("parcelas_pagas"));
            processDTO.setAgencia(rs.getString("agencia"));
            processDTO.setConta(rs.getString("conta"));
            
            return processDTO;

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "DESPESA NAO ENCONTRADA!!");
            JOptionPane.showMessageDialog(null, "ProcessDAO pesquisa Despesa erro: " + erro);

        }
        return null;

    }
}
