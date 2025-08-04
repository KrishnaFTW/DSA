public class rec2 {
    public static void f1(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        f1(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 3;
        f1(n, 0);
    }
}
