import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    static void sort(int[] arr){
        int len= arr.length;
        for(int i=len/2-1;i>=0;i--) {
            heapify(arr,len,i);
        }

        for(int i=len-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }

    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int li=2*i+1;
        int ri=2*i+2;

        if(li<n && arr[li]>arr[largest]){
            largest=li;
        }

        if(ri<n && arr[ri]>arr[largest]){
            largest=ri;
        }

        if(largest != i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
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

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
