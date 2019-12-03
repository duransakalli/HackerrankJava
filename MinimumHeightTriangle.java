package Solutions;

import java.util.Scanner;

public class MinimumHeightTriangle {

    static int lowestTriangle(int base, int area){          
      
         return (int) Math.ceil((double)(2*area) / (double)base);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
