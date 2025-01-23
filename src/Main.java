import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type how many random elements you want to create in the array:");
        int c = input.nextInt();

        int[] arr = new int[c];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));


        int sum = sumArr(arr);
        double average = Average(arr);

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        MinMax(arr);
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double Average(int[] arr) {
        int sum = sumArr(arr);
        return (double) sum / arr.length;
    }

    public static void MinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int el : arr){
            if (el <min)
                min = el;
            if (el > max)
                max = el;
        }


        int s_min = arr[0], s_max = arr[0];
        for (int el : arr){
            if (el > s_max && el < max)
                s_max = el;
            if (el < s_min && el > min)
                s_min = el;
        }
        System.out.println("Min = " + min + "\nMax = " + max + "\nSecond Min = " + s_min + "\nSecomd Max = " + s_max);
    }
}
