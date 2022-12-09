import java.util.Scanner;

public class num3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] chess = {1, 1, 2, 2, 2, 8};
        int [] input_chess = new int[6];
        for(int i=0; i<input_chess.length; i++) {
            input_chess[i] = sc.nextInt();
        }
        for(int i=0; i<chess.length; i++) {
            System.out.print(chess[i]-input_chess[i]+" ");
        }
    }

}