package caixa_eletronico;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Caixa_Eletronico {

    public static void main(String[] args) {
        int opcao = 6;
        Conta c = new Conta();
        Banco b = new Banco();
        JTextField linha1 = new JTextField();
        JTextField linha2 = new JTextField();
        JTextField linha3 = new JTextField();
        Object[] cadastro = {
            "Insira seu nome:", linha1,
            "Insira seu número de CPF :", linha2,
            "Insira o número da agência:", linha3,};
        int escolha = JOptionPane.showConfirmDialog(null, cadastro, "CADASTRO", JOptionPane.OK_CANCEL_OPTION, -1);
        if (escolha == JOptionPane.OK_OPTION) {
          JOptionPane.showMessageDialog(null,c.abrir(,linha2.getText()), "SUCESSO", JOptionPane.PLAIN_MESSAGE);
        } else {
            System.exit(0);
        }
        while (opcao != 0) {
            JTextField input = new JTextField();
            Object[] menu = {"----------------MENU---------------\n" + "\t\t\t\t\t\t\t\t1 - Depósito                  4 - Saldo \n" + "\t\t\t\t\t\t\t\t2 - Saque                       5 - Encerrar conta\n" + "\t\t\t\t\t\t\t\t3 - Extrato                     0 - Sair\n"
                + "------------------------------------\n" + "Insira a opção desejada:", input};
            String[] options = {"OK"};
            JOptionPane.showOptionDialog(null, menu, "BANCO", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
            opcao = (Integer.parseInt(input.getText()));
            switch (opcao) {
                case 1: {
                    JTextField d1 = new JTextField();
                    Object[] deposito = {"Insira o valor:", d1,};
                    int escolha1 = JOptionPane.showConfirmDialog(null, deposito, "DEPOSITO", JOptionPane.OK_CANCEL_OPTION, -1);
                    if (escolha1 == JOptionPane.OK_OPTION) {
                        if (c.deposito(Float.parseFloat(d1.getText())) == true) {
                            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso, seu saldo atual é: " + c.getSaldo(), "SUCESSO", JOptionPane.PLAIN_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Conta inativa.", "ERRO", JOptionPane.PLAIN_MESSAGE);
                        }
                    } else {
                        break;
                    }
                    break;
                }
                case 2: {
                    JTextField s1 = new JTextField();
                    Object[] retirar = {"Insira o valor:", s1,};
                    int escolha2 = JOptionPane.showConfirmDialog(null, retirar, "SAQUE", JOptionPane.OK_CANCEL_OPTION, -1);
                    if (escolha2 == JOptionPane.OK_OPTION) {
                        if (c.retirar(Float.parseFloat(s1.getText())) == true) {
                            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso, seu saldo atual é: " + c.getSaldo(), "SUCESSO", JOptionPane.PLAIN_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou conta inativa.", "ERRO", JOptionPane.PLAIN_MESSAGE);
                        }
                    } else {
                        break;
                    }
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "Nome: " + c.getNomecorrentista() + "\nNúmero da Conta: " + c.getNumeroconta()
                            + "\nCPF: " + c.getCpf() + "\nSaldo: " + c.getSaldo() + "\nBanco: " + b.buscar(c.getAgencia()), "EXTRATO", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "SALDO ATUAL: " + c.getSaldo(), "SALDO", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
                case 5: {
                    Integer confirm = 0;
                    confirm = JOptionPane.showConfirmDialog(null, "Voce deseja encerrar sua conta?"+"\n- Seu saldo atual é: "+c.getSaldo(), "ENCERRAR CONTA", JOptionPane.YES_NO_OPTION, -1);
                    if (confirm == JOptionPane.YES_OPTION) {
                        if (c.fechar() == true) {
                            JOptionPane.showMessageDialog(null, "Conta encerrada com sucesso!", "INFO", JOptionPane.PLAIN_MESSAGE);
                            System.exit(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Operação não realizada.", "INFO", JOptionPane.PLAIN_MESSAGE);
                            opcao = 6;
                        }
                    } else {
                        opcao = 6;
                        break;
                    }
                    break;
                }
                case 0: {
                    Integer confirm = 0;
                    confirm = JOptionPane.showConfirmDialog(null, "Voce deseja encerrar o programa?", null, JOptionPane.YES_NO_OPTION, -1);
                    if (confirm == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    } else {
                        opcao = 6;
                        break;
                    }
                    break;
                }
            }
        }
    }
}


