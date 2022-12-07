// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class num10998 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String a[] = br.readLine().split(" ");
//         int num1 = Integer.parseInt(a[0]);
//         int num2 = Integer.parseInt(a[1]);

//         System.out.println(num1*num2);
//     }
// }

import java.util.Scanner;

public class num10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1*num2);
        sc.close();
    }
}