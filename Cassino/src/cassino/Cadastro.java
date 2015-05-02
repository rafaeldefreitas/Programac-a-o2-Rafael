package cassino;
import javax.swing.JOptionPane;

public class Cadastro {
    private String nusuario;
    private String susuario;
    private String lusuario;
    private Integer gold;
    private Float cash;
    private Boolean jogando;
    private String roupa;
    private String acessorio;
    private String sapato;
    private Integer valordep;
    private Float terno;
    private Float smoking;
    private Float vestidorosa;
    private Float tubinhodourado;
    private String option;
    private Float corentedeouro = 100f;
    private Float relogio = 70f;
    private Float smartphone = 100f;
    private Float chapeu = 25f;
    private Float chinelo = 10f;
    private Float tenis = 30f;
    private Integer resultdado;
    private Integer aposta;
    private Integer numescolhido;
    private String ncartao;
    private Integer valorcartao;
    private Integer numroleta;
    private Integer gruporoleta;

    public Integer getGruporoleta() {
        return gruporoleta;
    }

    public void setGruporoleta(Integer gruporoleta) {
        this.gruporoleta = gruporoleta;
    }

    public Integer getNumroleta() {
        return numroleta;
    }

    public void setNumroleta(Integer numroleta) {
        this.numroleta = numroleta;
    }

    public Integer getValorcartao() {
        return valorcartao;
    }

    public void setValorcartao(Integer valorcartao) {
        this.valorcartao = valorcartao;
    }

    public String getNcartao() {
        return ncartao;
    }

    public void setNcartao(String ncartao) {
        this.ncartao = ncartao;
    }

    public Integer getNumescolhido() {
        return numescolhido;
    }

    public void setNumescolhido(Integer numescolhido) {
        this.numescolhido = numescolhido;
    }

    public Integer getPrimeirodado() {
        return primeirodado;
    }

    public Integer getResultdado() {
        return resultdado;
    }

    public void setResultdado(Integer resultdado) {
        this.resultdado = resultdado;
    }

    public void setPrimeirodado(Integer primeirodado) {
        this.primeirodado = primeirodado;
    }

    public Integer getSegundodado() {
        return segundodado;
    }

    public Integer getAposta() {
        return aposta;
    }

    public void setSegundondado(Integer segundodado) {
        this.segundodado = segundodado;
    }
    private Float nsapato = 45f;
    private Float sapatotenis = 35f;
    private String csusuario;
    private Integer primeirodado;
    private Integer segundodado;

    public String getNusuario() {
        return nusuario;
    }

    public void setNusuario(String nusuario) {
        this.nusuario = nusuario;
    }

    public String getSusuario() {
        return susuario;
    }

    public void setSusuario(String susuario) {
        this.susuario = susuario;
    }

    public String getLusuario() {
        return lusuario;
    }

