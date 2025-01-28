import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // creating arrays
        int[] arr1 = {1,2,3,4,5};
        System.out.println("2nd element is: " + arr1[3] + " and the length of arr1: " + arr1.length);

        // creating array without initializing the values
        int[] arr2 = new int[6];
        // initializing the value to arr2
        arr2[0] = 1;
        arr2[1] = 12;
        arr2[2] = 13;
        arr2[3] = 14;
        arr2[4] = 15;
        arr2[5] = 16;

        System.out.println(arr2[4]);

        // for loop
        //  to print all array values at once
        System.out.println("For Loop");
        for(int i = 0; i< arr2.length; i++) {
            int a = arr2[i];
            System.out.println(a);
        }
        System.out.println("____________________");
        
        // While loop
        // if we don't know when to stop use while loop
        System.out.println("While Loop");
        int j = 0; // initializing j to 0
        while(j <= 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("____________________");
        
        // do-while loop
        System.out.println("Do-While Loop");
        int k = 0;
        do { 
            System.out.println(k);
            k++;
        } while (k <= 10);
        System.out.println("____________________");

        // enhanced for loop
        System.out.println("Enhanced For Loop");
        for(int num : arr2) {
            System.out.println(num);
        }
        System.out.println("____________________");
        // to write all arrays in line we have to import array
        // to convert array to string
        System.out.println(Arrays.toString(arr2));

    }
    
}
