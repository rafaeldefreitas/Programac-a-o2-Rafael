package mk;
public class Reptile extends Personagem{
    public String invisivel() {
        return "↓ + ↓ + " + chutebaixo;
    }

    public String acido() {
        return "↓ + → + " + socobaixo;
    }

    public String bolalenta() {
        return "← + ← + " + socobaixo;
    }

    public String bolarapida() {
        return "→ + → + " + socobaixo;
    }

    public String combo1() {
        return chutealto + " + " + chutealto + " + "+ " ← "+ " + " + chutealto;
    }

    public String combo2() {
        return socoalto + " + " + socoalto + " + " + socoalto + " + "+ socoalto;
    }

    public String fatality1() {
        return "↓ + ↑";
    }

    public String fatality2() {
        return "↓ + ↓ + ← + → + " + socoalto;
    }

    private String bolaultrasonica() {
        return "";
    }
}
