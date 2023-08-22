/*2개의 정수를 입력 받아 합을 출력하시오.
① 두 수 사이의 합계를 계산한다.
② 두 수 사이의 홀수의 합계를 계산한다. 
③ 두 수 사이의 짝수의 합계를 계산한다.
2개의 값으로 각 합을 계산하여 돌려주는 클래스와 메소드를 생성하시오.*/


package Test0822;
import java.util.Scanner;

//두 수 사이의 합
class Number1 { // 클래스 생성
	
	public static int  number1 (int a, int b) { // 클래스 안에 메소드 생성
		int sum1 = 0;
		for(int i =  ++a; i < b; i++) {
			sum1 += i;
		}
		return sum1;
	}

// 두 수 사이의 홀수의 합
public int number2 (int a, int b) {
    int sum2 = 0;
    for (int i = ++a; i < b; i++) {
        if (i % 2 != 0) {
            sum2 += i;
        }
    }
    return sum2;
}

// 두 수 사이의 짝수의 합
public int number3(int a, int b) {
    int sum3 = 0;
    for (int i = a; i < b; i++) {
        if (i % 2 == 0) {
            sum3 += i;
        }
    }
    return sum3;
}
}

public class Test0822_3{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Number1 number1 = new Number1(); 
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = s.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = s.nextInt();
		
		System.out.println("두 수 사이의 합: " + number1.number1(num1,num2));
        System.out.println("두 수 사이의 홀수의 합: " + number1.number2(num1,num2));
        System.out.println("두 수 사이의 짝수의 합: " + number1.number3(num1,num2));
	}
}