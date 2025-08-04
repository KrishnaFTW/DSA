import java.util.HashSet;

public class happy {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        if (n==1){
            return true;
        }
        else{
            return false;
        }
        
    }

    private static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n)); // Output: true
    }
}
