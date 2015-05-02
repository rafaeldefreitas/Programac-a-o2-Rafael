/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cassino;

/**
 *
 * @author marcelosiedler
 */
public  class FuncoesJogo {
    
    public Integer numeroAleatorio(Integer max)
    {
        Double d = Math.random()*100;
        
        while(d>max)
        {
            d = Math.random()*100;
        }
        return d.intValue();
    
    }
    
}
