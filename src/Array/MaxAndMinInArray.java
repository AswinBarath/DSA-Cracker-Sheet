package Array;

import java.util.Scanner;

/*
 * Maximum and minimum of an array using minimum number of comparisons
*/

class Answer {
    int max, min;
    public Answer(int max, int min) {
        this.max = max;
        this.min = min;
    }
}

public class MaxAndMinInArray {

    public static void recursiveMaxMin(int[] array, int i, int size, Answer answer) {
        // Base case
        if(i>=size) {
            return;
        }

        // Recursive case
        if(array[i] < answer.min) {
            answer.min = array[i];
        }
        else if(array[i] > answer.max) {
            answer.max = array[i];
        }
        recursiveMaxMin(array, i+1, size, answer);
    }

    public static void iterativeMaxMin(int[] array, int size, Answer answer) {
        // for loop
        for(int i=1; i<size; i++) {
            if(array[i] < answer.min) {
                answer.min = array[i];
            }
            else if(array[i] > answer.max) {
                answer.max = array[i];
            }
        }
    }

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        Answer answer = new Answer(a[0], a[0]);
        System.out.println("Choose code paradigm: \n 1. Iterative \n 2. Recursive");
        int choice = in.nextInt();
        switch(choice) {
        case 1:
            iterativeMaxMin(a, n, answer);
            break;
        case 2:
            recursiveMaxMin(a, 0, n, answer);
            break;
        default:
            System.out.println("Eeee... \n Wrong choice \n Sorry buddy, try again!");
            System.exit(0);
        }
        in.close();
        System.out.println("Maximum element in array: " + answer.max);
        System.out.println("Minimum element in array: " + answer.min);
    }
}
