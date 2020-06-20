import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = getArr();
        reverse(arr);
        //int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 78};
        //reverse(arr);
    }

    // a method that gets an array from a user
    private static int[] getArr(){
        int toInsert;

        // get the length of an array
        System.out.println("How many numbers would you like to insert? " +
                "They will form an array which is going to be reversed. \r");
        toInsert = scan.nextInt();
        int[] arrInserted = new int[toInsert];

        // ask a user to insert numbers for the array
        System.out.println("Insert " + toInsert + " INTEGER numbers: \r");
        for(int i = 0; i < arrInserted.length; i++){
            arrInserted[i] = scan.nextInt();
        }

        return arrInserted;
    }

    private static void reverse(int[] arr){
        System.out.println("The entered array: " + Arrays.toString(arr));

        int len;
        // a temporary variable where the current value will be saved
        int temp;

        // go through the array.length / 2 (we need to check only the half of the array)
        for(int i = 0; i < arr.length / 2; i++){
            // save tha last value of an array in a variable
            len = arr.length-1;

            // swap the beginning with the end
            temp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = temp;

            //System.out.println(arr[i] + " " + arr[len-i]);
        }
        System.out.println("The reversed array: " + Arrays.toString(arr));

    }
}
