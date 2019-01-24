/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author hagar
 */
public class ColorSlider extends JFrame implements ChangeListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   private JSlider redSlider, greenSlider, blueSlider;

   private JLabel redLabel, greenLabel, blueLabel;

   private JPanel colorbox;
   
   public static int r,g,b;
              // Color box for displaying the color.
   public ColorSlider()
   {
       this.setVisible(true);
       redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
       greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
       blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

       /* Create JLabels showing current RGB values. */

       redLabel = new JLabel(" R = 0");
       greenLabel = new JLabel(" G = 0");
       blueLabel = new JLabel(" B = 0");

       /* Set the colors of the labels */

       redLabel.setBackground(Color.white);
       redLabel.setForeground(Color.red);
       redLabel.setOpaque(true);
       greenLabel.setBackground(Color.white);
       greenLabel.setForeground(new Color(0,250,0));
       greenLabel.setOpaque(true);
       blueLabel.setBackground(Color.white);
       blueLabel.setForeground(Color.blue);
       blueLabel.setOpaque(true);

       /* Set the applet to listen for changes to the JSliders' values */

       redSlider.addChangeListener(this);
       greenSlider.addChangeListener(this);
       blueSlider.addChangeListener(this);

       /* Create a JPanel whose background color will always be set to the
          currently selected color.  Otherwise, the panel is empty. */

       colorbox = new JPanel();
       colorbox.setBackground(Color.black);

       /* Create the applet layout, which consists of a row of
          three equal-sized regions holding the JSliders,
          the Labels, and the color box. */

       setBackground(Color.red);
       getContentPane().setBackground(Color.gray);

       getContentPane().setLayout(new GridLayout(1,3,3,3));
       JPanel scrolls = new JPanel();
       JPanel labels = new JPanel();
       scrolls.setBackground(Color.gray);
       labels.setBackground(Color.gray);
       getContentPane().add(scrolls);
       getContentPane().add(labels);
       getContentPane().add(colorbox);

       /* Add the JSliders and the JLabels to their respective panels. */

       scrolls.setLayout(new GridLayout(3,1,2,2));
       scrolls.add(redSlider);
       scrolls.add(greenSlider);
       scrolls.add(blueSlider);

       labels.setLayout(new GridLayout(3,1,2,2));
       labels.add(redLabel);
       labels.add(greenLabel);
       labels.add(blueLabel);
       this.setSize(400, 400);
       
   }


    @Override
    public void stateChanged(ChangeEvent evt) {
        // TODO Auto-generated method stub
        /* This is called when the user has changed the value on
         one of the sliders.  All the sliders are checked,
          the labels are set to display the correct values,
          and the color box is set to correspond to the new color.*/
        r = redSlider.getValue();
        g = greenSlider.getValue();
        b = blueSlider.getValue();
        redLabel.setText(" R = " + r);
        greenLabel.setText(" G = " + g);
        blueLabel.setText(" B = " + b);
        colorbox.setBackground(new Color(r,g,b));
        
    
    }
// TODO overwrite start(), stop() and destroy() methods
}