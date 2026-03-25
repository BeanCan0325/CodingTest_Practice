import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        double c = ( a+b)/2.0;
        System.out.printf("%d %.1f\n", (a+b),c);
    }
}