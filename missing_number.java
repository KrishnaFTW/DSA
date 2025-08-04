public class missing_number {
   public int find(int[] nums){
      
      int n=nums.length;
      int missing = n *(n+1)/2;
      int sum=0;
      for(int i=0;i<n;i++){
         sum+=nums[i];
      }

      return missing-sum;
   }
   public static void main(String[] args) {
      missing_number m = new missing_number();
      int nums[] = {0,1};
      System.out.println("Missing is :" + m.find(nums));
   }
}
