public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Points to where the next non-zero should go

        // First pass: move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Second pass: fill remaining positions with 0
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Before: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZerosToEnd(arr);

        System.out.println("\nAfter: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
