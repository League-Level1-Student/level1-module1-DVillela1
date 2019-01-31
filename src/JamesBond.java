
class JamesBond {

	static int code;
	String name;
	static int x = 0;

	JamesBond(String name) {
		this.name = name;
		System.out.println("James Bond has appeared");
	}

	public void findCode(int code) {
		for (int x = 0; x < 1000001; x++) {
			tryCode();
		}
	}

	void tryCode() {
		if (x == code) {
			System.out.println("James Bond has cracked the code!");
		} else {
			System.out.println("James Bond couldn't find the code!");
		}
	}
}
