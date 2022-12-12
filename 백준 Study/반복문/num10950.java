import java.util.Scanner;

public class num10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tn = sc.nextInt();
        
        for(int i=0; i<tn; i++) {
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            int sum = num1+num2;
            System.out.println(sum);
        }
        sc.close();
    }
}
