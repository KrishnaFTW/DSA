
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int temp[] = {2,3,4};
        System.out.println("Enter K value :");
        int k=sc.nextInt();
        int j=0;
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
            //System.out.println(temp[i]);
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=k+1;i<n-1;i++){
            arr[i] = temp[j];
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
