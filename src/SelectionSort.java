import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr, int n){
        int min;
        int temp;
        for(int i=0;i< arr.length;i++){
            min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                  min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements inside array: ");
        int n = scn.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        sort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
