package mk;
public class KungLao extends Personagem {
    public String HatToss() {
        return "← + → + " + socobaixo;
    }

    public String DropKick() {
        return "↓ + " + chutealto;
    }

    public String Spin() {
        return "→ + ↓ + → + "+ chutebaixo;
    }

    public String Teleport() {
        return "↓ + ↑ ";
    }

    public String combo1() {
        return chutealto + " + " + socoalto + " + "+ " → "+ " + " + chutealto;
    }

    public String combo2() {
        return chutealto + " + "+ socoalto +" + " + socoalto +" + "+ chutealto + " + "+ socoalto + " + "+ socoalto;
    }
    public String fatality1() {
        return " ↓ + ← + ↓ +  → + " + chutealto;
    }

    public String fatality2() {
        return " ↓ + → + ↓ + ← + "+ chutealto;
    }

    private String HatSpin() {
        return " → + → + ← + ← + "+ socobaixo;
    }
}
