import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = magicPrime(a,b);

        System.out.println(result);

    }

    public static int isPrime(int a,int b){
        int sum = 0;
        int prime;
        for(int i = a; i <=b; i++){
            
            if(prime%i == 0){
                continue;
            }else{
                sumt += i
            }

        }
        return sum;
    }
}