package test0120;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class Test01_A {
	public static void main(String[] args) throws IOException  {
		BufferedReader stdin = new BufferedReader
				         (new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String filename = stdin.readLine();
		System.out.println("시작라인");
		String stl = stdin.readLine();
		System.out.println("라인수");
		String snum = stdin.readLine();
		int start = Integer.parseInt(stl); //시작 라인번호
		int len = Integer.parseInt(snum);  //출력할 라인갯수
		//파일 읽기
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null; //파일에서 읽은 한줄 데이터. 
		int line=0,cnt=0; //line:라인번호, cnt:출력한 라인갯수
		while((data=br.readLine()) != null) {
			++line;
			if(line < start) continue; //화면에 출력번호가 아님
			if(cnt >= len) break;
			++cnt;
			System.out.println(line+":" + data);
		}
		br.close();
		stdin.close();
	}
}
