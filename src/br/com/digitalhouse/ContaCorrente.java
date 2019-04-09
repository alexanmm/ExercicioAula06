package br.com.digitalhouse;

public class ContaCorrente extends Conta{

    private Float limiteAutorizChequeEspec;
    private Cheque cheque;

    //Getter and Setter
    public Float getLimiteAutorizChequeEspec() {
        return limiteAutorizChequeEspec;
    }

    public void setLimiteAutorizChequeEspec(Float limiteAutorizChequeEspec) {
        this.limiteAutorizChequeEspec = limiteAutorizChequeEspec;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    //Depositar cheque
    public void depositarCheques(Cheque paramCheque){
        cheque = paramCheque;
    }

    //Sacar dinheiro
    @Override
    public Boolean sacarDinheiro(Float valorSaque) {

        //Verifica se há saldo para saque
        if (saldo + limiteAutorizChequeEspec >= valorSaque){
            saldo = saldo - valorSaque;

            return true;
        } else {
            return false;
        }


    }
}
