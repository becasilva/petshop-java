package Modelo;

public class Compra {
    private int cod_compra;
    private double total;
    private String form_pag;
    private double valor_pag;
    private double troco;
    private int cod_ani;
    private String cpf_cliente;

    public Compra() {
        this.cod_compra = 0;
        this.total = 0;
        this.form_pag = "";
        this.valor_pag = 0;
        this.troco = 0;
        this.cod_ani = 0;
        this.cpf_cliente = "";
    }

    public Compra(int cod_compra, double total, String form_pag, double valor_pag, double troco, int cod_ani, String cpf_cliente) {
        this.cod_compra = cod_compra;
        this.total = total;
        this.form_pag = form_pag;
        this.valor_pag = valor_pag;
        this.troco = troco;
        this.cod_ani = cod_ani;
        this.cpf_cliente = cpf_cliente;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getForm_pag() {
        return form_pag;
    }

    public void setForm_pag(String form_pag) {
        this.form_pag = form_pag;
    }

    public double getValor_pag() {
        return valor_pag;
    }

    public void setValor_pag(double valor_pag) {
        this.valor_pag = valor_pag;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public int getCod_ani() {
        return cod_ani;
    }

    public void setCod_ani(int cod_ani) {
        this.cod_ani = cod_ani;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
    
}
