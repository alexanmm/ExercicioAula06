package br.com.digitalhouse;

public class ContaCorrente extends Conta{

    private Float limiteAutorizChequeEspec;
    private Cheque cheque;

    //Construtor
    public ContaCorrente(Cliente cliente, Float saldo, Float limiteAutorizChequeEspec){
        super(cliente, saldo);
        this.limiteAutorizChequeEspec = limiteAutorizChequeEspec;
    }

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

        System.out.println("Depositar cheque: " + String.valueOf(paramCheque.getValor()));

        //Atualiza o saldo após o deposito de cheque
        saldo = saldo + cheque.getValor();

    }

    //Sacar dinheiro
    @Override
    public Boolean sacarDinheiro(Float valorSaque) {

        //Verifica se há saldo para saque
        if (saldo + limiteAutorizChequeEspec >= valorSaque){
            System.out.println("Sacar dinheiro: " + String.valueOf(valorSaque));

            saldo = saldo - valorSaque;

            return true;
        } else {
            System.out.println("Rejeitado: Sacar dinheiro " + String.valueOf(valorSaque));

            return false;
        }


    }
}
