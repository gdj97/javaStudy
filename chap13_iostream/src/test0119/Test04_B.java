package test0119;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 * FileReader 로 읽어, FileWriter로 복사하는 경우 이미지 등 이진 파일의 특징이 없어진다.
 * => 이진파일은 반드시 FileInputStream,FileOutputStream을 사용해야 한다
 */
public class Test04_B {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/test0119/apple.gif");
		FileWriter fos = new FileWriter("src/test0119/apple3.gif");
		char[] buf = new char[1000];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			fos.write(buf,0,len);
		}
		System.out.println("apple.gif 파일 복사완료");
		fis.close();
		fos.flush();
		fos.close();
	}
}
