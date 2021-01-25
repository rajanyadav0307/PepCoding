package Arrays;

import java.util.Scanner;

public class SpanArray 
{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (n-- > 0) {
            int x = s.nextInt();
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        System.out.println(max-min);
    }
}
