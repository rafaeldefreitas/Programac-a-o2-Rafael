/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cassino;

import javax.swing.SwingUtilities;

/**
 *
 * @author marcelosiedler
 */
public class Desenhando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dadosgraf bs = new Dadosgraf();
        bs.desenha(3,2,"vermelho", "azul", "Você ganhou 500 golds");
        
        Roletafrm rol = new Roletafrm();
        
         Double dado1 = Math.random()*6;
         Double dado2 = Math.random()*6;
        
        Integer dado1Int = dado1.intValue();
        Integer dado2Int = dado2.intValue();
        System.out.println(dado1Int);
        rol.rodar("Texto de Teste", 23);
    }
    
}
