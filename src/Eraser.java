
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
public class Eraser extends Shape{

    private Color eraser = Color.white;
    boolean clear;
    int width,height;
    //private Color drawing_color = new Color(ColorSlider.r,ColorSlider.g,ColorSlider.b);
    public Eraser(int x2, int y2)
    {
        this.clear=PaintBrush.clear;
        this.width=x2;
        this.height=y2;
        
    }
    public Eraser()
    {
        this.clear=PaintBrush.clear;
    }
    

    
    @Override
    public void draw(Graphics g)
    {
        g.setColor(eraser);
        if(clear)
        {
            g.fillRect(0, 0, this.width, this.height);            
        }
        else
        {
             g.fillRect(this.getStartX(), this.getStartY(), 15, 15);
            
        }
        
    }
    
}
