import java.util.Scanner;

public class spiral { // Class name matches the file name spiral.java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] a = new int[n][n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                System.out.print(a[t][i] + " ");
            }
            t++;
            for (int i = t; i <= b; i++) {
                System.out.print(a[i][r] + " ");
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    System.out.print(a[b][i] + " ");
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
