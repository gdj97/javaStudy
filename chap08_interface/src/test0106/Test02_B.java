package test0106;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.
 */

interface Robot2 {
	void action();
}
class DanceRobot2 implements Robot2 {
	@Override
	public void action() {
		System.out.println("DanceRobot은 춤을 춤니다.");
	}
}
class SingRobot2 implements Robot2 {
	@Override
	public void action() {
		System.out.println("SingRobot은 노래를 부릅니다.");
	}
}
class DrawRobot2 implements Robot2 {
	@Override
	public void action() {
		System.out.println("DrawRobot은 그림을 그립니다.");
	}
}
public class Test02_B {
	public static void main(String[] args) {
		Robot2[] robot = new Robot2[3];
		robot[0] = new DanceRobot2();
		robot[1] = new SingRobot2();
		robot[2] = new DrawRobot2();
		for(Robot2 r : robot) {
			r.action(); 
		}
	}
}
