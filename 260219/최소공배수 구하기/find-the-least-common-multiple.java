import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a= n;
        int b =m;

        while(b != 0){
            int r = a%b;
            a=b;
            b=r;
        }
        System.out.println((n/a)*m);
        
        // Please write your code here.
    }
}