import java.util.Scanner;

public class palindrome {

    public static void main(String args[])
    {System.out.println("Enter the string:");
        Scanner s=new Scanner(System.in);
        String str,u;
        int i,len,flag=1;

        str=s.nextLine();
        u=str.toUpperCase();
        len=u.length();
        for(i=0;i<len/2;i++)
        {
            if(u.charAt(i)!=u.charAt(len-i-1))
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The string is not Palindrome");
        }
        if(flag==1)
        {
            System.out.println("The string is a Palindrome");
        
        }}
}
