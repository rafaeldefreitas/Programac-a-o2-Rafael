package mk;
public class Personagem {
    protected String socoalto;
    protected String socobaixo;
    protected String chutealto;
    protected String chutebaixo;
    protected String defesa;
    protected String agarra;
    protected String especial;
    protected Integer vida;

    public String getSocoalto() {
        return socoalto;
    }

    public void setSocoalto(String socoalto) {
        this.socoalto = socoalto;
    }

    public String getSocobaixo() {
        return socobaixo;
    }

    public void setSocobaixo(String socobaixo) {
        this.socobaixo = socobaixo;
    }

    public String getChutealto() {
        return chutealto;
    }

    public void setChutealto(String chutealto) {
        this.chutealto = chutealto;
    }

    public String getChutebaixo() {
        return chutebaixo;
    }

    public void setChutebaixo(String chutebaixo) {
        this.chutebaixo = chutebaixo;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
    
    public Personagem(){
        socoalto = null;
        socobaixo = null;
        chutealto = null;
        chutebaixo = null;
        defesa = null;
        agarra = null;
        especial = null;
        vida = 100;
    }
    public String combo1() {
        return null;
    }

    public String combo2() {
        return null;
    }
    public String fatality1() {
        return null;
    }

    public String fatality2() {
        return null;
    }
}
