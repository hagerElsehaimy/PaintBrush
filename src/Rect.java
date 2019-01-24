
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;

/**
 *
 * @author hagar
 */
public class Rect extends Shape{

    public Rect()
    {
        this.filled=PaintBrush.filled;
    }
    
    
    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.c);
        if(this.filled)
        {
            g.fillRect(this.getStartX(),this.getStartY(),this.getEndX(), this.getEndY());
        }
        else
        {
            g.drawRect(this.getStartX(),this.getStartY(),this.getEndX(), this.getEndY());            
        }
    }
    
}
