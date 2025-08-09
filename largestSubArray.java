public class largestSubArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int sum=arr[0];
        int len = 0;
        int left=0,right=0;
        int k = 6;
        int maxLen = 0;
        int n = arr.length;
        while(right < n){
            while(left <= right && sum > k){
                sum-=arr[left];
                left++;
            }
            if(sum == k ){
                len = (right - left) + 1; 
                if(len > maxLen){
                    maxLen = len;
                }
            }

            right++;
            if (right < n) {
                sum+=arr[right];
            }
        }
        System.out.println(maxLen);
    }
}