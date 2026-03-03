import java.util.Scanner;
public class Main {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int size = B-A+1;
        int arr[]= new int[size];
        int i=0;
        
        
        for(int j= A ; j <= B; j++) {
            arr[i] = j;
            if(arr[i]%3 == 0) {
                count++;}
            i++;
        }
        
        answerNum(arr);
     }

     static void answerNum(int[] c){
        for(int k : c){
            while(k%10 > 0){
               if(k%10 == 3){
                 count++;
                 k=k/10;
               } else if(k%10 == 6){
                count++;
                k=k/10;
               } else if(k%10 == 9){
                count++;
                k=k/10;
               } else{
                continue;
               }
            }
        }
     }
}