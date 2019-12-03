package Solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HalloweenParty {
	/*
	 * Complete the halloweenParty function below.
	 */
	static long halloweenParty(int k) {
		long half = k / 2;
		half *= (k - (k / 2));
		return half;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int tItr = 0; tItr < t; tItr++) {
			int k = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

			long result = halloweenParty(k);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
