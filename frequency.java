import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        
        int f=0;
        for(int i=0;i<str.length();i++)
        {if(ch==str.charAt(i))
         ++f;}
         System.out.println("frequeny of " +ch+ "is"+f);

    }
    
}
