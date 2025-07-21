public class question4 {
    public static int swaps(int[] arr){
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                while (arr[i] != i + 1) {
                    int temp = 0;
                    temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
