package Solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

-public class IdentifySmithNumbers {

    // Complete the solve function below.
    static int solve(int n) {
    	
    	int i = 2;
    	int sum = 0;
    	int sum2 = 0;
    	
    	while(i == n)
    	{
    		if(n % i == 0)
    		{
    			sum +=i;
    			n /= i;
    			i = 1;
    		}	
    			
    		i++;
    	}
    	
    	
    	int num = n;
        
        while (num > 0) {
            sum2 = sum2 + num % 10;
            num = num / 10;
        }
        
        
        if(sum == sum2)
        {
        	return 1;
        } else
        {
        	return 0;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = solve(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
