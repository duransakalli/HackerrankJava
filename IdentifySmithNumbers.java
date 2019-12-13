package Solutions;

import java.util.Scanner;

public class IdentifySmithNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        int b=a;
        for(int x=2;x<=a;x++)
        {
            while(a%x==0)
            {
                a=a/x;
                int q=x;
                while(q>0)
                {
                    s=s+q%10;
                    q=q/10;
                }
            }
        }        
        int u=0;
        while(b>0)
        {
            u=u+b%10;
            b=b/10;
        }
        
        if(u==s)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        sc.close();
    }
}
