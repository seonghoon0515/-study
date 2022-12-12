import java.util.Scanner;

public class num2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cook_time = sc.nextInt();
        sc.close();

        hour+=(cook_time/60);
        minute+=(cook_time%60);

        if(minute>=60) {
            hour+=1;
            minute-=60;
        }
        if(hour>=24) {
            hour-=24;
        }
        System.out.print(hour+" "+minute);
    }
}