
package televisao;
public class Atores {
    
    private String nome;
    private String datanasc;
    private Integer quantnovela;
    private String email;
    private String nomeartistico;
    private Double salariomes;
    private Double cache;
    private String cidade;
    private String endereco;
    private String estado;
    private String statusator;
    private Double salario;
    private Integer evento;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatusator() {
        return statusator;
    }

    public void setStatusator(String statusator) {
        this.statusator = statusator;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public Integer getQuantnovela() {
        return quantnovela;
    }

    public void setQuantnovela(Integer quantnovela) {
        this.quantnovela = quantnovela;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    public Double getSalariomes() {
        return salariomes;
    }

    public void setSalariomes(Double salariomes) {
        this.salariomes = salariomes;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    Atores(){
        this.nome = null;
        this.cache = null;
        this.cidade = null;
        this.datanasc = null;
        this.email = null;
        this.endereco = null;
        this.estado = null;
        this.nomeartistico = null;
        this.quantnovela = null;
        this.salariomes = null;
    }
    
    public String statusator(){
        if(quantnovela <= 3 && salariomes <= 5000){
            return "Calouro";
           
        }
        else if(this.quantnovela <= 6){
            return "Revelação";
        
        }
        else if(this.quantnovela <= 6 && salariomes <= 30000){
             return "Jóia";
          
        }
        else if(this.quantnovela > 9 && this.salariomes <= 300000){
            return "Elenco de apoio";
          
        }
        else if(this.salariomes > 30000 || this.salariomes <= 100000){
            return "Elenco Principal";
        
        }
        else if(this.salariomes > 100000){
            return "Estrela"; 
        }   
        else{
            return "elenco regular";
        }
    }
    
    public Double calcularGanhos(){
       this.salario = this.salariomes + (this.cache * this.quantnovela);
       return this.salario;
    }
    public void testeAtor(String nomefantasia, String nasc, String atoremail,Double fixo, Double bonus, Integer nnovelas){
        this.quantnovela = nnovelas;
        this.nomeartistico = nomefantasia;
        this.datanasc = nasc;
        this.email = atoremail;
        this.cache = bonus;
        this.salariomes = fixo;
    }
    
}
