public class bubble {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        int n=5;
        System.out.println("Orignaml Array :");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
