/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cassino;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author marcelosiedler
 */
public class Dadosgraf extends JFrame {

    
    public Dadosgraf() {

        
    }
    /**
    * @param cordado Passar a cor do dado, pode ser vermelho,verde,azul,amarelo,branco ou preto
    * @param cornumero Passar a cor do número, pode ser vermelho,verde,azul,amarelo,branco ou preto
    */
    public void desenha(Integer dado1, Integer dado2,String cordado, String cornumero,String msg)
    {
        setTitle("Dados sorteados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DadoGraf d = new DadoGraf();
        d.setUm(dado1);
        d.setDois(dado2);
        d.setMsg(msg);
        d.setCordado(cordado);
        d.setCornumero(cornumero);
        add(d);
        
        setSize(350, 250);
        setLocationRelativeTo(null); 
        this.setVisible(true);
    }
    
    public void roleta(Integer sorteado,String mensagem)
    {
        setTitle("Dados sorteados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel imageLabel = new JLabel();
         ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "snoopy_dancing.gif"));
            imageLabel.setIcon(ii);
        setSize(350, 250);
        setLocationRelativeTo(null); 
        this.setVisible(true);
    }
 

    
}

