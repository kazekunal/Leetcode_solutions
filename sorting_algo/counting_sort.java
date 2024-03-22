package sorting_algo;

//steps - 
//1. find the maximum element in the array(nputArray)
//2. create a new array(count_array) of size maximum element
//3. store the count of each number in the array in the count array
//4. update the value in the count_array with cummulative sum of elements in the input array
//5. create a new array output_array and store the values by traversing from the last element in the input_array
//6. update the output_array - 
// - output_array(count_array(input_array(i)) - 1) = input_array(i)
//7. decrement count_array
//8. return the sorted array

public class counting_sort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
 
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]); 
        }
 
        int[] countArray = new int[M + 1];
 
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
 
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
 
        int[] outputArray = new int[N];
 
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
 
        return outputArray;
    }
 
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] outputArray = countSort(inputArray);
 
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
