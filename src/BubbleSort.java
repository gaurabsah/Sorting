import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void sort(int[] arr, int n){
        int temp;
        int flag=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
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
