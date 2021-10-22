package com.bz.palindrome_fibonacci_factorial;

public class Palindrome_FibonacciSeries_Factorial {
	public void Palindrom(int num) {
		int temp = num;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("The number is palindron");
		} else {
			System.out.println("The given number is not a palindrom");
		}
	}

	int factorial(int x) {
		if (x == 1)
			return 1;
		else
			return (x * factorial(x - 1));
	}

	public void fibonacciSeries(int x) {
		int firstNum = 1, secondNum = 1, result = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);

		for (int i = 3; i <= x; i++) {
			result = firstNum + secondNum;
			System.out.println(result);
			firstNum = secondNum;
			secondNum = result;
		}
	}

	public static void main(String[] args) {
		Palindrome_FibonacciSeries_Factorial obj = new Palindrome_FibonacciSeries_Factorial();
		obj.Palindrom(123);
		System.out.println("The febonacci Series are:");
		obj.fibonacciSeries(5);
		System.out.println("the factorial is: " + obj.factorial(5));
	}

}
