package Vending;

import java.util.Scanner;

class Drink_1 {
    public void num(int x) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("음료를 선택하세요(1: 콜라 | 2: 사이다): ");
        int Drinks = s.nextInt();

            if(Drinks == 1) {
            	System.out.println("콜라 가격은 1500원 입니다.");
            	System.out.print("금액을 넣어 주세요: " );
            	int money = s.nextInt(); // 돈
            	
            	if(money >= 1500) {
            		System.out.println("이용 해주셔서 감사합니다.");
            	}
            	
            	else{
            		System.out.println("금액이 부족합니다. 이용을 종료합니다.");
            	}
            }
            
            if(Drinks == 2) {
            	System.out.print("사이다 가격은 1400원 입니다.");
            	System.out.print("금액을 넣어 주세요: " );
            	int money = s.nextInt(); // 돈
            	
            	if(money >= 1400) {
            		System.out.println("이용 해주셔서 감사합니다.");
            	}
            	
            	else{
            		System.out.println("금액이 부족합니다. 이용을 종료합니다.");
            	}
            	
            }
        }
	}     

/*
상속이랑, 오버로딩, 오버라이딩, 슈퍼 배운 것들을 활용해서 쓰려고 그랬는데 제가 아직은 활용을 하기에는 부족한 면이 없지 않아 있었습니다.
처음에는 로직도 이해 못해서 코드 자체를 짜는 걸 힘들어 했고, 메인이랑 코드 짜는 부분을 나눠서 하는 것도 이해 조차가 안 됐는데 
수업하면서 코드를 보고 분석하고 이해할 수 있는 정도의 개념은 확실히 생긴 거 같습니다!!

알려주신 것처럼 적어도 상속 개념은 좀 잡혀 있어서 활용을 해보려고 했는데 제 생각대로 조금씩 짜면서 
상속 부분이 불필요해 지기도 했고, 그 이상으로 제가 구성을 하는 게 무리가 있어서 일단은 이렇게 마무리하게 됐습니다.

시간이 좀 걸려도 일단은 혼자 천천히 완성시켜 보려고 합니다.
일주일 동안 특강해 주셔서 감사합니다 교수님!! 개강하고 뵙겠습니다!
*/