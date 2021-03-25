package DAO;

import java.sql.*;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends ExecuteSQL{

    public ClienteDAO (Connection con){
        super (con);
    }
    
    public String Inserir_Cliente(Cliente a){
        String sql = "insert into cliente values(?,?,?,?,?,0,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getCpf_cliente());
            ps.setString(2, a.getNome_cliente());
            ps.setString(3, a.getRg_cliente());
            ps.setString(4, a.getTelefone_cliente());
            ps.setString(5, a.getRua_cliente());
            ps.setInt(6, a.getNumero_cliente());
            ps.setString(7, a.getBairro_cliente());
            ps.setString(8, a.getCidade_cliente());
            ps.setString(9, a.getCep_cliente());
            ps.setString(10, a.getEmail_cliente());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso!";
            } else{
                return "Erro ao inserir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public List<Cliente> ListarCliente(){
        String sql = "select nome_cliente, cpf_cliente, rg_cliente, telefone_cliente, rua_cliente, numero_cliente, bairro_cliente, cidade_cliente, cep_cliente from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Cliente c = new Cliente();
                    c.setNome_cliente(rs.getString(1));
                    c.setCpf_cliente(rs.getString(2));
                    c.setRg_cliente(rs.getString(3));
                    c.setTelefone_cliente(rs.getString(4));
                    c.setRua_cliente(rs.getString(5));
                    c.setNumero_cliente(rs.getShort(6));
                    c.setBairro_cliente(rs.getString(7));
                    c.setCidade_cliente(rs.getString(8));
                    c.setCep_cliente(rs.getString(9));
                    
                    lista.add(c);
                }
                return lista;
            } else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<Cliente> Perquisar_Nome_Cliente(String nome_cliente){
        String sql = "select nome_cliente, cpf_cliente, rg_cliente, telefone_cliente from cliente where nome_cliente Like'"+nome_cliente+"%'";
                List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Cliente c = new Cliente();
                    c.setNome_cliente(rs.getString(1));
                    c.setCpf_cliente(rs.getString(2));
                    c.setRg_cliente(rs.getString(3));
                    c.setTelefone_cliente(rs.getString(4));
                    
                    lista.add(c);
                }
                return lista;
            } else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
        public List<Cliente> Perquisar_CPF_Cliente(String cpf_cliente){
        String sql = "select nome_cliente, cpf_cliente, rg_cliente, telefone_cliente from cliente where cpf_cliente Like'"+cpf_cliente+"%'";
                List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Cliente c = new Cliente();
                    c.setNome_cliente(rs.getString(1));
                    c.setCpf_cliente(rs.getString(2));
                    c.setRg_cliente(rs.getString(3));
                    c.setTelefone_cliente(rs.getString(4));
                    
                    lista.add(c);
                }
                return lista;
            } else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}