import java.util.Scanner;
public class num2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int min=60;
        sc.close();
        if (hour >0 && hour <=23) {
            if(minute<45) {
                minute=minute+min-45;
                hour-=1;
                System.out.println(hour+" "+minute);    
            }
            else if(minute>=45) {
                minute = minute-45;
                System.out.println(hour+" "+minute);    
            }
        }
        else if(hour==0 || hour ==24) {
            if(minute<45) {
                minute=minute+min-45;
                hour= 23;
                System.out.println(hour+" "+minute);    
            }
            else if(minute>=45) {
                minute = minute-45;
                System.out.println(hour+" "+minute);    
            }
        } 

    }
}
