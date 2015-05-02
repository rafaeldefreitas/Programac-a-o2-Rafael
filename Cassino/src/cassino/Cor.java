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
public class Cor {
    
    private Integer r,g,b;

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
    
    //para colocar mais cores ver em:
    //http://cloford.com/resources/colours/500col.htm
    public void montaCor(String cor)
    {
        if(cor.equals("vermelho"))
        {
            this.r = 255;
            this.g = 0;
            this.b=0;
        }
        else if(cor.equals("azul"))
        {
            this.r = 0;
            this.g = 0;
            this.b=255;
        }
        else if(cor.equals("verde"))
        {
            this.r = 0;
            this.g = 255;
            this.b=0;
        }
        else if(cor.equals("branco"))
        {
            this.r = 255;
            this.g = 255;
            this.b=255;
        }
        else if(cor.equals("preto"))
        {
            this.r = 0;
            this.g = 0;
            this.b=0;
        }
        else if(cor.equals("amarelo"))
        {
            this.r = 255;
            this.g = 215;
            this.b=0;
        }
        else
        {
            this.r = 0;
            this.g = 0;
            this.b=0;
        }
    }
    
}
