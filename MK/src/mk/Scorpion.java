package mk;
public class Scorpion extends Personagem{
    public String spear() {
        return "← + ← + " + socobaixo;
    }

    public String teleport() {
        return "↓ + ← + " + socoalto;
    }

    public String FlyngPunch() {
        return "↓ + → + " + socobaixo;
    }

    public String AirThrow() {
        return "↓ + " + defesa;
    }

    public String combo1() {
        return chutealto + " + " + chutealto + " + "+ " ← "+ " + " + chutealto;
    }

    public String combo2() {
        return socoalto + " + " + socoalto + " + " + chutealto + " + "+ chutealto + " + "+ " ↓ "+ chutealto;
    }

    public String fatality1() {
        return defesa + " + ↑ + ↑";
    }

    public String fatality2() {
        return "↓ + ← + → + " + socobaixo;
    }

    private String airdeamon() {
        return "";
    }
}
