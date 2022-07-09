import java.util.*;
import java.util.Scanner;
public class Solution {
    
    
        public static void main(String[] args) {
            System.out.println("Enter a string");
       Scanner sc= new Scanner(System.in);
        char c=sc.next().charAt(0);
            if(c>='a'&&c<='z')
            {System.out.println("0");}
            else if(c>='A'&&c<='Z')
            {System.out.println("1");}
            else
            {System.out.println("-1");}
            
        }
    
    
}
