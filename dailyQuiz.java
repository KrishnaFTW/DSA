class dailyQuiz {
    public static boolean isPowerOfTwo(int n) {
        int og = n;
        int sum =1;
        if( n == 1){
            System.out.println(sum);
            return true;
        }
        int i= 0;
        while(sum <= n){
            if(sum > n){
                break;
            }
            int temp = 2 * sum;
            sum = temp;
            if(sum == n){
                System.out.println(sum);
                return true;
            }
            i++;
        }
        System.out.println(sum);
        return false;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPowerOfTwo(n));
    }
}