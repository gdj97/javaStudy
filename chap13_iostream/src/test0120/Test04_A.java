package test0120;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
  D:/20251222/java/workspace/chap13_iostream/src/ : 각자의 chap13 폴더

  D:/20251222/java/workspace/chap13_iostream/src/폴더 하위 폴더의 .java 파일 중
   Exam 관련 모든 소스 내용을  자바IO실습예제.txt  파일 하나에 저장 하기

Exam 관련 모든 소스 : ExamXXX.java

*/
public class Test04_A {
	static Vector<InputStream> vector = new Vector<>();
	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");
//		File f1 = new File("src");  //상대경로. 기준폴더:프로젝트폴더
		File f1 = new File("D:/20251222/java/workspace/chap13_iostream/src/"); //절대경로
		dirSearch(f1,f1.list()); //Exam으로 시작하는 자바소스가 vector에 저장
		int len;
		FileOutputStream fos = new FileOutputStream("자바IO실습예제.txt");
		SequenceInputStream sis = new SequenceInputStream(vector.elements());
		byte[] buf = new byte[1024]; //1K
		while((len=sis.read(buf)) != -1) {
			fos.write(buf,0,len);
	    }
		fos.flush();
		fos.close();
		sis.close();
		System.out.println("프로그램 종료");
    }
	//재귀함수 : 자신의 함수를 다시 호출
	private static void dirSearch(File f,String[] dir) throws IOException {
		for(String file : dir) {
			File f2 = new File(f,file); // src, ex02 
			if(f2.isDirectory()) {  
				dirSearch(f2,f2.list()); // src/ex01, 하위목록
		    } else {
		    	if(file.startsWith("Exam"))
		    	   vector.add(new FileInputStream(f2)); 
		    }
		}		
	}
}
