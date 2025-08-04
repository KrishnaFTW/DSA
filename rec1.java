public class rec1 {
    public static void f1(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        f1(i + 1, n);
    }

    public static void main(String[] args) {
        int i = 0;
        int n = 5;
        f1(i, n);
    }
}
