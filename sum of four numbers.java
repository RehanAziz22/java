import java.util.Scanner;


public class Sum_of_four_numbers {
    //program using do…while loop that prints sum of four numbers
    public static void main(String args[]){ 
        //initializing variables
        int sum = 0;
        int n = 1;
        int number;
       
        do{
            System.out.println("Enter number; \n");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            sum = sum += number;
            n++;
        }
        while( n<= 4);
        System.out.println("Sum of four no : \n" +sum);
        
    }
}
