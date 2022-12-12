import java.util.Scanner;

public class num2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        sc.close();
        if(input1 == input2 && input2 == input3) {
            System.out.println(10000+(input1*1000));
        }
        else if(input1 == input2 || input2 == input3 || input1 ==input3) {
            if(input1 == input2 | input1 == input3) System.out.println(1000+(input1*100));
            else if(input2 == input3) System.out.println(1000+(input2*100));
        }
        else {
            int a = Math.max(input1, input2);
            int b = Math.max(a, input3);
            System.out.println(b*100);
        }
    }
}