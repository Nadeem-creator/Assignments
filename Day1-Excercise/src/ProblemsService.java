
public class ProblemsService {

	public int avgCalculator(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}

	public void swapNumbers(int num4, int num5) {
		System.out.println("------Before swapping-----");
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		int temp;
		temp = num4;
		num4 = num5;
		num5 = temp;
		System.out.println("------After swapping-----");
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
	}

	public String primeNumber(int primeNum) {

		int temp = 0;
		int i = 2;
		if (primeNum == 1 || primeNum == 0) {
			temp = 1;
		} else {
			while (i < primeNum) {
				if (primeNum % i == 0) {
					temp = 1;
					if (temp == 1) {
						break;
					}
				}
				i++;
			}
		}
		if (temp == 1) {
			return (primeNum + " is not a prime number");
		} else {
			return (primeNum + " is a prime number");
		}
	}

	public void display() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
