public class sortZerosOnesTwos {
    public static void swap (int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int high = n - 1;
        int left = 0;
        int mid = 0;
        while ( mid <= high ){
            if(nums[mid] == 0){
                swap(nums,left,mid);
                mid++;
                left++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
               // mid++;
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = {1,0,2,1,0,1};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        
    }
}
