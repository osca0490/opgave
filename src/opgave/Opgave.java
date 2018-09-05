package opgave;

public class Opgave {

	public static void main(String[] args) {
		System.out.println("Hello!");

		System.out.println("her er ikke nok til alle");

		System.out.println("dit nummer er:");
		System.out.println(beregn(20, 18));

	}

	private static int beregn(int tal1, int tal2) {
		return tal1 * tal2 / 20;
	}

}
