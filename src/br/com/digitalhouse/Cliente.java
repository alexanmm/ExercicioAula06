package br.com.digitalhouse;

public class Cliente {

    private Integer numeroCliente;
    private String sobrenome;
    private String numeroRG;
    private String numeroCPF;

    //Construtor Padrão
    public Cliente(){

    }

    //Construtor
    public Cliente( Integer numeroCliente,
                    String sobrenome,
                    String numeroRG,
                    String numeroCPF){

        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.numeroRG = numeroRG;
        this.numeroCPF = numeroCPF;

    }

    //Getter and Setter
    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(String numeroRG) {
        this.numeroRG = numeroRG;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }
}
