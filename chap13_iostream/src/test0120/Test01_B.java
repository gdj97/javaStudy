package test0120;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작할 시작라인,출력 라인수를 입력받아서
 * 시작라인부터 라인수까지의 내용을 화면에 출력하기
 [결과]
 파일명을 입력하세요
 src/ex01_input/MainEx01_inputstream.java 
 시작라인 
 1
 라인수
 3
 
1:package ex01_input;
2:
3:import java.io.IOException;
 */
public class Test01_B {
	public static void main(String[] args) throws IOException  {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String filename = scan.nextLine();
		System.out.println("시작라인");
		int start  = scan.nextInt();
		System.out.println("라인수");
		int len = scan.nextInt();
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null; 
		int line=0,cnt=0;
		while((data=br.readLine()) != null) {
			++line;
			if(line < start) continue;
			if(cnt >= len) break;
			++cnt;
			System.out.println(line+":" + data);
		}
		br.close();
		scan.close();
	}
}
