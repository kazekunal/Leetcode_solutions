package sorting_algo;
import java.util.*;

//binary sorting algorithm
public class binary_sort {
    public void sort(int array[],int first,int last, int key){
        
        int mid = (first + last) / 2;

        while(first <= last){
            if(array[mid] < key){
                first = mid + 1;
            }
            else if(array[mid] == key) {
                System.out.println("element is found at index: " + mid);
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last){
            System.out.println("element is not in array");
        }
        
    }


    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("enter the number to be inserted in array");
        for(int i = 0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key to be found");
        int key = sc.nextInt();

        new binary_sort().sort(arr,0,arr.length - 1,key);
        for(int i = 0; i<arr.length; i++)
            System.err.print(arr[i]);
    }
}
