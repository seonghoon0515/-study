import java.util.Scanner;

public class num25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int tcn = sc.nextInt();
        int[] arr = new int[tcn];
        int recipe_sum=0;
        for(int i=0; i<tcn; i++) {
            int a = sc.nextInt();
            int b=  sc.nextInt();
            arr[i] = a*b;
            recipe_sum+=arr[i];
        }
        if( sum == recipe_sum) {
            System.out.println("Yes");
        }
        else System.out.println("No");
        sc.close();
    }
}