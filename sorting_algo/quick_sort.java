package sorting_algo;
public class quick_sort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] array, int low, int high){
        int pivot = array[high];

        int i = (low - 1);
        for(int j = low; j<= high; j++){
            if(array[j]<pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return (i+1);
    }

    static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int p1 = partition(arr, low, high);
            quicksort(arr, low, p1 - 1);
            quicksort(arr, p1+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 4, 2, 1, 5 };
        int N = arr.length;
 
        // Function call
        quicksort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
}
}
