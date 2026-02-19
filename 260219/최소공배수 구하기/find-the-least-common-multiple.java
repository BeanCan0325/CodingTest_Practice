import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=2; i <101 ; i++){
            if (n%i == 0 && m%i == 0){
                System.out.print(i);
            }
        }
        // Please write your code here.
    }
}