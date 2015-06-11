package mk;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class XONE {

    public static void main(String[] args) {
        Reptile r = new Reptile();
        r.setAgarra("RB");
        r.setChutealto("B");
        r.setChutebaixo("A");
        r.setDefesa("RT");
        r.setEspecial("LT+RT");
        r.setSocoalto("X");
        r.setSocobaixo("Y");

        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + r.getSocoalto() + "\n - Soco Baixo: " + r.getSocobaixo()
                + "\n - Chute Alto: " + r.getChutealto() + "\n - Chute Fraco: " + r.getChutebaixo() + "\n - Defesa: " + r.getDefesa()
                + "\n - Arremesso: " + r.getAgarra() + "\n - Especial: " + r.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Invisibilidade: " + r.invisivel() + "\n - Ácido: " + r.acido() + "\n - Bola Rápida: " + r.bolarapida()
                + "\n - Bola Lenta: " + r.bolalenta()
                + "\n - Combo 1: " + r.combo1() + "\n - Combo 2: " + r.combo2() + "\n - Fatality 1: " + r.fatality1() + "\n - Fatality 2: " + r.fatality2(), "REPTILE - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/reptile1.png"));

        Scorpion s = new Scorpion();
        s.setAgarra("RB");
        s.setChutealto("B");
        s.setChutebaixo("A");
        s.setDefesa("RT");
        s.setEspecial("LT+RT");
        s.setSocoalto("X");
        s.setSocobaixo("Y");
        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + s.getSocoalto() + "\n - Soco Fraco: " + s.getSocobaixo()
                + "\n - Chute Forte: " + s.getChutealto() + "\n - Chute Fraco: " + s.getChutebaixo() + "\n - Defesa: " + s.getDefesa()
                + "\n - Arremesso: " + s.getAgarra() + "\n - Especial: " + s.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Spear: " + s.spear() + "\n - Teleport: " + s.teleport() + "\n - Flying Punch: " + s.FlyngPunch() + "\n - Air Throw: " + s.AirThrow()
                + "\n - Combo 1: " + s.combo1() + "\n - Combo 2: " + s.combo2() + "\n - Fatality 1: " + s.fatality1() + "\n - Fatality 2: " + s.fatality2(), "SCORPION - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/Scorpion.png"));

        Subzero sz = new Subzero();
        sz.setAgarra("RB");
        sz.setChutealto("B");
        sz.setChutebaixo("A");
        sz.setDefesa("RT");
        sz.setEspecial("LT+RT");
        sz.setSocoalto("X");
        sz.setSocobaixo("Y");
        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + sz.getSocoalto() + "\n - Soco Fraco: " + sz.getSocobaixo()
                + "\n - Chute Forte: " + sz.getChutealto() + "\n - Chute Fraco: " + sz.getChutebaixo() + "\n - Defesa: " + sz.getDefesa()
                + "\n - Arremesso: " + sz.getAgarra() + "\n - Especial: " + sz.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Freeze: " + sz.Freeze() + "\n - Slide: " + sz.Slide() + "\n - Ice Clone: " + sz.IceClone() + "\n - Ice Shower: " + sz.IceShower()
                + "\n - Combo 1: " + sz.combo1() + "\n - Combo 2: " + sz.combo2() + "\n - Fatality 1: " + sz.fatality1() + "\n - Fatality 2: " + sz.fatality2(), "SUB-ZERO - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/Sub-zero.png"));

        Raiden ra = new Raiden();
        ra.setAgarra("RB");
        ra.setChutealto("B");
        ra.setChutebaixo("A");
        ra.setDefesa("RT");
        ra.setEspecial("LT+RT");
        ra.setSocoalto("X");
        ra.setSocobaixo("Y");

        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + ra.getSocoalto() + "\n - Soco Baixo: " + ra.getSocobaixo()
                + "\n - Chute Alto: " + ra.getChutealto() + "\n - Chute Fraco: " + ra.getChutebaixo() + "\n - Defesa: " + ra.getDefesa()
                + "\n - Arremesso: " + ra.getAgarra() + "\n - Especial: " + ra.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Lightning: " + ra.Lightning() + "\n - Reverse Lightning: " + ra.ReverseLightning() + "\n - Teleport: " + ra.Teleport()
                + "\n - Superman: " + ra.Superman()
                + "\n - Combo 1: " + ra.combo1() + "\n - Combo 2: " + ra.combo2() + "\n - Fatality 1: " + ra.fatality1() + "\n - Fatality 2: " + ra.fatality2(), "RAIDEN - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/raiden.png"));

        KungLao kl = new KungLao();
        kl.setAgarra("RB");
        kl.setChutealto("B");
        kl.setChutebaixo("A");
        kl.setDefesa("RT");
        kl.setEspecial("LT+RT");
        kl.setSocoalto("X");
        kl.setSocobaixo("Y");
        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + kl.getSocoalto() + "\n - Soco Baixo: " + kl.getSocobaixo()
                + "\n - Chute Alto: " + kl.getChutealto() + "\n - Chute Fraco: " + kl.getChutebaixo() + "\n - Defesa: " + kl.getDefesa()
                + "\n - Arremesso: " + kl.getAgarra() + "\n - Especial: " + kl.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Hat Toss: " + kl.HatToss() + "\n - Drop Kick: " + kl.DropKick() + "\n - Teleport: " + kl.Teleport()
                + "\n - Spin: " + kl.Spin()
                + "\n - Combo 1: " + kl.combo1() + "\n - Combo 2: " + kl.combo2() + "\n - Fatality 1: " + kl.fatality1() + "\n - Fatality 2: " + kl.fatality2(), "KUNG LAO - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/kung lao.png"));
        Kitana k = new Kitana();
        k.setAgarra("RB");
        k.setChutealto("B");
        k.setChutebaixo("A");
        k.setDefesa("RT");
        k.setEspecial("LT+RT");
        k.setSocoalto("X");
        k.setSocobaixo("Y");
        JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + k.getSocoalto() + "\n - Soco Baixo: " + k.getSocobaixo()
                + "\n - Chute Alto: " + k.getChutealto() + "\n - Chute Fraco: " + k.getChutebaixo() + "\n - Defesa: " + k.getDefesa()
                + "\n - Arremesso: " + k.getAgarra() + "\n - Especial: " + k.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                + " - Hat Toss: " + k.FanToss() + "\n - Fan Lift: " + k.FanLift() + "\n - Square Wave Punch: " + k.SquareWavePunch() + "\n - Swipe: " + k.Swipe()
                + "\n - Combo 1: " + k.combo1() + "\n - Combo 2: " + k.combo2() + "\n - Fatality 1: " + k.fatality1() + "\n - Fatality 2: " + k.fatality2(), "KITANA - XONE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/kitana.png"));
    }

}
