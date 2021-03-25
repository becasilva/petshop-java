package Modelo;

public class Servico {
    private int cod_serv;
    private String nome_serv;
    private double preco;
    private double desconto;
    private String indicacao;
    private String disponibilidade;

    public Servico() {
        this.cod_serv = 0;
        this.nome_serv = "";
        this.preco = 0;
        this.desconto = 0;
        this.indicacao = "";
        this.disponibilidade = "";
    }

    public Servico(int cod_serv, String nome_serv, double preco, double desconto, String indicacao, String disponibilidade) {
        this.cod_serv = cod_serv;
        this.nome_serv = nome_serv;
        this.preco = preco;
        this.desconto = desconto;
        this.indicacao = indicacao;
        this.disponibilidade = disponibilidade;
    }

    public int getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(int cod_serv) {
        this.cod_serv = cod_serv;
    }

    public String getNome_serv() {
        return nome_serv;
    }

    public void setNome_serv(String nome_serv) {
        this.nome_serv = nome_serv;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
}
