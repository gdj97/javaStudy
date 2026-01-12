package test0109;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시스템과 사용자 중3번 연속 true가 나오는 한쪽이 승리
 * 하는 프로그램 구현하기
 * [결과]
 * 시스템:true, 사용자:true
 * 시스템:true, 사용자:false
 * 시스템:false, 사용자:true
 * 시스템:true, 사용자:true
 * 시스템:true, 사용자:true
 * 사용자승리
 */

public class Test08_A {
	public static void main(String[] args) {
        Random sysrand = new Random();
        Random userrand = new Random();
		int scnt=0,ucnt=0;
		while(true) {
			boolean sys = sysrand.nextBoolean();
			System.out.print("시스템 " + sys + "\t");
			if(sys)  scnt++; //sys==true
			else 	scnt = 0;
			
			boolean user = userrand.nextBoolean();
			System.out.println("사용자 " + user);
			if(user) ucnt++;
			else  	 ucnt = 0;

			if(ucnt == 3 || scnt == 3) break;
		}
		if(ucnt == scnt) System.out.println("비김");
		else if (ucnt > scnt)  System.out.println("사용자 승리");
		else System.out.println("시스템 승리");

	}
}
