/**
 * @author Nadeem
 *
 * 
 */

public class ProblemsMain {

	public static void main(String[] args) {

		System.out.println("-------One---------------");
		System.out.println("-5+8*6 	     = " + (-5 + 8 * 6));
		System.out.println("(55+9)%6     = " + ((55 + 9) % 6));
		System.out.println("20+(-3)*5/8  = " + (20 + (-3) * 5 / 8));
		System.out.println("5+15/3*2-8%3 = " + (5 + 15 / 3 * 2 - 8 % 3));

		System.out.println("-------Two---------------");
		System.out.println("20+4 	=" + (20 + 4));
		System.out.println("20-4	=" + (20 - 4));
		System.out.println("20*4	=" + (20 * 4));
		System.out.println("20/4	=" + (20 / 4));
		System.out.println("20%4	=" + (20 % 4));

		System.out.println("---------Three------------");

		ProblemsService problemsService = new ProblemsService();
		System.out.println("Average of 10,20,30 is " + problemsService.avgCalculator(10, 20, 30));

		System.out.println("----------Four-------------");

		problemsService.swapNumbers(10, 32);

		System.out.println("----------Five-------------");

		System.out.println(problemsService.primeNumber(13));

		System.out.println("----------Six-------------");

		System.out.println("Ascii value of " + (int) 'x');

		System.out.println("----------Seven-------------");

		problemsService.display();

		// de-refererincing
		problemsService = null;

	}

}
