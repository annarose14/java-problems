import java.util.Scanner;
public class binarysearch {
  public static void main(String[] args) {
      Demo b=new Demo();
      b.read();
      b.sort();
      b.display();
      b.search();

      
  }
}
class Demo
{int a[],n;
    Scanner sc= new Scanner(System.in);
    int[] read()
    {System.out.println("Enter number of elements");
 n=sc.nextInt();
 a= new int[n];
System.out.println("enter elemrnts");
for(int i=0;i<n;i++)
{a[i]=sc.nextInt();}
return a;}

void sort()
{for(int i=0;i<a.length;i++)
for(int j=i+1;j<a.length;j++)
{if(a[i]>a[j])
    {int temp=a[i];
    a[i]=a[j];
a[j]=temp;}}}

void display()
{System.out.println("sorted elements are ");

for(int i=0;i<a.length;i++)
{System.out.println(a[i]+" ");}}

void search()
{ System.out.println("enter element to be searched ");
int item=sc.nextInt();
int start=0;
int end=n-1;
int mid;
mid=(start+end)/2;
while(item!=a[mid]&&start<=end)
{if(item>a[mid])
 { start=mid+1;}
else 
{end=mid-1;}
mid=(start+end)/2;
}
if(start>end)
{System.out.println(item+" is not found");}
else
{System.out.println(item+ "found at position "+(mid+1));
}
}

  }
