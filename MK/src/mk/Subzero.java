package mk;
public class Subzero extends Personagem {
    public String Freeze() {
        return "← + → + " + socobaixo;
    }

    public String Slide() {
        return socobaixo + " + " + chutebaixo;
    }

    public String IceClone() {
        return "↓ + ← " + socobaixo;
    }

    public String IceShower() {
        return "↓ + → " + socoalto;
    }

    public String combo1() {
        return chutealto + " + " + chutealto + " + "+ " ← "+ " + " + chutealto;
    }

    public String combo2() {
        return socoalto + " + " + socoalto + " + " + socoalto + " + "+ socoalto;
    }

    public String fatality1() {
        return "← + ← + ← + → + →";
    }

    public String fatality2() {
        return "↓ + ← + ↓ + → "+ chutealto;
    }

    private String supergelo() {
        return "";
    }
}
