
public class MinChairsForEveryone {

	public static void main(String[] args) {
		String S = "EELEE";
		
		int minChairsNeeded = minChairsNeeded(S);
		System.out.println("The minimum number of chairs needed so that everyone can have a sit is " + minChairsNeeded);
		
	}
	
	public static int minChairsNeeded(String S) {
		int count = 0;
		int minimum = 1;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'E') {
				count++;
			} else if (S.charAt(i) == 'L') {
				count--;
			}
		}
		int minChairsNeeded = Math.max(count, minimum);
		return minChairsNeeded;
	}
}
