package caixa_eletronico;

/**
 *
 * @author rafaelfreitas
 */
public class Cliente {
  private String nome;
  private String cpf;
  private String data;
  private String endereco;
  private String mae;
  private String pai;
  private Boolean negativadoSPC;
  private Boolean negativadoSERASA;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public Boolean getNegativadoSPC() {
        return negativadoSPC;
    }

    public void setNegativadoSPC(Boolean negativadoSPC) {
        this.negativadoSPC = negativadoSPC;
    }

    public Boolean getNegativadoSERASA() {
        return negativadoSERASA;
    }

    public void setNegativadoSERASA(Boolean negativadoSERASA) {
        this.negativadoSERASA = negativadoSERASA;
    }

    
Cliente(){
    nome = null;
    cpf = null;
    data = null;
    endereco = null;
    mae = null;
    pai = null;
    negativadoSPC = false;
    negativadoSERASA = false;
}  
public Boolean verficaCredito(){
    Boolean retorno;
    retorno = this.negativadoSPC == false && negativadoSERASA == false;
    return retorno;
}


}
