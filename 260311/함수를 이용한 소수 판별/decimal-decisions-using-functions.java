import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = isPrime(a,b);

        System.out.println(result);

    }

    public static int isPrime(int a,int b){
        int sum = 0;
        boolean isPrimeBoolean;

        for(int i = a; i <=b; i++){
            if(i<2) continue;
            isPrimeBoolean = true;

                for(int j = 2 ; j<i;j++ ){
                     if(i%j == 0){
                        isPrimeBoolean = false;    
                        break;
                    }
                   
                
            }
             if(isPrimeBoolean == true)sum += i;
    
        }
        return sum;
    }
}