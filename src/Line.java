
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
public class Line extends Shape{

    
    public Line()
    {
       this.filled=PaintBrush.filled;
    }
    
    @Override
    public void draw(Graphics g) 
    {
        g.setColor(this.c);
        g.drawLine(this.getStartX(),this.getStartY(),this.getEndX(), this.getEndY());            
    }
    
}
