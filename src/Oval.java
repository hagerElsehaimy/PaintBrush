
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hagar
 */
public class Oval extends Shape{
    
    public Oval()
    {
        this.filled=PaintBrush.filled; 
    }

    
    @Override
    public void draw(Graphics g) 
    {
        g.setColor(this.c);
        if(this.filled)
        {
            g.fillOval(this.getStartX(),this.getStartY(),this.getEndX(), this.getEndY());                
        }
        else
        {
            g.drawOval(this.getStartX(),this.getStartY(),this.getEndX(), this.getEndY());    

        }
        
    }
    
}
