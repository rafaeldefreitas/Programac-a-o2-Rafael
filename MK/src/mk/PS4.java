package mk;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PS4 {

    public static void main(String[] args) {
        Reptile Reptile = new Reptile();
        Scorpion Scorpion = new Scorpion();
        Subzero Subzero = new Subzero();
        Raiden Raiden = new Raiden();
        KungLao KungLao = new KungLao();
        Kitana Kitana = new Kitana();

        int opcao = 6;
        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(("1 - LUTAR\n"
                    + "2 - LISTA DE COMANDOS\n"
                    + "0 - SAIR\n")));
            switch (opcao) {
                case 1: {
                    Luta l = new Luta();
                    String p1 = null, p2 = null;
                    String[] fases = {"Outworld", "Inferno", "Casa do Goro"};
                    String[] player = {"Scorpion","Reptile", "Subzero", "Raiden", "KungLao", "Kitana"};
                    String[] player2 = {"Subzero", "Scorpion", "Reptile", "Raiden", "KungLao", "Kitana"};
                    String[] options = {"FIGHT"};
                    //opcao = (Integer.parseInt(input.getText()));
                    JComboBox linha1 = new JComboBox(player);
                    JComboBox linha2 = new JComboBox(player2);
                    JComboBox linha3 = new JComboBox(fases);
                    Object[] linhas = {"Selecione o Player 1:", linha1,
                        "Selecione o Player 2:", linha2,
                        "Selecione o cenário desejado:", linha3};
                    JOptionPane.showOptionDialog(null, linhas, "MENU - LUTA", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, null);
                    p1 = (String) linha1.getSelectedItem();
                    p2 = (String) linha2.getSelectedItem();
                    l.setCenario((String) linha3.getSelectedItem());
                    if (p1.equals("Reptile")) {
                        l.setPersonagem1(Reptile);
                    } else if (p1.equals("Scorpion")) {
                        l.setPersonagem1(Scorpion);
                    } else if (p1.equals("Subzero")) {
                        l.setPersonagem1(Subzero);
                    } else if (p1.equals("Raiden")) {
                        l.setPersonagem1(Raiden);
                    } else if (p1.equals("KungLao")) {
                        l.setPersonagem1(KungLao);
                    } else {
                        l.setPersonagem1(Kitana);}
                    
                    if (p2.equals("Reptile")) {
                        l.setPersonagem2(Reptile);
                    } else if (p2.equals("Scorpion")) {
                        l.setPersonagem2(Scorpion);
                    } else if (p2.equals("Subzero")) {
                        l.setPersonagem2(Subzero);
                    } else if (p2.equals("Raiden")) {
                        l.setPersonagem2(Raiden);
                    } else if (p2.equals("KungLao")) {
                        l.setPersonagem2(KungLao);
                    } else {
                        l.setPersonagem2(Kitana);
                    }
                        while (l.getPersonagem1().vida > 0 || l.getPersonagem2().vida > 0) {
                            if (l.getPersonagem1().getVida() > 0) {
                                int comando = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - GOLPE\n2 - ESPECIAL\n3 - COMBO1\n4 - COMBO2\n", "INSIRA O NÚMERO DO GOLPE DESEJADO:", JOptionPane.OK_CANCEL_OPTION));

                                if (comando == 1) {
                                    l.acertagolpe("p1");
                                    JOptionPane.showMessageDialog(null, p1 +" usou golpe normal\n" + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else if (comando == 2) {
                                    l.acertaespecial("p1");
                                    JOptionPane.showMessageDialog(null, p1 +" usou golpe especial\n" + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else if (comando == 3) {
                                    l.acertacombo("p1");
                                    JOptionPane.showMessageDialog(null, p1 +" usou combo1\n" + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else {
                                    l.acertacombo2("p1");
                                    JOptionPane.showMessageDialog(null, p1 +" usou combo2\n" + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                }
                            } else {
                                break;
                            }

                            if (l.getPersonagem2().vida > 0) {
                                int comandocpu = 1 + (int) (Math.random() * 4);

                                if (comandocpu == 1) {
                                    l.acertagolpe("cpu");
                                    JOptionPane.showMessageDialog(null, p2 + " usou golpe normal\n"
                                            + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else if (comandocpu == 2) {
                                    l.acertaespecial("cpu");
                                    JOptionPane.showMessageDialog(null, p2 + " usou golpe especial\n"
                                            + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else if (comandocpu == 3) {
                                    l.acertacombo("cpu");
                                    JOptionPane.showMessageDialog(null, p2 + " usou combo1\n"
                                            + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                } else {
                                    l.acertacombo2("cpu");
                                    JOptionPane.showMessageDialog(null, p2 + " usou combo2\n"
                                            + "P1: " + l.getPersonagem1().getVida() + "%\n"
                                            + "CPU: " + l.getPersonagem2().getVida() + "%");
                                }
                            } else {
                                break;
                            }
                        }
                        if (l.getPersonagem2().getVida() == 0) {
                            JOptionPane.showMessageDialog(null, l.getPersonagem1() + " WINS!");
                        } else {
                            JOptionPane.showMessageDialog(null, l.getPersonagem2() + " WINS!");
                        }
                        break;
                    }
                
            
        
              

case 2: {
                    int escolha = 9;
                    while (escolha != 0) {
                        escolha = Integer.parseInt(JOptionPane.showInputDialog(("Selecione a opção desejada: \n"
                                + "1 - REPTILE           5 - KUNG LAO\n"
                                + "2 - SCORPION       6 - KITANA\n"
                                + "3 - SUBZERO         0 - SAIR\n"
                                + "4 - RAIDEN\n")));
                        switch (escolha) {
                            case 1: {
                                // Reptile r = new Reptile();
                                Reptile.setAgarra("R1");
                                Reptile.setChutealto("◯");
                                Reptile.setChutebaixo("X");
                                Reptile.setDefesa("R2");
                                Reptile.setEspecial("L2+R2");
                                Reptile.setSocoalto("▢");
                                Reptile.setSocobaixo("△");

                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + Reptile.getSocoalto() + "\n - Soco Fraco: " + Reptile.getSocobaixo()
                                        + "\n - Chute Forte: " + Reptile.getChutealto() + "\n - Chute Fraco: " + Reptile.getChutebaixo() + "\n - Defesa: " + Reptile.getDefesa()
                                        + "\n - Arremesso: " + Reptile.getAgarra() + "\n - Especial: " + Reptile.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Invisibilidade: " + Reptile.invisivel() + "\n - Ácido: " + Reptile.acido() + "\n - Bola Rápida: " + Reptile.bolarapida()
                                        + "\n - Bola Lenta: " + Reptile.bolalenta()
                                        + "\n - Combo 1: " + Reptile.combo1() + "\n - Combo 2: " + Reptile.combo2() + "\n - Fatality 1: " + Reptile.fatality1() + "\n - Fatality 2: " + Reptile.fatality2(), "REPTILE - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/reptile1.png"));
                                break;
                            }
                            case 2: {

                                Scorpion.setAgarra("R1");
                                Scorpion.setChutealto("◯");
                                Scorpion.setChutebaixo("X");
                                Scorpion.setDefesa("R2");
                                Scorpion.setEspecial("L2+R2");
                                Scorpion.setSocoalto("▢");
                                Scorpion.setSocobaixo("△");

                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + Scorpion.getSocoalto() + "\n - Soco Fraco: " + Scorpion.getSocobaixo()
                                        + "\n - Chute Forte: " + Scorpion.getChutealto() + "\n - Chute Fraco: " + Scorpion.getChutebaixo() + "\n - Defesa: " + Scorpion.getDefesa()
                                        + "\n - Arremesso: " + Scorpion.getAgarra() + "\n - Especial: " + Scorpion.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Spear: " + Scorpion.spear() + "\n - Teleport: " + Scorpion.teleport() + "\n - Flying Punch: " + Scorpion.FlyngPunch() + "\n - Air Throw: " + Scorpion.AirThrow()
                                        + "\n - Combo 1: " + Scorpion.combo1() + "\n - Combo 2: " + Scorpion.combo2() + "\n - Fatality 1: " + Scorpion.fatality1() + "\n - Fatality 2: " + Scorpion.fatality2(), "SCORPION - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/Scorpion.png"));
                                break;
                            }
                            case 3: {

                                Subzero.setAgarra("R1");
                                Subzero.setChutealto("◯");
                                Subzero.setChutebaixo("X");
                                Subzero.setDefesa("R2");
                                Subzero.setEspecial("L2+R2");
                                Subzero.setSocoalto("▢");
                                Subzero.setSocobaixo("△");

                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + Subzero.getSocoalto() + "\n - Soco Fraco: " + Subzero.getSocobaixo()
                                        + "\n - Chute Forte: " + Subzero.getChutealto() + "\n - Chute Fraco: " + Subzero.getChutebaixo() + "\n - Defesa: " + Subzero.getDefesa()
                                        + "\n - Arremesso: " + Subzero.getAgarra() + "\n - Especial: " + Subzero.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Freeze: " + Subzero.Freeze() + "\n - Slide: " + Subzero.Slide() + "\n - Ice Clone: " + Subzero.IceClone() + "\n - Ice Shower: " + Subzero.IceShower()
                                        + "\n - Combo 1: " + Subzero.combo1() + "\n - Combo 2: " + Subzero.combo2() + "\n - Fatality 1: " + Subzero.fatality1() + "\n - Fatality 2: " + Subzero.fatality2(), "SUB-ZERO - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/Sub-zero.png"));
                                break;
                            }
                            case 4: {

                                Raiden.setAgarra("R1");
                                Raiden.setChutealto("◯");
                                Raiden.setChutebaixo("X");
                                Raiden.setDefesa("R2");
                                Raiden.setEspecial("L2+R2");
                                Raiden.setSocoalto("▢");
                                Raiden.setSocobaixo("△");

                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + Raiden.getSocoalto() + "\n - Soco Baixo: " + Raiden.getSocobaixo()
                                        + "\n - Chute Alto: " + Raiden.getChutealto() + "\n - Chute Fraco: " + Raiden.getChutebaixo() + "\n - Defesa: " + Raiden.getDefesa()
                                        + "\n - Arremesso: " + Raiden.getAgarra() + "\n - Especial: " + Raiden.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Lightning: " + Raiden.Lightning() + "\n - Reverse Lightning: " + Raiden.ReverseLightning() + "\n - Teleport: " + Raiden.Teleport()
                                        + "\n - Superman: " + Raiden.Superman()
                                        + "\n - Combo 1: " + Raiden.combo1() + "\n - Combo 2: " + Raiden.combo2() + "\n - Fatality 1: " + Raiden.fatality1() + "\n - Fatality 2: " + Raiden.fatality2(), "RAIDEN - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/raiden.png"));
                                break;
                            }
                            case 5: {

                                KungLao.setAgarra("R1");
                                KungLao.setChutealto("◯");
                                KungLao.setChutebaixo("X");
                                KungLao.setDefesa("R2");
                                KungLao.setEspecial("L2+R2");
                                KungLao.setSocoalto("▢");
                                KungLao.setSocobaixo("△");

                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + KungLao.getSocoalto() + "\n - Soco Baixo: " + KungLao.getSocobaixo()
                                        + "\n - Chute Alto: " + KungLao.getChutealto() + "\n - Chute Fraco: " + KungLao.getChutebaixo() + "\n - Defesa: " + KungLao.getDefesa()
                                        + "\n - Arremesso: " + KungLao.getAgarra() + "\n - Especial: " + KungLao.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Hat Toss: " + KungLao.HatToss() + "\n - Drop Kick: " + KungLao.DropKick() + "\n - Teleport: " + KungLao.Teleport()
                                        + "\n - Spin: " + KungLao.Spin()
                                        + "\n - Combo 1: " + KungLao.combo1() + "\n - Combo 2: " + KungLao.combo2() + "\n - Fatality 1: " + KungLao.fatality1() + "\n - Fatality 2: " + KungLao.fatality2(), "KUNG LAO - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/kung lao.png"));
                                break;
                            }
                            case 6: {

                                Kitana.setAgarra("R1");
                                Kitana.setChutealto("◯");
                                Kitana.setChutebaixo("X");
                                Kitana.setDefesa("R2");
                                Kitana.setEspecial("L2+R2");
                                Kitana.setSocoalto("▢");
                                Kitana.setSocobaixo("△");
                                JOptionPane.showMessageDialog(null, "---------- Comandos básicos ----------\n - Soco Forte: " + Kitana.getSocoalto() + "\n - Soco Baixo: " + Kitana.getSocobaixo()
                                        + "\n - Chute Alto: " + Kitana.getChutealto() + "\n - Chute Fraco: " + Kitana.getChutebaixo() + "\n - Defesa: " + Kitana.getDefesa()
                                        + "\n - Arremesso: " + Kitana.getAgarra() + "\n - Especial: " + Kitana.getEspecial() + "\n---------- Comandos Especiais ----------\n"
                                        + " - Hat Toss: " + Kitana.FanToss() + "\n - Fan Lift: " + Kitana.FanLift() + "\n - Square Wave Punch: " + Kitana.SquareWavePunch() + "\n - Swipe: " + Kitana.Swipe()
                                        + "\n - Combo 1: " + Kitana.combo1() + "\n - Combo 2: " + Kitana.combo2() + "\n - Fatality 1: " + Kitana.fatality1() + "\n - Fatality 2: " + Kitana.fatality2(), "Kitana - PS4", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/MK/src/mk/imagens/kitana.png"));
                                break;
                            }
                        }
                    }
                }

            }
        }
    }
}

