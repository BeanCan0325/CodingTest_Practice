import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean isYoon = false;

        if (y%4 == 0 ) isYoon = true;

        if (y%100 == 0 && y%400 != 0 ) isYoon= false;

       System.out.println(isYoon);








    }
}