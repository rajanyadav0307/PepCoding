package Arrays;
import java.util.Scanner;

public class BarChart 
{
    
    public static void main(String[] args) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
            max=Math.max(max,a[i]);
        }
        int temp=max;
        for(int i=1; i<=temp; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(a[j]==max)
                {
                    System.out.print("*"+"\t");
                    a[j]--;
                    
                }
                else
                {
                    System.out.print(""+"\t");
                }
            }
   
            max--;
            System.out.println();
        }

    }

    
}
