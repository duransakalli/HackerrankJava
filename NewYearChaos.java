package Solutions;

import java.util.Scanner;

public class NewYearChaos {
	static void minimumBribes(int[] q) {

		int count = 0, total = 0;
	    boolean flag = true;
	    for (int i = 0; i < q.length-1; i++) {
	        for(int j=i+1;j<q.length;j++)
	        {
	            if(q[i]>q[j]){
	                count++;
	                total=total+1;
	            }
	        }
	        if (count > 2) {
	            flag = false;
	            System.out.println("Too chaotic");
	            break;
	        }
	        count=0;
	    }
	    if (flag)
	        System.out.println(total);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}
