import java.util.Scanner;

public class num10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int minus = num1-num2;
        int multiple = num1*num2;
        int divide = num1/num2;
        int remainder = num1%num2;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(divide);
        System.out.println(remainder);
        
    }
}