package televisao;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Televisao {

    public static void main(String[] args) {
        int opcao = 6;
        Atores a = new Atores();
        Novela n = new Novela();
        Emissora e = new Emissora();
        Apresentador b = new Apresentador();
        while (opcao <= 99) {
            JTextField input = new JTextField();
            Object[] message = {"----------------MENU---------------\n" + "\t\t\t\t\t\t\t\t1 - Atores          4 - Apresentador \n" + "\t\t\t\t\t\t\t\t2 - Novela         \n" + "\t\t\t\t\t\t\t\t3 - Emissora\n" + "------------------------------------\n" + "Insira a opção desejada:", input};
            String[] options = {"OK", "SAIR"};
            String[] sexo = {"SELECIONE", "Masculino", "Feminino"};
            int sairok = JOptionPane.showOptionDialog(null, message, "TELEVISÃO", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/menu.png"), options, null);
            switch(sairok){
                case JOptionPane.YES_OPTION: {
                opcao = (Integer.parseInt(input.getText()));
                switch (opcao) {

                    case 1: {
                        JTextField field1 = new JTextField();
                        JTextField field2 = new JTextField();
                        JTextField field3 = new JTextField();
                        JTextField field4 = new JTextField();
                        JTextField field5 = new JTextField();
                        JTextField field6 = new JTextField();
                        JTextField field7 = new JTextField();
                        JTextField field8 = new JTextField();
                        JTextField field9 = new JTextField();
                        JComboBox field10 = new JComboBox(sexo);
                        Object[] entradas1 = {
                            "Insira o nome artístico do artista:", field1,
                            "Insira a data de nascimento(DD/MM/AAAA):", field2,
                            "Insira o email do ator/artista:", field3,
                            "Insira a cidade do ator/artista:", field7,
                            "Insira o estado do ator/artista:", field8,
                            "Insira o endereço do ator/artista", field9,
                            "Insira o salario fixo do ator/atriz:", field4,
                            "Insira o cache do ator/atriz::", field5,
                            "Insira o número de eventos participados pelo ator/artista:", field6,
                            "Insira o sexo:", field10};

                        int escolha = JOptionPane.showConfirmDialog(null, entradas1, "ATOR/ATRIZ", JOptionPane.OK_CANCEL_OPTION, 0, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/atoricone.png"));
                        if (escolha == JOptionPane.OK_OPTION) {
                            a.setNomeartistico(field1.getText());
                            a.setDatanasc(field2.getText());
                            a.setEmail(field3.getText());
                            a.setSalariomes(Double.parseDouble(field4.getText()));
                            a.setCache(Double.parseDouble(field5.getText()));
                            a.setQuantnovela(Integer.parseInt(field6.getText()));
                            a.setCidade(field7.getText());
                            a.setEstado(field8.getText());
                            a.setEndereco(field9.getText());
                            a.setSexo((String) field10.getSelectedItem());
                            if (a.getSexo().equals("Masculino")) {
                                JOptionPane.showMessageDialog(null, "Nome Artistico: " + a.getNomeartistico() + "\nData de nascimentos: " + a.getDatanasc() + "\nEmail: " + a.getEmail()
                                        + "\nCidade: " + a.getCidade() + "\nEstado: " + a.getEstado() + "\nEnderço: " + a.getEndereco() + "\nQuantidade de novelas: " + a.getQuantnovela() + "\nGanhos mensais: " + a.calcularGanhos() + "\nStatus: " + a.statusator(), "ATOR", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/Ator.png"));
                            } else {
                                JOptionPane.showMessageDialog(null, "Nome Artistico: " + a.getNomeartistico() + "\nData de nascimentos: " + a.getDatanasc() + "\nEmail: " + a.getEmail()
                                        + "\nCidade: " + a.getCidade() + "\nEstado: " + a.getEstado() + "\nEnderço: " + a.getEndereco() + "\nQuantidade de novelas: " + a.getQuantnovela() + "\nGanhos mensais: " + a.calcularGanhos() + "\nStatus: " + a.statusator(), "ATRIZ", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/Atriz.png"));
                            }
                            break;
                        } else {
                            break;
                        }
                    }
                    case 2: {
                        JTextField field1 = new JTextField();
                        JTextField field2 = new JTextField();
                        JTextField field3 = new JTextField();
                        JTextField field4 = new JTextField();
                        JTextField field5 = new JTextField();
                        String[] itens = {"Sim", "Não"};
                        JComboBox field6 = new JComboBox(itens);
                        JComboBox field7 = new JComboBox(itens);
                        JComboBox field8 = new JComboBox(itens);
                        String clas;
                        Object[] entradas2 = {
                            "Insira o título da novela:", field1,
                            "Insira o autor da novela:", field2,
                            "Insira a emissora:", field3,
                            "Insira a duração:", field4,
                            "Número de pessoas assistindo:", field5,
                            "Possui cenas de uso drogas?", field6,
                            "Possui cenas de sexo explícito?", field7,
                            "Possui cenas de violência extrema?", field8
                        };

                        int escolha2 = JOptionPane.showConfirmDialog(null, entradas2, "NOVELA", JOptionPane.OK_CANCEL_OPTION, 0, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/tv.png"));
                        if (escolha2 == JOptionPane.OK_OPTION) {
                            /* n.setD(JOptionPane.showConfirmDialog(null, "Possui cenas de uso drogas?", "NOVELA", JOptionPane.YES_NO_OPTION, -1));
                             n.setS(JOptionPane.showConfirmDialog(null, "Possui cenas de sexo explícito?", "NOVELA", JOptionPane.YES_NO_OPTION, -1));
                             n.setV(JOptionPane.showConfirmDialog(null, "Possui cenas de violência extrema?", "NOVELA", JOptionPane.YES_NO_OPTION, -1));*/
                            n.setTitulo(field1.getText());
                            n.setAutornovela(field2.getText());
                            n.setEmissora(field3.getText());
                            n.setDuracao(Integer.parseInt(field4.getText()));
                            n.setNpessoas(Double.parseDouble(field5.getText()));
                            n.setD((String) field6.getSelectedItem());
                            n.setS((String) field7.getSelectedItem());
                            n.setV((String) field8.getSelectedItem());

                            if (n.obterClassificacao() == 0) {
                                clas = "LIVRE";
                            } else if (n.obterClassificacao() == 14) {
                                clas = "+14";
                            } else if (n.obterClassificacao() == 16) {
                                clas = "+16";
                            } else {
                                clas = "+18";
                            }
                            JOptionPane.showMessageDialog(null, "Título: " + n.getTitulo() + "\nAutor da novela: " + n.getAutornovela() + "\nDuração: " + n.getDuracao() + "min" + "\nEmissora: " + n.getEmissora() + "\nMédia IBOPE: " + n.calcularIbope() + "\nClassifcação: " + clas, "NOVELA", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/tv.png"));
                            break;
                        } else if (escolha2 == JOptionPane.CANCEL_OPTION) {
                            break;
                        }
                    }
                     case 3: {
                        String canal;
                        JTextField field1 = new JTextField();
                        JTextField field2 = new JTextField();
                        JTextField field3 = new JTextField();
                        JTextField field4 = new JTextField();
                        String[] itens = {"Sim", "Não"};
                        JComboBox field5 = new JComboBox(itens);
                        Object[] entradas3 = {
                            "Insira o nome:", field1,
                            "Insira o número do canal:", field2,
                            "Insira a cidade sede:", field3,
                            "Insira o endereço:", field4,
                            "Canal aberto?", field5,};

                        int escolha3 = JOptionPane.showConfirmDialog(null, entradas3, "EMISSORA", JOptionPane.OK_CANCEL_OPTION, 0, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/tv3.png"));
                        if (escolha3 == JOptionPane.OK_OPTION) {
                            //  e.setE(JOptionPane.showConfirmDialog(null, "Canal aberto ?", "EMISSORA", JOptionPane.YES_NO_OPTION, -1));
                            e.setNome(field1.getText());
                            e.setNcanal(Integer.parseInt(field2.getText()));
                            e.setCidade(field3.getText());
                            e.setEndereco(field4.getText());
                            e.setE((String) field5.getSelectedItem());
                            if (e.isAberta() == true) {
                                canal = "Aberto";
                            } else {
                                canal = "Fechado";
                            }
                            JOptionPane.showMessageDialog(null, "Nome: " + e.getNome() + "\nCidade: " + e.getCidade() + "\nEndereço: " + e.getEndereco() + "\nNº Canal: " + e.getNcanal() + "\nSinal: " + canal, "EMISSORA", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/tv3.png"));
                        } else if (escolha3 == JOptionPane.CANCEL_OPTION) {
                            break;
                        }
                        break;
                    }
                    case 4: {
                        JTextField field1 = new JTextField();
                        JTextField field2 = new JTextField();
                        JTextField field3 = new JTextField();
                        JTextField field4 = new JTextField();
                        JTextField field5 = new JTextField();
                        JTextField field6 = new JTextField();
                        JTextField field7 = new JTextField();
                        JTextField field8 = new JTextField();
                        JTextField field9 = new JTextField();
                        JTextField field10 = new JTextField();
                        JTextField field11 = new JTextField();
                        JTextField field12 = new JTextField();

                        Object[] entradas = {
                            "Nome:", field1,
                            "Nome Artistico:", field2,
                            "Programa:", field3,
                            "Data de Nascimento:", field4,
                            "Cidade:", field5,
                            "Estado:", field6,
                            "Email:", field7,
                            "Enderço:", field12,
                            "Salário:", field8,
                            "Cache:", field9,
                            "Dinheiro por marketing:", field10,
                            "Número de evento:", field11};
                        int escolha4 = JOptionPane.showConfirmDialog(null, entradas, "APRESENTADOR", JOptionPane.OK_CANCEL_OPTION, 0, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/a.png"));
                        if (escolha4 == JOptionPane.OK_OPTION) {
                            b.setNome(field1.getText());
                            b.setNomeartistico(field2.getText());
                            b.setPrograma(field3.getText());
                            b.setDatanasc(field4.getText());
                            b.setCidade(field5.getText());
                            b.setEstado(field6.getText());
                            b.setEmail(field7.getText());
                            b.setSalariomes(Double.parseDouble(field8.getText()));
                            b.setCache(Double.parseDouble(field9.getText()));
                            b.setMkt(Double.parseDouble(field10.getText()));
                            b.setEvento(Integer.parseInt(field11.getText()));
                            b.setEndereco(field12.getText());
                            JOptionPane.showMessageDialog(null, "Nome: " + b.getNome() + "\nNome artístico: " + b.getNomeartistico() + "\nPrograma: " + b.getPrograma()
                                    + "\nData de nascimento: " + b.getDatanasc() + "\nCidade: " + b.getCidade() + "\nEstado: " + b.getEstado() + "\nEndereço: " + b.getEndereco()
                                    + "\nEmail: " + b.getEmail() + "\nGanho mensal: " + b.calcularGanhos(), "APRESENTADOR", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("/Users/rafaelfreitas/NetBeansProjects/Televisao/src/Icone/a.png"));
                        } else if (escolha4 == JOptionPane.CANCEL_OPTION) {
                            break;
                        }
                        break;
                    }
                }
                break;
            } case JOptionPane.NO_OPTION: {
                Integer confirm = 0;
                confirm = JOptionPane.showConfirmDialog(null, "Voce deseja encerrar o programa?", null, JOptionPane.YES_NO_OPTION, -1);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                  break;  
                }
                break;
            }
        }
    }
}
}
