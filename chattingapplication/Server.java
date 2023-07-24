package chattingapplication;

    //jframe class is came from under swing package that's why we have to import swing package.
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
// JFrame class is used to create frame 

public class Server extends JFrame implements ActionListener {
    
	
	// constructor 
	    Server(){
	    	
	    	setLayout(null);
	    	// Jpanel is a container that can store group of components.
	    	JPanel p1 = new JPanel(); 
	    	p1.setBackground(new Color(7 ,94, 84));
	    	//setBoounds is used to set the panel in the top of the frame .
	    	//BY making the set layout null ham apna panel ko set kar sakte hai wherever we want by using set bounds.
                p1.setBounds(0, 0, 450, 70);
	    	
	    	p1.setLayout(null);
                
                //the add function is used to set the component at top of the frame .
                add(p1);
	    	//image ko uthane ka liya hame image class ka aak object banayange
                //then image ko class directory sai uthane ka liya we used classLoader .
                //now in classLoader there is a static method getSystemResource
                //therefore we have pass the address of our image in the getSystemResources.
	    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
	    	Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                //
                JLabel back = new JLabel(i3);
                back.setBounds(5,20,25,25);
                p1.add(back);
                
                back.addMouseListener(new MouseAdapter(){
                    public void mouseClicked (MouseEvent ae){
                        System.exit(0);
                    }
                });
            
                
	    	setSize(450, 600);// it is used to set the size of frame (width , length).
	        setLocation(200 ,50);// it is used to set the location of frame from x-axis to y-axis .
	       //pura frame ko uthane ka liya getContentPane ka use kiya.
	       //setBackground(color) is use to color the background of the frame.
	       //color is came from the awt package of the java. 
	        getContentPane().setBackground(Color.white);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        setVisible (true); // it is used to make frame visible 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	
	    }
	
	
	
    
    
    
    
    
    
    public void actionPerformed(ActionEvent ae){
    
    }
    public static void main(String[] args){
        Server s = new Server ();
        
    }
}
