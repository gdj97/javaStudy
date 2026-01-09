package ex02_string;

public class MainEx03 {
	public static void main(String[] args) {
		String s = "This is a String";
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,13));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		s = "   문자열 trim 메서드        ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.trim().length());
		str = "홍길동,이몽룡,,김삿갓,abc";
		String[] arr = s.split(",");
		for(String s : arr) System.out.println(s);
		char[] carr = s.toCharArray();
		for(char c : carr) System.out.println(c);
		s = "abcdefghi";
		byte[] barr = s.getBytes();
		for(byte b : barr) System.out.println((char)b);
	}
}
