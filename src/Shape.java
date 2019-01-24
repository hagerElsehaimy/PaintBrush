
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
public class Shape {

    private int x1,y1,x2,y2;
    protected Color c;
    protected boolean filled;


    public Shape()
    {
        this.c=new Color(ColorSlider.r,ColorSlider.g,ColorSlider.b);
    }
    public void draw(Graphics g)
    {
        
    }
    
    public void setStartX(int x1)
    {
        this.x1=x1;
    }
    
    public void setStartY(int y1)
    {
        this.y1=y1;
    }
    
    public void setEndX(int x2)
    {
        this.x2=x2;
    }
    
    public void setEndY(int y2)
    {
        this.y2=y2;
    }
    
    public int getStartX()
    {
        return this.x1;
    }
    
    public int getStartY()
    {
        return this.y1;
    }
    
    public int getEndX()
    {
        return this.x2;
    }
    
    public int getEndY()
    {
        return this.y2;
    }
        
}
