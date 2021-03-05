
public class StaticProblemsService {

	public static String checkSum(int num6) {
		int temp1 = 0;
		int temp2 = 0;
		while (num6 > 0) {
			temp1 = num6 % 10;
			num6 = num6 / 10;
			if (temp1 % 2 != 0) {
				temp2 = temp2 + temp1;
			}
		}
		return temp2 % 2 == 0 ? "sum of odd values is even" : "sum of odd values is odd";
	}

	public static int sumOfEVenDigits(int num7) {
		int temp1 = 0;
		int temp2 = 0;
		while (num7 > 0) {
			temp1 = num7 % 10;
			num7 = num7 / 10;
			if (temp1 % 2 == 0) {
				temp2 = (temp1 * temp1) + temp2;
			}
		}
		return temp2;
	}

	public static String highestWordCalculator(String userInput) {
		String[] arrayTemp = userInput.split(" ");
		int temp1 = 0;
		int temp2 = 0;
		String temp3 = "";
		for (int i = 0; i < arrayTemp.length; i++) {
			temp1 = arrayTemp[i].length();
			if (temp1 > temp2) {
				temp2 = temp1;
				temp3 = arrayTemp[i];
			}
		}
		return temp3;
	}

}
