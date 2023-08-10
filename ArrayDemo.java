import java.util.Scanner;
public class ArrayDemo 
{
public static void main(String args[])
{
       
    //int a[]={7,5,8,6,2}; //intiliazation of an array
    System.out.println("Enter the size of an array: ");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n]; // n represents no. of elements of an array or size of an array
    int sum=0;
    System.out.println("Enter the elements of an array: ");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        sum=sum+a[i];
    }
    System.out.println("Array elements are:");
    for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    System.out.print("The sum of array elements is: "+sum);
        
}   
}
