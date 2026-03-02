import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int b = adds(n);
        if(b%5 ==0 && b%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
  
    }

  static int adds(int a){
       int tens =a/10;
       int ones =a%10;

       return tens+ones;
    }
    
}