package br.com.digitalhouse;

import java.util.Date;

public class Cheque {

    private Float  valor;
    private String bancoEmissor;
    private Date   dataPagamento;

    //Construtor Padrão
    public Cheque( Float  valor,
                   String bancoEmissor,
                   Date   dataPagamento){

        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagamento = dataPagamento;

    }

    //Construtor
    public Cheque(){

    }

    //Getter and Setter
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
