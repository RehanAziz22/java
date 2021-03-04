import java.util.Scanner;


public class MuhammadRehanBSE20F074 {
    //program using while loop 
    public static void main(String args[]){ 
        //initializing variables
        int ans = 0;
        String answer="Yes";
        
        Scanner sc = new Scanner(System.in);
        
        while(answer.equals("Yes")||answer.equals("yes"))
       {
            System.out.println("\nWho was the first president of the Constituent Assembly of Pakistan?");
            System.out.println("1.Liaquat Ali Khan");
            System.out.println("2.Quaid-e-azam");
            System.out.println("3.Moulvi Tameez-ud-Din ");
            System.out.println("4.Sardar Abdur Rab Nishtar");
            ans = sc.nextInt();
        
            if (ans==2){
                System.out.println("Congratulation! \n");
            }
            
            else {
                System.out.println("Incorrect Answer \n");
            }
            
            System.out.println("Again?\n Yes or No");
            answer = sc.next();
        }
        
        System.out.println("The End \n");
}
}
      
