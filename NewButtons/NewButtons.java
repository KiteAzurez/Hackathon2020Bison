import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;

/* Written by Kevin Cochran 2/28/20

Code displays buttons that will eventually lead into a chat service for the selected button. 

*/

public class NewButtons {
	public static void main (String[] args) {
		
		//tf = text field.  Shows text of code. 
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		
		//Pictures are in folder, please put appropriate address to show picture
		
		//d = Doctor, c = Computer Scientist, l = Lawyer, a = Finacial Advisor.
		
		JButton d = new JButton(new ImageIcon("C:\\Users\\lagse\\Pictures\\hackathon2020\\Doctor1.png"));
		JButton c = new JButton(new ImageIcon("C:\\Users\\lagse\\Pictures\\hackathon2020\\CS1.jfif"));
		JButton l = new JButton(new ImageIcon("C:\\Users\\lagse\\Pictures\\hackathon2020\\lawyer1.png"));
		JButton a = new JButton(new ImageIcon("C:\\Users\\lagse\\Pictures\\hackathon2020\\Advisor1.jfif"));
		
		//Boundaries for height, width, and position.
		
		//Buttons can have text above them, did not figure out how to put it there. 
		d.setBounds(100, 100, 95, 50);
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Connecting to a doctor now...");
				tf.setBounds(200,100,205,20);
			}
		});
		
		c.setBounds(100, 20, 100, 50);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Connection to a CS now...");
				tf.setBounds(200,20,205,20);
				
			}
		});
		l.setBounds(100, 200, 100, 50);
		l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Connecting to a Lawyer now...");
				tf.setBounds(200,200,205,20);
			}
		});
		a.setBounds(100, 300, 100, 50);
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Connecting to Finacial Advisor...");
				tf.setBounds(200,300,205,20);
			}
		});
		
		
		
		//adds buttons to the frame/text to the frame
		f.add(d);
		f.add(c);
		f.add(l);
		f.add(a);
		f.add(tf);
		
		//Size of window (h,w).
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

