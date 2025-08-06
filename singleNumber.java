
class singleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor = xor ^ nums[i];  // XOR logic: cancels duplicates
        }
        return xor;
    }
     public static void main(String[] args) {
        // Example input where every element appears twice except one
        int[] nums = {4, 1, 2, 1, 2};

        // Create an instance of the Solution class
        singleNumber sol = new singleNumber();

        // Call the singleNumber method and print the result
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
