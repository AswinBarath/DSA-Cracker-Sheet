package Array;

import java.util.Scanner;

public class ReverseArray {

    public static void iterativeReverse(int[] array, int beg, int end) {
        // while loop technique
        while(beg<end) {
            int temp = array[beg];
            array[beg] = array[end];
            array[end] = temp;
            beg++;
            end--;
        }

        // For loop technique
        // for(int j=0; j<end/2 + 1; j++) {
        //     int temp = array[beg];
        //     array[beg] = array[end];
        //     array[end] = temp;
        //     beg++;
        //     end--;
        // }
    }
    
    public static void recursiveReverse(int[] array, int beg, int end) {
        int temp;

        // base case
        if(beg >= end) {
            return;
        }

        // recursive case
        temp = array[beg];
        array[beg] = array[end];
        array[end] = temp;

        recursiveReverse(array, beg+1, end-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for(int iterator=0; iterator<size; iterator++) {
            array[iterator] = input.nextInt();
        }

        int beg = 0, end = size - 1;

        System.out.println("Choose code paradigm: \n 1. Iterative \n 2. Recursive");
        int choice = input.nextInt();
        switch(choice) {
        case 1:
            iterativeReverse(array, beg, end);
            break;
        case 2:
            recursiveReverse(array, beg, end);
            break;
        default:
            System.out.println("Eeee... \n Wrong choice \n Sorry buddy, try again!");
            System.exit(0);
        }
        System.out.println("Reversed array:");

        for(int k=0; k<size; k++) {
            System.out.print(array[k] + "  ");
        }

        input.close();
    }
}
