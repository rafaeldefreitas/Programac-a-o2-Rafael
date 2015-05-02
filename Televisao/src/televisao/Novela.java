package televisao;
public class Novela {
    private String titulo;
    private Integer duracao;
    private String autornovela;
    private String emissora;
    private Double ibope;
    private Boolean violencia;
    private Boolean sexo;
    private Boolean drogas;
    private String publico;
    private Double npessoas;
    private String d;
    private String s;
    private String v;
    
    
    
    public void setD(String d){
        this.d = d;
    }
    public void setS(String s){
        this.s = s;
    }
    public void setV(String v){
        this.v = v;
    }
    
    public void setNpessoas(Double npessoas) {
        this.npessoas = npessoas;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getAutornovela() {
        return autornovela;
    }

    public void setAutornovela(String autornovela) {
        this.autornovela = autornovela;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public Boolean getViolencia() {
        return violencia;
    }

    public void setViolencia(Boolean violencia) {
        this.violencia = violencia;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean getDrogas() {
        return drogas;
    }

    public void setDrogas(Boolean drogas) {
        this.drogas = drogas;
    }
    
    Novela(){
        this.titulo = null;
        this.autornovela = null;
       this.drogas = false;
        this.duracao = null;
        this.emissora = null;
        this.ibope = null;
       this.sexo = false;
       this.violencia = false;
        
    }
    
    public Integer obterClassificacao(){
        if(this.d == "Sim"){
            this.drogas = true;
        }else this.drogas = false;
        
        if(this.v == "Sim"){
            this.violencia = true;
        }else this.violencia = false;
        if(this.s == "Sim"){
            this.sexo = true;
        }else this.sexo = false;
       if((this.drogas == false && this.sexo == false)&& this.violencia == true){
            return +14;
        }
        else if((this.drogas == true && this.sexo == false)&& this.violencia == true){
            return +16;
        }
        else if((this.drogas == true && this.sexo == true)&& this.violencia == true){
        return +18;
        }
        else return 0;
    }
    public Double calcularIbope(){
        this.ibope = this.npessoas / 10000;
        return this.ibope;
    }
}
