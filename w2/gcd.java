import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter elements for array A:");
        for (int i = 0; i < 5; i++) 
            for (int j = 0; j < 5; j++) {
                A[i][j] = scanner.nextInt();
            }
        

        System.out.println("Enter elements for array B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
   
        int[][] C = new int[5][5];
        for (int i = 0; i < 5; i++) 
            for (int j = 0; j < 5; j++) {
                C[i][j] = gcd(A[i][j], B[i][j]);
            }
        
        
        // Printing GCD array C
        System.out.println("GCD array C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
