import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0; // 조건에 맞는 숫자의 개수를 셀 변수

        for(int i = A; i <= B; i++) {
            
            // 1. 3의 배수인지 먼저 확인
            if(i % 3 == 0) {
                count++;
            } 
            // 2. 3의 배수가 아니라면 자릿수 검사 시작
            else {
                int temp = i; // ★ 핵심 1: 원본 i를 보호하기 위해 대타(temp) 투입!
                
                while(temp > 0) {
                    // 맨 끝자리가 3, 6, 9 중 하나인지 확인
                    if (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) {
                        count++;
                        break; // 하나라도 발견하면 더 이상 자릿수 검사할 필요 없이 탈출!
                    }
                    
                    temp = temp / 10; // ★ 핵심 2: 무한 루프 방지! 검사한 끝자리 잘라내기
                }
            }
        }
        
        System.out.println(count); // ★ 핵심 3: 모든 반복문이 끝난 후 최종 결과 출력
    }
}