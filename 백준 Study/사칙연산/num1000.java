// import java.util.Scanner;

// public class num1000 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         System.out.println(num1+num2);

//         sc.close();
        
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class num1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String[] arr = br.readLine().split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);

        System.out.println(num1+num2);

        
    }
}