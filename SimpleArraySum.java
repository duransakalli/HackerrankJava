package Solutions;

import java.io.*;

import java.util.*;

public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		int len = ar.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += ar[i];
		}
		return sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}