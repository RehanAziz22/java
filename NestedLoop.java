
import java.util.Scanner;


public class NestedLoop {

    public static void main(String[] args) {
        {
        int i, j;
        for (i = 1; i <= 5; i++)
        {
        for (j = 1; j <= i; j++) //Nested for loop
        {
        System.out.print(i);
        }
        System.out.print("\n");
        } 
        }
}    
}
