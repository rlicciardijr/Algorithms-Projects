
//Ron Licciardi Csc 335 Computer Algorithms
import java.util.Random;

public class GCD {
	static int eCounter = 0;
	static int counter = 0;

	public static void main(String[] args) {
		int nums[][] = new int[100][2];
		int minNum = 4000;
		int maxNum = 40000;
		int avg = 0;
		int eAvg = 0;
		int value1 = 0;
		int value2 = 0;
		int min = 999999;
		int max = 0;
		int eMax = 0, eMin = 9999;
		int minIt1 = 0, minIt2 = 0, maxIt1 = 0, maxIt2 = 0;
		int eminIt1 = 0, eminIt2 = 0, emaxIt1 = 0, emaxIt2 = 0;

		for (int i = 0; i < 100; i++) {
			Random rand1 = new Random();
			value1 = rand1.nextInt((maxNum - minNum) + 1) + minNum;
			Random rand2 = new Random();
			value2 = rand2.nextInt((maxNum - minNum) + 1) + minNum;
			nums[i][0] = value1;
			nums[i][1] = value2;
			int randNum1 = value1;
			int randNum2 = value2;

			consecutive(value1, value2);

			if (counter > max) {
				maxIt1 = value1;
				maxIt2 = value2;
				max = counter;
			}
			if (counter < min) {
				minIt1 = value1;
				minIt2 = value2;
				min = counter;
			}

			avg = avg + counter;

			EuGcd(randNum1, randNum2);

			if (eCounter > eMax) {
				emaxIt1 = randNum1;
				emaxIt2 = randNum2;
				eMax = eCounter;
			}
			if (eCounter < eMin) {
				eminIt1 = randNum1;
				eminIt2 = randNum2;
				eMin = eCounter;
			}

			eAvg = eAvg + eCounter;
		}
		eAvg = eAvg / 100;
		avg = avg / 100;

		System.out.println("---------------------Consecutive Integer----------------------");

		System.out.println("The most number of iterations used" + " is" + "(" + max + ")" + "for GCD (" + maxIt1 + ", "
				+ maxIt2 + ")" + " = " + consecutive(maxIt1, maxIt2));

		System.out.println("The least number of iterations used is " + "(" + min + ")" + "for GCD (" + minIt1 + ", "
				+ minIt2 + ")" + " = " + consecutive(minIt1, minIt2));
		System.out.println("The average number of iterations used for all 100 pairs is " + "( " + avg + " )");

		System.out.println("---------------------Euclids----------------------");

		System.out.println("The most number of iterations used is " + "(" + eMax + ")" + "for GCD (" + emaxIt1 + ", "
				+ emaxIt2 + ")" + " = " + EuGcd(emaxIt1, emaxIt2));

		System.out.println("The least number of iterations used" + " is" + "(" + eMin + ")" + "for GCD (" + minIt1
				+ ", " + eminIt2 + ")" + " = " + EuGcd(eminIt1, eminIt2));
		System.out.println("The average number of iterations used for all 100 pairs is " + "( " + eAvg + " )");

	}

	public static int consecutive(int m, int n) {

		int t = n;
		if (m < n)
			t = m;
		while (t > 1) {
			if (m % t == 0 && n % t == 0)
				return t;

			t--;
			counter++;
		}
		return n;
	}

	public static int EuGcd(int m, int n) {

		if (n == 0) {

			return m;

		}
		eCounter++;
		return EuGcd(n, m % n);

	}
}