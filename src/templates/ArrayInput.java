package templates;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Brief code
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        // Descriptive code
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int iterator=0; iterator<size; iterator++) {
            array[iterator] = input.nextInt();
        }
        input.close();
    }    
}
