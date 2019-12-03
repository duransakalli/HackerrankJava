package Solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StrangeGridAgain {

	static int strangeGrid(int r, int c) {
		
		int pivot = 0;
		
		if(r % 2 == 0)
		{
			if(c == 1) pivot = 1;
			if(c == 2) pivot = 3;
			if(c == 3) pivot = 5;
			if(c == 4) pivot = 7;
			if(c == 5) pivot = 9;			
		} else
		{
			if(c == 1) pivot = 0;
			if(c == 2) pivot = 2;
			if(c == 3) pivot = 4;
			if(c == 4) pivot = 6;
			if(c == 5) pivot = 8;
		}
		
		return (((r -1) / 2) * 10) + pivot;	
		
		/*
		 * edit:
		 * (((r - 1) / 2) * 10 + (c - 1) * 2 + ((r % 2 == 0) ? 1 : 0));
		 */
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] rc = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int r = Integer.parseInt(rc[0]);

		int c = Integer.parseInt(rc[1]);

		int result = strangeGrid(r, c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
