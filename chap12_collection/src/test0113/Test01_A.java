package test0113;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * text 문자열에서 이메일을 추출하여 출력하기
  [결과]
  추출된 이메일:
  example_1@gmail.com
  contact@company.co.kr
 */
public class Test01_A {
	public static void main(String[] args) {
		// \w  == [0-9A-Za-z]
        String text = 
        	"Hello, my email is example_1@gmail.com and my work email is contact@company.co.kr.";
//		String emailP = "([0-9A-Za-z_]+)\\@([0-9A-Za-z]+)\\.([0-9A-Za-z]+)\\.([0-9A-Za-z]*)";
		String emailP = "([\\w_-]+)@([\\w]+)\\.([a-zA-Z]+)\\.([a-zA-Z]{0,2})";
		Pattern p = Pattern.compile(emailP); //패턴객체.
		Matcher m = p.matcher(text); //문자열 소스
		System.out.println("추출된 이메일:");
		while(m.find()) {
			System.out.println(m.group());
		}
        
    }
}
