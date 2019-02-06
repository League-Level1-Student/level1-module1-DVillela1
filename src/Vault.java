
public class Vault {

	private int secretCode = 30413;
	
	boolean tryCode(int secretCode) {
		if (secretCode == this.secretCode) {
			return true;
		}
		return false;
	}
	
	
}
