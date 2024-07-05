package sorting_algo;

public class merge_sort {
    public static void mergesort(int[] arr){
        if(arr.length <= 1) return;

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergesort(left);
        mergesort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 1};
        
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Sort the array using merge sort
        mergesort(arr);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
