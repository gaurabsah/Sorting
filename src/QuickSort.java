import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr,int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    static void quickSortRecursion(int[] arr,int low,int high){
        int p=partition(arr,low,high);
        if(low<p-1){
            quickSortRecursion(arr, low, p-1);
        }
        if(p<high){
            quickSortRecursion(arr, p, high);
        }
    }

    public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter the number of elements inside array: ");
            int n = scn.nextInt();

            System.out.println("Enter the elements of array: ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

           quickSortRecursion(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
        }
}
