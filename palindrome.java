public class palindrome {
    public static void main(String[] args) {
        int num=121;
        int digit;
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum=sum*10+digit;
            num=num/10;
            System.out.println(digit);
        }
        System.out.println(sum);
    }
}
