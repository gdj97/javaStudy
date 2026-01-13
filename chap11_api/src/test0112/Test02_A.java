package test0112;
/*
 * 
년도와 월를 입력하세요
2025 02

	   2025년2월
   일  월  화   수  목  금   토
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test02_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //입력받은 년월의 1일로 설정
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //요일
		int lastday = cal.getActualMaximum(Calendar.DATE); //입력받은 년월의 마지막일자
		
		System.out.println("\t"+year + "년 " + mon + "월");
		System.out.printf("%3c %3c %3c%3c %3c%3c %3c\n",'일','월','화','수','목','금','토');

		for(int i=1,day=1;day<=lastday;i++) {
			if(i < firstWeek) System.out.printf("%4s"," ");
			else System.out.printf("%4d",day++);
			if(i%7==0)System.out.println();
		}
	}
}
