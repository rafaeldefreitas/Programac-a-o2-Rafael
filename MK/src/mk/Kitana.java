package mk;

public class Kitana extends Personagem {
    
    
    public String FanToss() {
        return "→ + → + " + socobaixo;
    }

    public String FanLift() {
        return "↓ + ← + ← + " + socoalto;
    }

    public String SquareWavePunch() {
        return "↓ + ← + "+ socoalto;
    }

    public String Swipe() {
        return "← + "+ socoalto;
    }

    public String combo1() {
        return socoalto + " + " + socoalto + " + "+ " → "+ " + " + chutebaixo;
    }

    public String combo2() {
        return socoalto + " + " + socoalto + " + " + socoalto + " + "+ socoalto;
    }
    public String fatality1() {
        return " ↓ +  → + ← + → + " + socobaixo;
    }

    public String fatality2() {
        return " ↓ + → + ↓ + ↓ + "+ socoalto;
    }

    private String FanCut() {
        return "← + → + "+ socoalto;
    }
}
