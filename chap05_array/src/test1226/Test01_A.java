package test1226;
/*
 * 가로 구구단 출력하기
 *  2단       3단        9단
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 */

public class Test01_A {
	public static void main(String[] args) {
		//단 부분 출력
		for (int i = 2; i <= 9; i++)
			System.out.print("="+i + "단=" + "\t");
		System.out.println();
		//구구단 가로 출력
		/*  i   j
		 *  2 * 2 = 4
		 *  3 * 2 = 6
		 *  4 * 2 = 8
		 *  5 * 2 = 10
		 *  ...
		 */
		for (int j = 2; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
