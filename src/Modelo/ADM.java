package Modelo;

/**
 * @author eeep Rebeca, Vittor e Davi;
 */

public class ADM {
    private String nome_adm;
    private String cpf_adm;
    private String rg_adm;
    private String rua_adm;
    private String bairro_adm;
    private int numero_adm;
    private String cidade_adm;
    private String telefone_adm;
    private String tipo_adm;
    private String login_adm;
    private String senha_adm;
    private String email_adm;

    public ADM(String nome_adm, String cpf_adm, String rg_adm, String rua_adm, String bairro_adm, int numero_adm, String cidade_adm, String telefone_adm, String tipo, String login_adm, String senha_adm, String email_adm) {
        this.nome_adm = nome_adm;
        this.cpf_adm = cpf_adm;
        this.rg_adm = rg_adm;
        this.rua_adm = rua_adm;
        this.bairro_adm = bairro_adm;
        this.numero_adm = numero_adm;
        this.cidade_adm = cidade_adm;
        this.telefone_adm = telefone_adm;
        this.tipo_adm = tipo;
        this.login_adm = login_adm;
        this.senha_adm = senha_adm;
        this.email_adm = email_adm;
    }

    public ADM() {
        this.nome_adm = "";
        this.cpf_adm = "";
        this.rg_adm = "";
        this.rua_adm = "";
        this.bairro_adm = "";
        this.numero_adm = 0;
        this.cidade_adm = "";
        this.telefone_adm = "";
        this.tipo_adm = "";
        this.login_adm = "";
        this.senha_adm = "";
        this.email_adm = "";
    }

    
    public String getNome_adm() {
        return nome_adm;
    }

    public void setNome_adm(String nome_adm) {
        this.nome_adm = nome_adm;
    }

    public String getCpf_adm() {
        return cpf_adm;
    }

    public void setCpf_adm(String cpf_adm) {
        this.cpf_adm = cpf_adm;
    }

    public String getRg_adm() {
        return rg_adm;
    }

    public void setRg_adm(String rg_adm) {
        this.rg_adm = rg_adm;
    }

    public String getRua_adm() {
        return rua_adm;
    }

    public void setRua_adm(String rua_adm) {
        this.rua_adm = rua_adm;
    }

    public String getBairro_adm() {
        return bairro_adm;
    }

    public void setBairro_adm(String bairro_adm) {
        this.bairro_adm = bairro_adm;
    }

    public int getNumero_adm() {
        return numero_adm;
    }

    public void setNumero_adm(int numero_adm) {
        this.numero_adm = numero_adm;
    }

    public String getCidade_adm() {
        return cidade_adm;
    }

    public void setCidade_adm(String cidade_adm) {
        this.cidade_adm = cidade_adm;
    }

    public String getTelefone_adm() {
        return telefone_adm;
    }

    public void setTelefone_adm(String telefone_adm) {
        this.telefone_adm = telefone_adm;
    }

    public String getTipo_adm() {
        return tipo_adm;
    }

    public void setTipo_adm(String tipo_adm) {
        this.tipo_adm = tipo_adm;
    }

    public String getLogin_adm() {
        return login_adm;
    }

    public void setLogin_adm(String login_adm) {
        this.login_adm = login_adm;
    }

    public String getSenha_adm() {
        return senha_adm;
    }

    public void setSenha_adm(String senha_adm) {
        this.senha_adm = senha_adm;
    } 

    public String getEmail_adm() {
        return email_adm;
    }

    public void setEmail_adm(String email_adm) {
        this.email_adm = email_adm;
    }
    
}
