package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Cliente clienteClaudio = new Cliente(
                1000,
                "Santos",
                "21.221.212-X",
                "222.222.232-32");

        //Inicializa dados da conta corrente
        ContaCorrente contaCorrenteClaudio = new ContaCorrente();
        contaCorrenteClaudio.setCliente(clienteClaudio);
        contaCorrenteClaudio.setLimiteAutorizChequeEspec(1000.00f);
        contaCorrenteClaudio.setSaldo(10.00f);

        contaCorrenteClaudio.sacarDinheiro()
        contaCorrenteClaudio.consultarSaldo()
        contaCorrenteClaudio.depositarCheques();

        //Inicializa dados da poupança
        ContaPoupanca poupancaClaudio = new ContaPoupanca();
        poupancaClaudio.setCliente(clienteClaudio);
        poupancaClaudio.setTaxaDeJuros(0.5f);
        poupancaClaudio.setSaldo(50.00f);

        contaCorrenteClaudio.depositarCheques();
        contaCorrenteClaudio.sacarDinheiro()
        contaCorrenteClaudio.consultarSaldo()







    }

}
