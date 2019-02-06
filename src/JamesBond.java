import javax.swing.JOptionPane;

public class JamesBond {

	public static void main(String[] args) {
		Vault vault = new Vault();
		int y = findCode(vault);
		if (y == -1) {
			System.out.println("You couldn't crack the code!");

		}
		else {
			System.out.println("James Bond has cracked the code! Code: " + y);			
		}
	}
		
	
	static int findCode(Vault vault) {
		String p = JOptionPane.showInputDialog("What is the minimum number you want to test with?");
		String o = JOptionPane.showInputDialog("What is the maximum number you want to test with?");
		int oy = Integer.parseInt(o);
		int po = Integer.parseInt(p);
		if (po > oy) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
		for (int x = po; x < oy; x++) {
			if (vault.tryCode(x)) {
				System.out.println("James Bond has cracked the code!");
				return x;
			}
		}
		
		return -1;
	}

	}

