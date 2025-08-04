public class selection {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        int n=5;
      
        for (int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]);
    }
}
