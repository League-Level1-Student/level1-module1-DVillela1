import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryconverter {

	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.setTitle("Convert 8 Bits of Binary to ASCII");
		a.setVisible(true);		
		a.pack();
		JPanel b = new JPanel();
		b.setName("qd");
		b.setVisible(true);
		a.add(b);
		JTextField c = new JTextField(20);
		c.setVisible(true);
		JButton d = new JButton();
		d.setVisible(true);
	}
}
