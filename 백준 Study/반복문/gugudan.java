import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작할 단수를 입력해주세요: ");
        int start = sc.nextInt();
        System.out.print("종료할 단수를 입력해주세요: ");
        int last  = sc.nextInt();
        sc.close();
        for(int i =start; i<=last; i++) {
            System.out.println(i+"단");
            for(int j=1; j<=9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }    
}
