package sorting_algo;

//Dutch National Flag Algorithm -> sort colors sorting algorithm highly beneficial for 3 sorting elements;
public class DNF {
    public static void dutch_national_flag(int[] nums){
        int lo = 0;
        int hi = nums.length - 1;
        int temp = 0;
        int mid = 0;

        while(mid <= hi){
            switch(nums[mid]){
                case 0:{
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = nums[hi];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,0,1,2,2};
        dutch_national_flag(nums);
    }
}
