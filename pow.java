import java.util.Scanner;
public class pow {

    
        public static void main(String[] args) {
            System.out.println("Enter 2 numbers x and n");
            
            int x,n;
                Scanner sc= new Scanner (System.in);
                x=sc.nextInt();
                n=sc.nextInt();
                 System.out.println(Math.pow(x,n));
            
        }
    
}
