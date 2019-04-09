package br.com.digitalhouse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cliente clienteClaudio = new Cliente(
                1000,
                "Santos",
                "21.221.212-X",
                "222.222.232-32");

        //***
        //*** Conta Corrente
        //***
        //Inicializa dados da conta corrente
        System.out.println("*** Conta Corrente ***");

        ContaCorrente contaCorrenteClaudio = new ContaCorrente(
                clienteClaudio,
                10.00f,
                1000.00f);

        //Conta Corrente - Cenário 1 - Depósito
        contaCorrenteClaudio.fazerDeposito(50.0f);
        contaCorrenteClaudio.consultarSaldo();

        //Conta Corrente - Cenário 2 - Sacar Dinheiro (sem saldo na conta, utilizando cheque especial )
        contaCorrenteClaudio.sacarDinheiro (100.0f);
        contaCorrenteClaudio.consultarSaldo();

        //Conta Corrente - Cenário 3 - Sacar Dinheiro (sem saldo na conta ultrapassando o cheque especial )
        contaCorrenteClaudio.sacarDinheiro (5000.0f);
        contaCorrenteClaudio.consultarSaldo();

        //Conta Corrente - Cenário 4 - Depositar cheque
        Cheque dadosCheque = new Cheque(
                400.00f,
                "Santander",
                converterStringParaData("09/04/2019 11:49:00 AM"));

        contaCorrenteClaudio.depositarCheques(dadosCheque);
        contaCorrenteClaudio.consultarSaldo();

        //***
        //*** Conta Poupança
        //***
        System.out.println("*** Conta Poupança ***");

        //Inicializa dados da poupança
        ContaPoupanca poupancaClaudio = new ContaPoupanca(
                clienteClaudio,
                50.00f,
                0.5f);

        //Conta Poupança - Cenário 1 - Depósito
        poupancaClaudio.fazerDeposito(123.45f);
        poupancaClaudio.consultarSaldo();

        //Conta Poupança - Cenário 2 - Sacar Dinheiro (sem saldo na poupança)
        poupancaClaudio.sacarDinheiro (500.23f);
        poupancaClaudio.consultarSaldo();

        //Conta Poupança - Cenário 3 - Sacar Dinheiro (com saldo na poupança)
        poupancaClaudio.sacarDinheiro (20.00f);
        poupancaClaudio.consultarSaldo();

        //Conta Poupança - Cenário 4 - Recolher Juros
        poupancaClaudio.recolherJuros(5);
        poupancaClaudio.consultarSaldo();

    }

    private static Date converterStringParaData(String stringData){

        SimpleDateFormat formatoData = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
        Date dataConvertida = new Date();

        try {
            dataConvertida = formatoData.parse(stringData);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dataConvertida;
    }

}
