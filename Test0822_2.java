		/*
		2개의 정수를 입력 받아 합을 출력하시오.
		2개의 값으로 합을 계산하여 돌려주는 클래스와 메소드를 생성하시오.
		*/

package Test0822;
import java.util.Scanner;

class Num {
	public int Num1 (int a, int b){		
		 return a + b;
		 	 
	}
}
		
public class Test0822_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Num num = new Num();
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = s.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = s.nextInt();

		System.out.println("정수 값: "+ num.Num1(num1, num2));
		
	}
}