package arrays;

public class ArrayRotation {
    /*public static void main(String[] args) {
        // Sample integer array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Number of positions to rotate left
        int x = 10;

        // Rotate the array left by x positions
        if(x>=0)
            rotateLeft(arr, x);
        else
            rotateRight(arr, x);

        // Display the rotated array
        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }*/


    public static void rotateLeft(int[] arr, int x){
        int n=arr.length-1;
        for (int j=0;j<x;j++){
            int temp=arr[0];
            for(int i=0; i<n; i++){
                arr[i]=arr[i+1];
            }
            arr[n]=temp;

        }

    }

    public static void rotateRight(int[] arr, int x){
        int n=arr.length-1;
        x = Math.abs(x) % n;
        int temp;
        for(int j=0; j<x; j++){
            temp=arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;

        }

    }
}
