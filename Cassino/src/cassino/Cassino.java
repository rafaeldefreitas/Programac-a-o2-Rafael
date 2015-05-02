package cassino;

import javax.swing.JOptionPane;

public class Cassino {

    public static void main(String[] args) {
        float valordepo = 0;
        Integer opcao = 6, setor = 6, game = 6, roleta = 6;
        Cadastro jogador = new Cadastro();
        Dadosgraf dados = new Dadosgraf();
        Roletafrm rol = new Roletafrm();
        if (jogador.RealizarCadastro(JOptionPane.showInputDialog("NOME:", "Insira seu nome."), JOptionPane.showInputDialog("NOME DE LOGIN:", "Insira login desejado."), JOptionPane.showInputDialog("SENHA:", "Insira sua senha."), JOptionPane.showInputDialog("CONFIRME SUA SENHA:", "Insira sua senha novamente.")) == true) {
            JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO COM SUCESSO!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ERRO NO CADASTRO", "ERRO", JOptionPane.WARNING_MESSAGE);
            while (jogador.RealizarCadastro(JOptionPane.showInputDialog("NOME:", "Insira seu nome."), JOptionPane.showInputDialog("NOME DE LOGIN:", "Insira login desejado."), JOptionPane.showInputDialog("SENHA:", "Insira sua senha."), JOptionPane.showInputDialog("CONFIRME SUA SENHA:", "Insira sua senha novamente.")) != true) {
            }
            JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO COM SUCESSO!");
        }

        if (jogador.Entrar(JOptionPane.showInputDialog("Insira seu login:", "LOGIN"), JOptionPane.showInputDialog("  SENHA", "Insira sua senha.")) == true) {
            while (opcao != 9) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(("Olá " + jogador.getNusuario() + ", selecione a opção desejada: \n"
                        + "1 - JOGAR\n"
                        + "2 - LOJA\n"
                        + "3 - COMPRAR CASH\n"
                        + "0 - SAIR\n")));
                switch (opcao) {
                    case 1: {
                        while (game != 0) {
                            game = Integer.parseInt(JOptionPane.showInputDialog(("SELECIONE A OPERAÇÃO DESEJADA: \n"
                                    + "1 - JOGAR DADOS\n"
                                    + "2 - ROLETA\n"
                                    + "0 - SAIR\n")));
                            switch (game) {
                                case 1: {
                                    jogador.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                    if (jogador.getAposta() <= jogador.getGold()) {
                                        jogador.setNumescolhido(Integer.parseInt(JOptionPane.showInputDialog("Insira o número desejado:")));
                                        if (jogador.getNumescolhido() < 12 || jogador.getNumescolhido() > 2) {
                                            if (jogador.jogarDados() == true) {
                                                dados.desenha(jogador.getPrimeirodado(), jogador.getSegundodado(), "vermelho", "azul", "Você ganhou, seu saldo atual é: " + jogador.getGold());
                                            } else {
                                                dados.desenha(jogador.getPrimeirodado(), jogador.getSegundodado(), "vermelho", "branco", "Você perdeu, seu saldo atual é: " + jogador.getGold());

                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "NUMERO INVALIDO.", "ERRO", JOptionPane.WARNING_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                    }
                                    break;
                                }
                                case 2: {
                                    while (roleta != 0) {
                                        roleta = Integer.parseInt(JOptionPane.showInputDialog(("SELECIONE A OPERAÇÃO DESEJADA: \n"
                                                + "1 - 0-36\n"
                                                + "2 - 1-12 / 13-24 / 25-36\n"
                                                + "3 - 1-18 / 19-36\n"
                                                + "4 - Par ou Ímpar\n"
                                                + "0 - SAIR\n")));
                                        switch (roleta) {
                                            case 1: {
                                                jogador.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                if (jogador.getAposta() <= jogador.getGold()) {
                                                    jogador.setNumescolhido(Integer.parseInt(JOptionPane.showInputDialog("Insira o número desejado:")));
                                                    if (jogador.roleta1() == true) {
                                                        rol.rodar("Você ganhou, seu saldo atual é: " + jogador.getGold(), jogador.getNumroleta());
                                                     //   JOptionPane.showMessageDialog(null, "Número sorteado: " + jogador.getNumroleta() + "\nVocê ganhou, seu saldo atual é: " + jogador.getGold());

                                                    } else {
                                                       rol.rodar("Você perdeu, seu saldo atual é: " + jogador.getGold(), jogador.getNumroleta());
// JOptionPane.showMessageDialog(null, "Número sorteado: " + jogador.getNumroleta() + "\nVocê perdeu, seu saldo atual é: " + jogador.getGold());
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                                }
                                                break;
                                            }
                                            case 2: {
                                                jogador.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                if (jogador.getAposta() <= jogador.getGold()) {
                                                    jogador.setNumescolhido(Integer.parseInt(JOptionPane.showInputDialog(("SELECIONE A OPERAÇÃO DESEJADA: \n"
                                                            + "1 - 1-12\n"
                                                            + "2 - 13-24\n"
                                                            + "3 - 25-36"))));
                                                    if (jogador.roleta2() == true) {
                                                        JOptionPane.showMessageDialog(null, "\nVocê ganhou, seu saldo atual é: " + jogador.getGold());

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "\nVocê perdeu, seu saldo atual é: " + jogador.getGold());
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                                }
                                                break;
                                            }
                                            case 3: {
                                                jogador.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                if (jogador.getAposta() <= jogador.getGold()) {
                                                    jogador.setNumescolhido(Integer.parseInt(JOptionPane.showInputDialog(("SELECIONE A OPERAÇÃO DESEJADA: \n"
                                                            + "1 - 1-18\n"
                                                            + "2 - 19-36\n"))));
                                                    if (jogador.roleta3() == true) {
                                                        JOptionPane.showMessageDialog(null, "\nVocê ganhou, seu saldo atual é: " + jogador.getGold());

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "\nVocê perdeu, seu saldo atual é: " + jogador.getGold());
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                                }
                                                break;
                                            }
                                            case 4: {
                                                jogador.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                if (jogador.getAposta() <= jogador.getGold()) {
                                                    jogador.setNumescolhido(Integer.parseInt(JOptionPane.showInputDialog(" SELECIONE A OPERAÇÃO DESEJADA:  \n"
                                                            + "1 - Par\n"
                                                            + "2 - Ímpar\n")));
                                                    if (jogador.roleta4() == true) {
                                                        JOptionPane.showMessageDialog(null, "Número sorteado: " + jogador.getNumroleta() + "\nVocê ganhou, seu saldo atual é: " + jogador.getGold());

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Número sorteado: " + jogador.getNumroleta() + "\nVocê perdeu, seu saldo atual é: " + jogador.getGold());
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        while (setor != 0) {
                            setor = Integer.parseInt(JOptionPane.showInputDialog(("SELECIONE A OPERAÇÃO DESEJADA: \n"
                                    + "1 - ROUPAS\n"
                                    + "2 - ACESSORIOS\n"
                                    + "3 - SAPATOS\n"
                                    + "0 - SAIR\n")));
                            switch (setor) {
                                case 1: {
                                    if ((jogador.compraRoupa()) == true) {
                                        jogador.catalogo(JOptionPane.showInputDialog("----LOJA----\n"
                                                + "1 - TERNO\n"
                                                + "2 - SMOKING\n"
                                                + "3 - VESTIDO ROSA\n"
                                                + "4 - TUBINHO DOURADO\n"
                                                + "INSIRA O CODIGO DO ITEM DESEJADO:"));
                                        JOptionPane.showMessageDialog(null, "SEU SALDO ATUAL É: " + jogador.getCash());
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.", "ERRO", JOptionPane.WARNING_MESSAGE);
                                        break;
                                    }
                                }
                                case 2: {
                                    if ((jogador.comprarAcessorio()) == true) {
                                        jogador.catalogo(JOptionPane.showInputDialog("----LOJA----\n"
                                                + "5 - CORRENTE DE OURO\n"
                                                + "6 - RELOGIO\n"
                                                + "7 - SMARTPHONE\n"
                                                + "8 - CHAPEU\n"
                                                + "INSIRA O CODIGO DO ITEM DESEJADO:"));
                                        JOptionPane.showMessageDialog(null, "SEU SALDO ATUAL É: " + jogador.getCash());
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.", "ERRO", JOptionPane.WARNING_MESSAGE);
                                        break;
                                    }
                                }

                                case 3: {
                                    if ((jogador.comprarSapato()) == true) {
                                        jogador.catalogo(JOptionPane.showInputDialog("----LOJA----\n"
                                                + "A - CHINELO\n"
                                                + "B - TENIS\n"
                                                + "C - SAPATO DE COURO\n"
                                                + "D - SAPATÊNIS\n"
                                                + "INSIRA O CODIGO DO ITEM DESEJADO:"));
                                        JOptionPane.showMessageDialog(null, "SEU SALDO ATUAL É: " + jogador.getCash());
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.", "ERRO", JOptionPane.WARNING_MESSAGE);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    }

                    case 3: {
                        jogador.setNcartao(JOptionPane.showInputDialog("Insira o número do cartão:"));
                        jogador.setValorcartao(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado:")));
                        if (jogador.InserirCash() == true) {
                            JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO COM EXITO!\n SEU SALDO ATUAL É: " + jogador.getCash());
                        } else {
                            JOptionPane.showMessageDialog(null, "Cartão de Crédito inválido ou operação não aprovada.", "OPERAÇÃO REALIZADA", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    }
                    case 0: {
                        Integer confirm = 0;
                        confirm = JOptionPane.showConfirmDialog(null, "Voce deseja encerrar o programa?", null, JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        } else {
                            confirm = 9;
                        }
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SENHA OU USUARIO INVALIDOS.", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }
}
