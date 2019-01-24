/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hagar
 */
public class ShapeFactory 
{
     
    public static Shape getShape(String shape_type)
    {
        if(shape_type.equalsIgnoreCase("line"))
        {
            return new Line();
        }
        else if (shape_type.equalsIgnoreCase("rect"))
        {
            return new Rect();
        }
        else if (shape_type.equalsIgnoreCase("oval"))
        {
            return new Oval();
        }
        else if(shape_type.equalsIgnoreCase("eraser"))
        {
            return new Eraser();
        }
        else if (shape_type.equalsIgnoreCase("free"))
        {
            return new Line();
        }
        return null;
    }
}
