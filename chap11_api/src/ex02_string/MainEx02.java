package ex02_string;
/*
 * String 클래스의 주요메서드
 */
public class MainEx02 {
	public static void main(String[] args) {
		String s = "ABCDEFGH";
		//s문자열의 4번인덱스에 해당하는 문자 리턴. 5번째 문자
		System.out.println(s.charAt(4)); //E
		//정렬관련메서드. 결과가 음수 : s 문자열이 abc문자열 보다 앞쪽 순서. 
		//             결과가 양수: s문자열이 abc문자열 보다 뒷쪽 순서
		System.out.println(s.compareTo("abc")); //-32
		//IgnoreCase : 대소문자 상관없이
		// 0 : s 문자열과 abcdefgh 문자열은 같다.
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0
		//s문자열이 ABC로 시작?
		System.out.println(s.startsWith("ABC")); //true
		//s문자열이 FGH로 끝?
		System.out.println(s.endsWith("FGH"));  //true
		System.out.println(s.equals("ABCDEFGH")); //true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //true
		System.out.println("=========================");
		s = 	"This is a String";
		//indexOf(char) : char가 몇번 인덱스. 첫번째 인덱스 리턴 
		//indexOf(String) : String이 몇번 인덱스. 첫번째 인덱스 리턴 
		System.out.println(s.indexOf('i')); //2
		System.out.println(s.indexOf("is")); //2
		//lastIndexOf() : 뒤우선으로 찾아서 인덱스 리턴
		System.out.println(s.lastIndexOf("is")); //5
		System.out.println(s.lastIndexOf('i')); //13
		//i문자 3번 인덱스 부터 검색하여 인덱스 리턴
		System.out.println(s.indexOf('i',3)); //5
	}
}
