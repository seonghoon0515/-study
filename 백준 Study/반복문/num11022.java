    // import java.util.Scanner;

    // public class num11022 {
    //     public static void main(String[] args) {
    //         Scanner ip = new Scanner(System.in);
    //         int tcn = ip.nextInt();
    //         for(int i=1; i<=tcn; i++) {
    //             int num1 = ip.nextInt();
    //             int num2 = ip.nextInt();
    //             System.out.println("Case #"+i+": "+num1 + " + " + num2 + " = " + (num1+num2));
    //         }
    //         ip.close();
    //     }
    // }

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
    import java.util.StringTokenizer;
    public class num11022 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tcn = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int num1;
            int num2;
            for(int i=1; i<=tcn; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                num1= Integer.parseInt(st.nextToken());
                num2 = Integer.parseInt(st.nextToken());
                System.out.println("Case #" + i +": " + num1 + " + " + num2 + " = " + (num1+num2));
            }
            br.close();
        }
    }