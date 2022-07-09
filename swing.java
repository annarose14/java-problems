import javax.swing.*;
public class swing {
    public static void main(String[] args) {
        
    

    JButton b =new JButton("click");

    JFrame f= new JFrame();
    b.setBounds(130,100,100,40);

    f.setSize(200,300);
 f.setLayout(null);
  f.setVisible(true);

f.add(b);
    }

    
}
