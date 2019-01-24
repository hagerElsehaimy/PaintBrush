/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
//import javax.swing.*;

/**
 *
 * @author hagar
 */
public class PaintBrush extends Applet{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Checkbox fill = new Checkbox("fill");
    
    Button[] btns = new Button[8];
    String[] btns_title = {"Rect","Oval","line","erase","clear","color","free hand","save"};
   
    Shape sh = new Shape();
    static ArrayList<Shape> s = new ArrayList();

    static boolean clear = false;
    static boolean filled = false;
    static String shape_type = "";
    boolean dragged=false;
    @Override
   public void init()
   {
    this.setLayout(new FlowLayout());
    this.setSize(600, 600);
    this.setBackground(Color.white);
    
    for(int i=0;i<btns.length;i++)
    {
        btns[i]=new Button(btns_title[i]);
        this.add(btns[i]);
        switch(i)
        {
            case 0:
            case 1:
            case 2:
            btns[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                    if(ae.getSource() == btns[0])
                    {
                        PaintBrush.shape_type = "rect";
                    }
                    else if (ae.getSource() == btns[1])
                    {
                        PaintBrush.shape_type = "oval";

                    }
                    else if (ae.getSource() == btns[2])
                    {
                        PaintBrush.shape_type = "line";

                    }
                        
                PaintBrush.this.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent me) {

                            }
                            @Override
                            public void mousePressed(MouseEvent me) {
                                dragged=false;
                                sh=ShapeFactory.getShape(shape_type);
                                sh.setStartX(me.getX());
                                sh.setStartY(me.getY());
                            }

                            @Override
                            public void mouseReleased(MouseEvent me) {

                                if(dragged)
                                {
                    //                sh.setEndX(me.getX());
                    //                sh.setEndY(me.getY());
                                    s.add(sh);                                    
                                    PaintBrush.this.repaint();
                                }
                                
                            
                            }
                            @Override
                            public void mouseEntered(MouseEvent me) {

                            }

                            @Override
                            public void mouseExited(MouseEvent me) {

                            }
                        });

                        PaintBrush.this.addMouseMotionListener(new MouseMotionListener() {

                                  @Override
                              public void mouseDragged(MouseEvent me) 
                              {
                                  dragged=true;
                                 sh.setEndX(me.getX());
                                 sh.setEndY(me.getY());
                                s.add(sh);                   
                                 PaintBrush.this.repaint();

                              }

                              @Override
                              public void mouseMoved(MouseEvent me) {
                              }
                              }

                             );
              
                            }
                              
                        });
                  break;
            
            case 3:
            case 4:
                btns[i].addActionListener(new ActionListener() {
                        
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if(ae.getSource()==btns[3])
                    {
                        shape_type="eraser";
                        PaintBrush.clear=false;

                    PaintBrush.this.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent me) {

                        }
                        @Override
                        public void mousePressed(MouseEvent me) {
                        
                            sh= new Eraser();
                            sh.setStartX(me.getX());
                            sh.setStartY(me.getY());
                        }

                        @Override
                        public void mouseReleased(MouseEvent me) {
                                sh.setEndX(me.getX());
                                sh.setEndY(me.getY());     
                        }

                        @Override
                        public void mouseEntered(MouseEvent me) {

                        }

                        @Override
                        public void mouseExited(MouseEvent me) {

                        }
                    });
                    
                    PaintBrush.this.addMouseMotionListener(new MouseMotionListener() {
                            @Override
                            public void mouseDragged(MouseEvent me) {
                            sh= new Eraser();
                            sh.setStartX(me.getX());
                            sh.setStartY(me.getY());
                            if(!shape_type.equalsIgnoreCase("eraser"))
                                sh=new Shape();
                            s.add(sh);

                            }

                            @Override
                            public void mouseMoved(MouseEvent me) {
                            }
                        });
                    }
                    else if (ae.getSource()== btns[4])
                    {
                        PaintBrush.clear=true;
                        s.clear();
                      //  PaintBrush.this.repaint();
                    //    sh= new Eraser(PaintBrush.this.getWidth(),PaintBrush.this.getHeight());
                        
                    }
                         PaintBrush.this.repaint();
                    }
                });
                break;
                
            case 5:

                   btns[i].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                      
                         new ColorSlider();
                    }
                           });
                   break;

            case 6:
                btns[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        shape_type="free";
//                        PaintBrush.clear=false;

                    PaintBrush.this.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent me) {

                        }
                        @Override
                        public void mousePressed(MouseEvent me) {
                        
                            sh= new Line();
                            sh.setStartX(me.getX());
                            sh.setStartY(me.getY());
                        }

                        @Override
                        public void mouseReleased(MouseEvent me) {
                                sh.setEndX(me.getX());
                                sh.setEndY(me.getY());     
                        }

                        @Override
                        public void mouseEntered(MouseEvent me) {

                        }

                        @Override
                        public void mouseExited(MouseEvent me) {

                        }
                    });
                    
                    PaintBrush.this.addMouseMotionListener(new MouseMotionListener() {
                            @Override
                            public void mouseDragged(MouseEvent me) {
                            sh= new Line();
                            sh.setStartX(me.getX());
                            sh.setStartY(me.getY());
                            if(!shape_type.equalsIgnoreCase("free"))
                                sh=new Shape();
                            s.add(sh);

                            }

                            @Override
                            public void mouseMoved(MouseEvent me) {
                            }
                        }); //To change body of generated methods, choose Tools | Templates.
            }
        });
                    break;
            case 7:
                btns[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                boolean save=Storage.save();
                String result="Status: ";
                System.out.println(result+save);

            }
        });
                break;
        }
    }
    this.add(fill);

    this.fill.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) 
        {
            if (ie.getStateChange()==1)
            {
                PaintBrush.filled = true;
            }
            else
            {
                PaintBrush.filled = false;
            }
        }
    });
        
  } 
   
    @Override
   public void paint(Graphics g)
   {

       for(int i=0;i<s.size();i++)
           s.get(i).draw(g);

   }
   

    // TODO overwrite start(), stop() and destroy() methods
}
