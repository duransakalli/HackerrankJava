package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Birthday_Chocolate {
    // Complete the birthday function below.
	
    static int birthday(List<Integer> s, int d, int m) {
    	
        int[] sums = new int[s.size() + 1];
        int count = 0;

        for(int i = 0; i < s.size(); i++) {

            int sumsIndex = i + 1;
            sums[sumsIndex] = sums[sumsIndex - 1] + s.get(i);

            if (sumsIndex >= m && (sums[sumsIndex] - sums[sumsIndex - m]) == d)
                count++;
        }

        return count; 

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


}
