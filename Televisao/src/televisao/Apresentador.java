package televisao;

public class Apresentador {

    private String nome;
    private String datanasc;
    private String email;
    private String nomeartistico;
    private String programa;
    private Double salariomes;
    private Double cache;
    private String cidade;
    private String endereco;
    private String estado;
    private Double salario;
    private Integer evento;
    private Double mkt;

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

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
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

    public Double getMkt() {
        return mkt;
    }

    public void setMkt(Double mkt) {
        this.mkt = mkt;
    }

    Apresentador() {
        this.nome = null;
        this.cache = null;
        this.cidade = null;
        this.datanasc = null;
        this.email = null;
        this.endereco = null;
        this.estado = null;
        this.evento = null;
        this.mkt = null;
        this.nomeartistico = null;
        this.salario = null;
        this.salariomes = null;
    }

    public Double calcularGanhos() {
        this.salario = this.salariomes + this.mkt + (this.cache * this.evento);
        return this.salario;
    }
}
