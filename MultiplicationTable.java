
import java.util.Scanner;


public class MultiplicationTable {

    public static void main(String[] args) {
        {
        System.out.println("Enter number:");
            
        Scanner sc = new Scanner (System.in);
        int j = sc.nextInt();
        /* for loop execution */
        for (int a = 1 ; a <= 12; a++)
        {
        System.out.println(j+ " * "+a+ " = " +j*a);
        }
        }
    }
}    

