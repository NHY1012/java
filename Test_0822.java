package Test0822;

import java.util.Scanner;

class Circle {
	static double pi = 3.14; 
	double pi2 = 3.14159; 
}

public class Test_0822 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Circle circle = new Circle();
		
		System.out.print("반지름을 입력하세요: ");
		int num = s.nextInt();
		
		System.out.println("결과 값(3.14): "+ num * num* Circle.pi);
		System.out.println("결과 값(3.14159): "+ num * num* circle.pi2);
	}
}
