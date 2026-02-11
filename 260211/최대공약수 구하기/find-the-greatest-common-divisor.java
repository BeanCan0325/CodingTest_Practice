import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 0;

        for(int i=1; i<=n;i++){

             if(n%i == 0 && m%i ==0){
                    t = i;
             }

        }
                System.out.println(t);
        // Please write your code here.
    }
}