
// fibo numbers 0 1 1 2 3 5 8 ...
// fibo(x) = fibo(x-1) + fibo (x-2)
// int F0 = 0;
// int F1 = 1;
// int F2 = F0 + F1;
// int F3 = F1 + F2;
// int F4 = F2 + F3;

public class FibonacciAlgo {

	public static void main(String[] args) {
		int num = 10;

		int fibo = fib(num);
		System.out.println("fibo of " + num + " = " + fibo);
		System.out.println("The fibonacci sequence is:");
		for (int i = 0; i <= num; i++) {
			System.out.println(fib(i));
		}
	}

	public static int fib(int num) {
		if (num <= 1) {
			return num;
		}
		return fib(num - 1) + fib(num - 2); // time complexity: O(2^n); Space complexity: O(n)
	}
}
