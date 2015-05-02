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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class DadoGraf extends JPanel {
   
    private Integer um;
    private Integer dois;
    private String cordado;
    private String cornumero;
    private String msg;

    public String getCordado() {
        return cordado;
    }

    public void setCordado(String cordado) {
        this.cordado = cordado;
    }

    public String getCornumero() {
        return cornumero;
    }

    public void setCornumero(String cornumero) {
        this.cornumero = cornumero;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUm() {
        return um;
    }

    public void setUm(Integer um) {
        this.um = um;
    }

    public Integer getDois() {
        return dois;
    }

    public void setDois(Integer dois) {
        this.dois = dois;
    }
    
    public DadoGraf()
    {
    
    }
    
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Cor cor = new Cor();
        
        cor.montaCor(this.getCordado());
        g2d.setColor(new Color(cor.getR(), cor.getG(), cor.getB()));

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        //g2d.setRenderingHints(rh);

        //g2d.fillRect(30, 20, 50, 50);
        //g2d.fillRect(120, 20, 90, 60);
        Integer x = 50;
        g2d.fillRoundRect(x-15, 20, 70, 60, 45, 45);
         
        g2d.fillRoundRect(x+75, 20, 70, 60, 45, 45);

        //g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
        //g2d.fillArc(120, 130, 110, 100, 5, 150);
        cor.montaCor(this.getCornumero());
        g2d.setColor(new Color(cor.getR(), cor.getG(), cor.getB()));
        
        
        //Dado 1
        switch(this.um)
        {
            case 1:
                //g2d.fillOval(265, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                //g2d.fillOval(295, 60, 10, 10); 
                break;
            case 2:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                //g2d.fillOval(280, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 3:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(x+15, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 4:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                //g2d.fillOval(280, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 5:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 6:
                 g2d.fillOval(x, 30, 10, 10); 
                g2d.fillOval(x, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(x+15, 30, 10, 10); 
                //g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                g2d.fillOval(x+30, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
        
        }
        
        
        x = x +90; 
       //Dado 2
        switch(this.dois)
        {
            case 1:
                //g2d.fillOval(265, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                //g2d.fillOval(295, 60, 10, 10); 
                break;
            case 2:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                //g2d.fillOval(280, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 3:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                //g2d.fillOval(265, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(x+15, 60, 10, 10); 
                //g2d.fillOval(295, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 4:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                //g2d.fillOval(280, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 5:
                g2d.fillOval(x, 30, 10, 10); 
                //g2d.fillOval(265, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                //g2d.fillOval(295, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
            case 6:
                 g2d.fillOval(x, 30, 10, 10); 
                g2d.fillOval(x, 45, 10, 10); 
                g2d.fillOval(x, 60, 10, 10); 
                //g2d.fillOval(280, 30, 10, 10); 
                //g2d.fillOval(x+15, 45, 10, 10); 
                //g2d.fillOval(280, 60, 10, 10); 
                g2d.fillOval(x+30, 30, 10, 10); 
                g2d.fillOval(x+30, 45, 10, 10); 
                g2d.fillOval(x+30, 60, 10, 10); 
                break;
        
        }
        g2d.setColor(new Color(0, 0, 0));
        g.drawString(this.msg, 50, 100);
        
   } 

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }    
}


