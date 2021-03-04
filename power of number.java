public class MuhammadRehanBSE20F074 {
    
    public static void main(String args[]){ 
       
        int base=4,expo=2,i,num=1;
        System.out.println("Find the power of number");
        System.out.println("------------------------------");        
        System.out.println("The Base:" +base);
        System.out.println("The Exponent:"+expo);    
        for (i=1; i<=expo;i++){
            num=num*base;
        }
        System.out.println("The power:" + base+ "^" +expo+ "=" +num);    
        
    }
}
