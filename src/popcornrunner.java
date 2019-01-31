import javax.swing.JOptionPane;

public class popcornrunner {

	public static void main(String[] args) {

		Microwave microwave = new Microwave();

		String flavor = JOptionPane.showInputDialog("Which popcorn flavor would you like?");

		Popcorn popcorn = new Popcorn(flavor);

		String ma = JOptionPane.showInputDialog("How long do you want to heat your popcorn for (in minutes)?");
		int time = Integer.parseInt(ma);
		microwave.setTime(time);
		microwave.putInMicrowave(popcorn);

		microwave.startMicrowave();
		popcorn.eat();
	}

}
