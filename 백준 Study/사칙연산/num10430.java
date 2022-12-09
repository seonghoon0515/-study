import java.util.Scanner;

public class num10430 {
    public static void main(String[] argrs) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println((A+B)%C);
        System.out.println(((A%B)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%B)*(B%C))%C);
        sc.close();
    }
}