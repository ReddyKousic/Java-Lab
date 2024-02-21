import java.util.Scanner;
class SimpleArray
{
public static void main(String arr[])
{
int A[][];
A=new int[2][2];

Scanner sc=new Scanner(System.in);

System.out.println("Enter the values for Array A");
for(int i=0;i<A.length;i++)
for(int j=0;j<A[i].length;j++)
  A[i][j]=sc.nextInt();


System.out.println("Elements of array A are:");
for(int i=0;i<A.length;i++)
for(int j=0;j<A[i].length;j++)
  System.out.println(A[i][j]);




}
}