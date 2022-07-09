import java.util.*;
import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        int n;
        Scanner input =new Scanner(System.in);
       System.out.println("enter base of matrix");
       n=input.nextInt();
      int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    int c[][]=new int[n][n];
    System.out.println("enter elements in first matrix");
    for(int i=0;i<n;i++)
    {for(int j=0;j<n;j++)
     {a[i][j]=input.nextInt();}}
     System.out.println("enter elements in second matrix");
     for(int i=0;i<n;i++)
     {for(int j=0;j<n;j++)
      {b[i][j]=input.nextInt();}}
    System.out.println("multiply both");
    for(int i=0;i<n;i++)
     {for(int j=0;j<n;j++)
        {for(int k=0;k<n;k++)
        {c[i][j]=c[i][j]+a[i][k]*b[k][j];}}}
        System.out.println("product is");
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
            {System.out.println(c[i][j]+" ");
        }
        System.out.println();}
    input.close();}}

    
       

