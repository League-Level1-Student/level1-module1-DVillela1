
public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("dog");
		cat.meow();
		cat.printName();
		for (int x = 0; x < 9; x++) {
			cat.kill();
		}
	}
}
