import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(king(a,b,c));
    }

    public static int king(int a, int b, int c){

        int kking = a;
        if(kking> b){
            kking = b;
        }
         if(kking >c){
            kking =c;
        }
        return kking;
    }
}