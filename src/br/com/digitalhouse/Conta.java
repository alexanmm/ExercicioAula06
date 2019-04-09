package br.com.digitalhouse;

public abstract class Conta {

    protected Cliente cliente;
    protected Float saldo;

    //Construtor Padrão
    public Conta(){

    }

    //Construtor
    public Conta(Cliente cliente, Float saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    //Getter and Setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    //Fazer deposito
    public void fazerDeposito(Float valorDeposito){
        saldo = saldo + valorDeposito;
    };

    //Sacar dinheiro
    public abstract Boolean sacarDinheiro (Float valorSaque);

    //Consultar saldo
    public Float consultarSaldo(){
        return saldo;
    };

}
