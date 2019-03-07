import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Convert 8 Bits of Binary to ASCII");
		frame.setLocation(950, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		JTextField text = new JTextField(30);
		text.addInputMethodListener(null);
		text.setSize(1000, 20);
		String x = text.getText();
		text.setVisible(true);
		frame.add(text);
		JButton button = new JButton();
		button.setText("Convert");
		button.addMouseListener(null);
		button.setSize(30, 30);
		button.setVisible(true);
		frame.add(button);
		frame.pack();
		int xi = Integer.parseInt(x);
		if (xi < 0) {
			JOptionPane.showMessageDialog(null, "Too many numbers");
		}
		if (xi > 99999999) {
			JOptionPane.showMessageDialog(null, "Too little numbers");
		}
		if (xi > 0 && xi < 99999999) {
			convert(x);
		}
		convert(x);
	}

	static String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
}
