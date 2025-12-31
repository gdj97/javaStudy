package test1230;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle {
	int r,no;
	static int count;
	double area() {
		return r * r * Math.PI;
	}
	double length() {
		return 2 * r * Math.PI;
	}
	void scale(double m) {
		r *=m;
		//r = (int)(r * m);
	}
	public String toString() {
		return no + "번원 : 반지름:" + r + ", 넓이:" + area() + ", 둘레:" + length();
	}
}

public class Test05_A {
	public static void main(String[] args) {
		Circle[] carr=new Circle[3]; //참조변수 3개를 배열로 생성
		carr[0] = new Circle(); //Circle 객체
		carr[0].r = 10;
		carr[0].no = ++Circle.count;
		
		carr[1] = new Circle();
		carr[1].r = 20;
		carr[1].no = ++Circle.count;
		
		carr[2] = new Circle();
		carr[2].r = 100;
		carr[2].no = ++Circle.count;
		for(Circle c : carr) {
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}
