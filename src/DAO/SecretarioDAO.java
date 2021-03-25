package DAO;

import java.sql.*;
import Modelo.Secretario;

public class SecretarioDAO extends ExecuteSQL{
    
    public SecretarioDAO(Connection con){
        super (con);
    }
    
    public String Inserir_Secretario(Secretario s){
        String sql = "insert into sec values(?,?,?,?,?,?,?,0,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, s.getLogin_sec());
            ps.setString(2, s.getSenha_sec());
            ps.setString(3, s.getNome_sec());
            ps.setString(4, s.getCpf_sec());
            ps.setString(5, s.getRg_sec());
            ps.setString(6, s.getRua_sec());
            ps.setString(7, s.getBairro_sec());
            ps.setInt(8, s.getNumero_sec());
            ps.setString(9, s.getCidade_sec());
            ps.setString(10, s.getTelefone_sec());
            ps.setString(11, s.getCep_sec());
            ps.setString(12, s.getTipo_sec());
            ps.setString(13, s.getEmail_sec());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso!";
            } else{
                return "Erro ao inserir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public boolean Logar(String login_sec, String senha_sec, String tipo_sec){
        boolean finalR = false;
        try {
            String Consulta = "select login_sec, senha_sec, tipo_sec from sec where login_sec = '"+ login_sec +"' and senha_sec = '"+ senha_sec +"' and tipo_sec = '"+ tipo_sec+"'";
            PreparedStatement ps = getCon().prepareStatement(Consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    Secretario sec = new Secretario();
                    sec.setLogin_sec(rs.getString(1));
                    sec.setSenha_sec(rs.getString(2));
                    sec.setTipo_sec(rs.getString(3));
                    finalR = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalR;
    }
}
