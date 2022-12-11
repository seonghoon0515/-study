import java.util.Scanner;

public class num2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yoon_year = sc.nextInt();
        if(yoon_year%4==0 && yoon_year% 100 != 0 || yoon_year % 400 == 0) {
            System.out.println(1);
        }
        else 
            System.out.println(0);
    }
}