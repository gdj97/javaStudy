package test1229;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
 */

public class Test07_B {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int[][] arr = new int[h][h];
		int sum = 0;
		for (int i = 1; i <= h; i++) {
			sum += i;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i ; j < arr[i].length; j++) {
				arr[i][j] = sum--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) System.out.print("      ");
				else System.out.printf("%6d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
