package mk;
public class Raiden extends Personagem {
    public String Lightning() {
        return "↓ + → + " + socobaixo;
    }

    public String ReverseLightning() {
        return "↓ + ← + " + socobaixo;
    }

    public String Teleport() {
        return "↓ + ↑ ";
    }

    public String Superman() {
        return " ← + → + →";
    }

    public String combo1() {
        return chutealto + " + " + chutealto + " + "+ " ← "+ " + " + chutealto;
    }

    public String combo2() {
        return chutealto + " + "+ chutealto + " + " + socoalto +" + " + socoalto +" + "+ socoalto + " + "+ socoalto + " + "+ socoalto;
    }

    public String fatality1() {
        return " → + → + " + socobaixo;
    }

    public String fatality2() {
        return " → + ← + → + "+ socobaixo;
    }

    private String Storm() {
        return " → + → + ← + → + "+ socoalto;
    }
}