    public void setLusuario(String lusuario) {
        this.lusuario = lusuario;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Boolean getJogando() {
        return jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }
    public void setAposta(Integer aposta) {
        this.aposta = aposta;
    }
    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSapato() {
        return sapato;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    public Integer getValordep() {
        return valordep;
    }

    public void setValordep(Integer valordep) {
        this.valordep = valordep;
    }

    public Float getTerno() {
        return terno;
    }

    public void setTerno(Float terno) {
        this.terno = terno;
    }

    public Float getSmoking() {
        return smoking;
    }

    public void setSmoking(Float smoking) {
        this.smoking = smoking;
    }

    public Float getVestidorosa() {
        return vestidorosa;
    }

    public void setVestidorosa(Float vestidorosa) {
        this.vestidorosa = vestidorosa;
    }

    public Float getTubinhodourado() {
        return tubinhodourado;
    }

    public void setTubinhodourado(Float tubinhodourado) {
        this.tubinhodourado = tubinhodourado;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Float getCorentedeouro() {
        return corentedeouro;
    }

    public void setCorentedeouro(Float corentedeouro) {
        this.corentedeouro = corentedeouro;
    }

    public Float getRelogio() {
        return relogio;
    }

    public void setRelogio(Float relogio) {
        this.relogio = relogio;
    }

    public Float getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Float smartphone) {
        this.smartphone = smartphone;
    }

    public Float getChapeu() {
        return chapeu;
    }

    public void setChapeu(Float chapeu) {
        this.chapeu = chapeu;
    }

    public Float getChinelo() {
        return chinelo;
    }

    public void setChinelo(Float chinelo) {
        this.chinelo = chinelo;
    }

    public Float getTenis() {
        return tenis;
    }

    public void setTenis(Float tenis) {
        this.tenis = tenis;
    }

    public Float getNsapato() {
        return nsapato;
    }

    public void setNsapato(Float nsapato) {
        this.nsapato = nsapato;
    }

    public Float getSapatotenis() {
        return sapatotenis;
    }

    public void setSapatotenis(Float sapatotenis) {
        this.sapatotenis = sapatotenis;
    }

    public String getCsusuario() {
        return csusuario;
    }

    public void setCsusuario(String csusuario) {
        this.csusuario = csusuario;
    }
   
    
    Cadastro(){
        this.nusuario = null;
        this.susuario = null;
        this.lusuario = null;
        this.csusuario = null;
        this.roupa = null;
        this.gold = null;
        this.cash = null;
        this.jogando = false;
        this.acessorio = null;
        this.sapato = null;
        this.valordep = 0;
        this.terno = 40f;
        this.smoking = 45f;
        this.vestidorosa = 35f;
        this.tubinhodourado = 55f;
        
    }
    
    Boolean RealizarCadastro(String nomeusuario, String loginusuario, String senhausuario, String confirmasenha) {
       nusuario = nomeusuario;
       susuario = senhausuario;
       lusuario = loginusuario;
       csusuario = confirmasenha;
       gold = 50;
       cash = 0f;
       jogando = false;
       roupa = "Calça e Camisa";
       acessorio = "Relogio Falso";
       sapato = "Chinelo com Prego";
       if (susuario.equals(csusuario)){
       return true;
       }else{
           return false;
       }
}
    Boolean Entrar(String loginusuario, String senhausuario){
        if (loginusuario.equals(lusuario) && senhausuario.equals(susuario)){
            jogando = true;
            return true;
        }else{
            return false;
        }
    }
    
    Boolean InserirCash(){
        if (ncartao.length() == 16){
            if (valorcartao <= 10) {
                cash = cash + valorcartao;
                return true;
            } else if (valorcartao >= 11 && valorcartao <= 50) {
                cash = cash + (valorcartao * 2);
                return true;
            } else {
                cash = cash + (valorcartao * 3);
                return true;
            }
        }
        else{
            
            
  return false;
        }
    }
    
    Boolean compraRoupa(){
        if(jogando = true){
            return true;
        }else{
            return false;
        }
    }
    
    Boolean comprarAcessorio(){
         if(jogando == true){
            return true;
        }else{
            return false;
        }
    }
    
    Boolean comprarSapato(){
        if(jogando == true){
            return true;
        }else{
            return false;
        }
    }
    
    void catalogo(String option){
        if (option.equals("1") && cash >= terno){
            cash = cash - terno;
            JOptionPane.showMessageDialog(null, "TERNO COMPRADO COM SUCESSO!");
        }else if (option.equals("2") && cash >= smoking){
            cash = cash - smoking;
            JOptionPane.showMessageDialog(null, "SMOKING COMPRADO COM SUCESSO!");
        }else if (option.equals("3") && cash >= vestidorosa ){
            cash = cash - vestidorosa;
            JOptionPane.showMessageDialog(null, "VESTIDO ROSA COMPRADO COM SUCESSO!");
        }else if (option.equals("4") && cash >= tubinhodourado){
            cash = cash - tubinhodourado;
            JOptionPane.showMessageDialog(null, "TUBINHO DOURADO COMPRADO COM SUCESSO!");
        }else if (option.equals("5") && cash >= corentedeouro){
            cash = cash - corentedeouro;
            JOptionPane.showMessageDialog(null, "CORRENTE DE OURO COMPRADO COM SUCESSO!");
        }else if (option.equals("6") && cash >= relogio){
            cash = cash - relogio;
            JOptionPane.showMessageDialog(null, "RELOGIO COMPRADO COM SUCESSO!");
        }else if (option.equals("7") && cash >= smartphone){
            cash = cash - smartphone;
            JOptionPane.showMessageDialog(null, "SMARTPHONE COMPRADO COM SUCESSO!");
        }else if (option.equals("8") && cash >= chapeu){
            cash = cash - chapeu;
            JOptionPane.showMessageDialog(null, "CHAPEU COMPRADO COM SUCESSO!");
        }else if (option.equals("a") && cash >= chinelo){
            cash = cash - chapeu;
            JOptionPane.showMessageDialog(null, "CHINELO COMPRADO COM SUCESSO!");
        }else if (option.equals("b") && cash >= tenis){
            cash = cash - tenis;
            JOptionPane.showMessageDialog(null, "TENIS COMPRADO COM SUCESSO!");
        }else if (option.equals("c") && cash >= nsapato){
            cash = cash - nsapato;
            JOptionPane.showMessageDialog(null, "SAPATO DE COURO COMPRADO COM SUCESSO!");
        }else if (option.equals("d") && cash >= sapatotenis){
            cash = cash - sapatotenis;
            JOptionPane.showMessageDialog(null, "SAPATENIS COMPRADO COM SUCESSO!");
        }else{
            JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }
    Boolean jogarDados(){
        this.primeirodado = 1 + (int)(Math.random()*6);
        this.segundodado = 1 + (int)(Math.random()*6);
        resultdado = primeirodado + segundodado;
        if(aposta <= gold && resultdado == numescolhido){
        gold = aposta * 12;
        return true;
        }else if((aposta <= gold) && resultdado == numescolhido - 1 || resultdado == numescolhido + 1){
            gold = aposta * 5;
            return true;
        }else{
            gold = gold - aposta;
            return false;
        }
    }
    
    Boolean roleta1(){
        this.numroleta = 0 + (int)(Math.random()*36);
        if(this.numescolhido == this.numroleta){
            gold = gold + (aposta * 35);
            return true;
        }else{
            gold = gold - aposta;
            return false;
        }
    }
    
    Boolean roleta2(){
        this.numroleta = 0 + (int)(Math.random()*3);
         if(this.numescolhido == this.numroleta){
            gold = gold + (aposta * 2);
            return true;
        }else{
            gold = gold - aposta;
            return false;
        }
    }
    
    Boolean roleta3(){
        this.numroleta = 0 + (int)(Math.random()*2);
         if(this.numescolhido == this.numroleta){
            gold = gold + aposta;
            return true;
        }else{
            gold = gold - aposta;
            return false;
        }
    }
    
    Boolean roleta4(){
        this.numroleta = 0 + (int)(Math.random()*36);
        if (this.numescolhido == 1 && this.numroleta % 2 == 0){
            gold = gold + aposta;
            return true;
        } else if (this.numescolhido == 2 && this.numroleta % 2 == 0){
            gold = gold - aposta;
            return false;
        } else if (this.numescolhido == 2 && this.numroleta % 2 != 0){
            gold = gold + aposta;
            return true;
        } else if (this.numescolhido == 1 && this.numroleta % 2 != 0){
            gold = gold - aposta;
            return false;
            }
        else return false;
    }

}

