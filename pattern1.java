public class pattern1{
    public static void pattern1() {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        for(int i=0;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for(int i=0;i<9;i++){
            for(int j=8;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern5(){
        int count=1;
        for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                if(count>10){
                    break;
                }
                System.out.print(count +" ");
                count++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      // pattern1();
       //pattern2();
       //pattern3();
       //  pattern4();
      // pattern5();
    }
}