import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr, int n){
        int j;
        int temp;
        for(int i=1;i< arr.length;i++){
           temp=arr[i];
           j=i;
           while(j>0 && arr[j-1]>temp){
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;
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
