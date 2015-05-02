package televisao;
public class Emissora {
   private String nome;
   private String endereco;
   private Boolean aberta;
   private String fechadaberta;
   private String e;
   private String cidade;
   private Integer ncanal;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNcanal() {
        return ncanal;
    }

    public void setNcanal(Integer ncanal) {
        this.ncanal = ncanal;
    }

    public String getFechadaberta() {
        return fechadaberta;
    }

    public void setFechadaberta(String fechadaberta) {
        this.fechadaberta = fechadaberta;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean getAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }
   
   Emissora(){
       this.nome = null;
       this.endereco = null;
       this.aberta = false;
   }
   
   public Boolean isAberta(){
       if(e == "Sim"){
           aberta = true;
           return true;
       }else{
           aberta = false;
           return false;
       }
   }
   
}
