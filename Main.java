import java.util.*;

public class Main {

    public static void main(String[] args) 
    {
        int count = 3;
        for (int i = 0; i < 5; i++) 
        {
            if (i == 0 || i == 4) 
            {
                for (int j = 0; j < 5; j++)
                    System.out.print("*" + " ");
            } 
            else 
            {
                for (int j = 0; j < 5; j++) 
                {
                    if (j != count) 
                    {
                        System.out.print("  ");
                    } 
                    else 
                    {
                        System.out.print("*");
                        count--;
                    }

                }
           }
            System.out.println();
        }

    }
}