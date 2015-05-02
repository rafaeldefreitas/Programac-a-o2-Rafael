package caixa_eletronico;

public class Conta {

    private Integer numeroconta;
    private Cliente correntista;
    private String agencia;
    private Float saldo;
    private Boolean ativa;
    private Gerente gerente;

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    public Integer getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(Integer numeroconta) {
        this.numeroconta = numeroconta;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente Correntista) {
        this.correntista = Correntista;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    


    Conta() {
        this.correntista = new Cliente();
        this.gerente = new Gerente();
        numeroconta = null;
        agencia = null;
        saldo = 0f;
        ativa = false;
    }

    public String abrir(Cliente Cli, String nagencia) {
        correntista = Cli; 
        numeroconta = (0000001 + (int)(Math.random()*9999999));
        agencia = nagencia;
        ativa = true;
        return "CONTA REGISTRADA COM SUCESSO!";
    }
    
    public Boolean deposito(Float valorinserido){
        if(ativa == true){
            saldo = saldo + valorinserido;
            return true;
        }else return false;
    }
    
    public Boolean retirar (Float valorsaque){
        if(ativa == true && saldo >= valorsaque){
            saldo = saldo - valorsaque;
            return true;
        }else return false;
    }
    
    public Boolean fechar (){
        if(ativa == true && saldo == 0){
            ativa = false;
            return true;
        } else return false;
    }
    
    public Float retornaSaldo(){
            return saldo;
        } 
    
}
