package test1226;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test07_A {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //121
		int tmp = num;  //121 
		int result = 0; // 121
		while(tmp != 0) { // 0   
			result *=10; // 121   
			result += tmp %10; // 121    
			tmp /= 10; 
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		
        System.out.println("=========================");		
		String snum = ""+num;
		char[] arr = snum.toCharArray();
		int num1=arr[0]-'0';
		int num2=arr[arr.length-1]-'0';
		//앞부터 숫자값을 변경
		for(int i=1;i<arr.length;i++) {
			num1 *= 10;
			num1 += arr[i]-'0';		
		}
		//뒤부터 숫자값을 변경
		for(int i=arr.length-2;i>=0;i--) {
			num2 *= 10;
			num2 += arr[i]-'0';		
		}
		if(num1 == num2) 
			System.out.println(num + ": 대칭수");
		else
			System.out.println(num + ": 대칭수 아님");
		
        System.out.println("=========================");		
		StringBuilder sb = new StringBuilder(snum);
		//sb.reverse() : 문자열을 역순으로 저장
		String s2 = sb.reverse().toString();
		if(snum.toString().equals(s2)) 
			System.out.println(num + ": 대칭수");
		else
			System.out.println(num + ": 대칭수 아님");

	}
}
