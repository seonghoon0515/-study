// import java.util.Scanner;

// public class num8393 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum=0;
//         sc.close();
//         for(int i=1; i<=num; i++) {
//             sum+=i;
//         }
//         System.out.print(sum);
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class num8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int sum=0;
        for(int i=1; i<=num; i++) {
            sum+=i;
        }
        System.out.print(sum);
    }
}