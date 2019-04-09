package br.com.digitalhouse;

public class ContaPoupanca extends Conta{

    private Float taxaDeJuros;

    //Construtor
    public ContaPoupanca(Cliente cliente, Float saldo, Float taxaDeJuros){
        super(cliente, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

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
            System.out.println("Sacar dinheiro: " + String.valueOf(valorSaque));

            saldo = saldo - valorSaque;

            return true;
        } else {

            System.out.println("Rejeitado: Sacar dinheiro " + String.valueOf(valorSaque));

            return false;
        }
    }

    //Recolher juros
    public void recolherJuros(Integer qtdMeses){

        System.out.println("Recolher Juros dos meses: " + String.valueOf(qtdMeses));

        saldo = saldo + (taxaDeJuros * qtdMeses);
    }


}
