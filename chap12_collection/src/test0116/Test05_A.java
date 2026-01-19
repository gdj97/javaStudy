package test0116;
/*
다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
	A=	0	0	0	9			B = 7	4	4
		0	1	0	0				0	3	9			
		0	0	0	0				1	1	1				
		0	0	7	0				3	2	7			
		0	0	0	0				5	0	3				
		3	0	0	0
		0	0	0	0
		
1. cnt = A행렬을 검색해서 0이아니값의 갯수 계산
  b배열 생성
  new b[cnt+1][3]
2. A행렬의 행과 열의 계산한다.
  A행렬의 행의수 : a.length
  A행렬의 열의수 : a[0].length
  b[0][0] = a.length
  b[0][1] = a[0].length
  b[0][2] = cnt
3. a 행렬을 조회해서 0이 아닌값이 나오면 해당 행과 열을
  b 배열의 값으로 설정   
  
4. b배열을 출력   	
 */
public class Test05_A {
	public static void main(String[] args) {
		int[][] a = { 
				{ 0, 0, 0, 9 }, { 0, 1, 0, 0 },
				{ 0, 0, 0, 2 }, { 0, 0, 7, 0 },
				{ 0, 0, 0, 0 }, { 3, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		int cnt=0;
		System.out.println("A=");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]!=0) {
					cnt++;
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		int[][] b = new int[cnt+1][3];
		int num =0;
		b[0][0] = a.length;
		b[0][1] = a[0].length;
		b[0][2] = cnt;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]!=0) {
					b[++num][0] = i;
					b[num][1] = j;
					b[num][2] = a[i][j];
				}
			}
		}
		System.out.println("\nB=");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		

	}
}
