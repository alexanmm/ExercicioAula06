package br.com.digitalhouse;

public class ContaPoupanca extends Conta{

    private Float taxaDeJuros;

    //Getter and Setter
    public Float getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Float taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public Boolean sacarDinheiro(Float valorSaque) {

        //Verifica se há saldo para saque
        if (saldo >= valorSaque){
            saldo = saldo - valorSaque;

            return true;
        } else {
            return false;
        }
    }

    //Recolher juros
    public void recolherJuros(Float jurosMensais){
        saldo = saldo + (taxaDeJuros * jurosMensais);
    }


}
