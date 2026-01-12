package test0109;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나 
 */

public class Test03_A {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); //왼쪽정렬
		System.out.println(format(str, 7, 1)); //가운데정렬
		System.out.println(format(str, 7, 2)); //오른쪽 정렬
		System.out.println(format(str, 2, 0)); //갯수만큼
		System.out.println(format(str, 11, 2)); //오른쪽 정렬
	}
	static String format(String str, int len, int align) {
		if (str.length() >= len)
			return str.substring(0, len);
		//문자열길이 < len 
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			sb.append(" ");
		}
		int l = len - str.length();  //공백의 갯수 (4)
		switch (align) {
		 case 0:sb.replace(0, str.length(), str);break;
		 case 1:sb.replace(l/2,str.length()+l/2, str);break; //00가나다00
		 case 2:sb.replace(l,str.length()+l, str);break;  //0000가나다
		}
		return sb.toString();
	}
	
}
