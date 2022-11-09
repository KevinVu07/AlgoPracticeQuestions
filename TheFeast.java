
import java.util.ArrayList;

public class TheFeast {

	public static void main(String[] args) {

		// initial money
		int n = 18;
		// cost of a chocolate bar
		int c = 3;
		// number of wrappers needed to turn in for a free bar
		int m = 2;

		ArrayList<Integer> theFeast = theFeast(n, c, m);

	}

	public static ArrayList<Integer> theFeast(int n, int c, int m) {

		int numberOfBars = n / c;
		int wrappers = numberOfBars;
		int wrapsRemained;
		int totalBarsEaten = 0;
		ArrayList<Integer> numberOfBarsEaten = new ArrayList<Integer>();
		numberOfBarsEaten.add(numberOfBars);

		while (wrappers >= m) {
			numberOfBars = wrappers / m;
			wrapsRemained = wrappers % m;
			wrappers = numberOfBars + wrapsRemained;
			numberOfBarsEaten.add(numberOfBars);
		}

		for (Integer barEaten : numberOfBarsEaten) {
			totalBarsEaten = totalBarsEaten + barEaten;
		}

		System.out.println(
				"In his feast, Bobby has eaten a total of " + totalBarsEaten + " chocolate bars, in this order:");
		for (Integer barEaten : numberOfBarsEaten) {
			System.out.println(barEaten);
		}

		return numberOfBarsEaten;
	}

}
