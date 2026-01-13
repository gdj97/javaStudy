package test0112;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2026-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2026-01-03
2026-01-03 -2026-01-01 일자의 차이 : 2
  
 */
public class Test01_A {
	public static void main(String[] args) throws ParseException {
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine(); //String next()
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String second = scan.nextLine();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
		Date fdate = sf.parse(first); //Date <= 문자열
		Date sdate = sf.parse(second);
		//sdate.getTime() : 두번째 날짜의 밀리초
		//fdate.getTime() : 첫번째 날짜의 밀리초
		// 차의 결과 : 두 날짜사이의 밀리초
		// 일자차일 : 밀리초/일자의밀리초
		long datecnt = (sdate.getTime() - fdate.getTime())/(1000*60*60*24);
		System.out.printf("%s -%s 일자의 차이 : %d\n",second,first,datecnt);
	}
}
