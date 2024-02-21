import java.util.Scanner;
class Array
{
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) return false;
        }
        return true;
        }
    public static void main(String args[])
    {
        int A[][];
        boolean isLucky;
        A = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        isLucky = true;

        

        System.out.println("Enter the values for Array A");

        for(int i=0; i<A.length;i++)
        
        for(int j=0;j<A[i].length; j++)
            A[i][j] = sc.nextInt();

        System.out.println("Elements of array A are:");
        for(int i=0;i<A.length;i++)
        for(int j=0;j<A[i].length;j++)
            if(i==j)
            {
                System.out.println(A[i][j]);
                if(arr.isPrime(A[i][j]) && isLucky==true)
                {
                    isLucky = true;
                }else{
                    isLucky=false;
                }

            }
        if(isLucky)
        {
            System.out.println("The given Array is Lucky");
        }else{
            System.out.println("The given Array is not Lucky");

        }
        

     
            
            
        


    }
}


