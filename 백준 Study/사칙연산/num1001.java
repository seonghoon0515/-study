// import java.util.Scanner;
// public class num1001 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println(a-b);
//         sc.close();
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class num1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        System.out.println(num1-num2);
    }
}