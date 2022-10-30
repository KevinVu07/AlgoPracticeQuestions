
// fibo numbers 0 1 1 2 3 5 8 ...
// fibo(x) = fibo(x-1) + fibo (x-2)
//		int F0 = 0;
//		int F1 = 1;
//		int F2 = F0 + F1;
//		int F3 = F1 + F2;
//		int F4 = F2 + F3;

public class ImprovedFibonacciAlgo {

	// Memoization

	private static long[] storedFibs;

	public static void main(String[] args) {

		int num = 50;

		storedFibs = new long[num + 1]; // to be able to find nth fib number without out of bound error in array

		long fibo = fib(num);
		System.out.println("fibo of " + num + " = " + fibo);

		System.out.println("The fibonacci sequence is:");
		for (int i = 0; i <= num; i++) {
			System.out.println(fib(i));
		}
	}

	public static long fib(int num) {

		if (num <= 1) {
			return num;
		}

		if (storedFibs[num] != 0) {
			return storedFibs[num];
		}

		storedFibs[num] = fib(num - 1) + fib(num - 2);

		return storedFibs[num];
	}
}

//time complexity: O(n) because only 1 value of fib needs to be calculated to return the fib number at n, the other value has been calculated and stored as a value in the array storedFibs; Space complexity: O(n)
