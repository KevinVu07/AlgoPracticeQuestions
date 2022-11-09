
import java.util.ArrayList;

public class MinGap {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 1, 5, 6, 7, 1 };
		int minGap = minimumGap(numbers);
		System.out.println("Minimum gap of two same numbers is: " + minGap);

	}

	public static int minimumGap(int[] numbers) {

		ArrayList<Integer> gaps = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length - 1; i++) {
			int firstSimilarNumber = numbers[i];
			int indexOfFirstSimilarNumber = i;
			int gap;

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] == firstSimilarNumber) {
					int indexOfNextSimilarNumber = j;
					gap = indexOfNextSimilarNumber - indexOfFirstSimilarNumber;
					gaps.add(gap);
				}
			}
		}

		int minGap = gaps.get(0);
		for (int i = 1; i < gaps.size(); i++) {
			if (minGap > gaps.get(i))
				minGap = gaps.get(i);
		}

		return minGap;
	};
}