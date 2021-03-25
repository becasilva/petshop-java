package DAO;

import java.sql.*;
import Modelo.ADM;

public class ADMDAO extends ExecuteSQL{
    
    public ADMDAO (Connection con){
        super (con);
    }
    
    public boolean Logar(String login_adm, String senha_adm, String tipo_adm){
        boolean finalR = false;
        try {
            String consulta = "select login_adm, senha_adm, tipo_adm from adm where login_adm = '"+ login_adm +"' and senha_adm = '"+ senha_adm +"' and tipo_adm = '"+ tipo_adm +"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while(rs.next()){
                    ADM adm = new ADM();
                    adm.setLogin_adm(rs.getString(1));
                    adm.setSenha_adm(rs.getString(2));
                    adm.setTipo_adm(rs.getString(3));
                    finalR = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalR;
    }
}
