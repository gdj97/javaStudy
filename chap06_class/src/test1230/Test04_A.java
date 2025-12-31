package test1230;

/*
 * 다음 결과가 나오도록 Watch 클래스 구현하기
 */
class Watch{
	int hour;  // 0 ~ 23
	int minute;  // 0 ~ 59
	int second;  // 0 ~ 59
	
	// 메소드
	public void addHour(int hour) {
		if(hour <= 0) {
			return;
		}
		this.hour += hour; //16+25
		this.hour %= 24;  // hour를 항상 0 ~ 23의 범위로 만들어 주는 코드
	}
	public void addMinute(int minute) {
		if(minute <= 0) {
			return;
		}
		this.minute += minute;
		addHour(this.minute / 60);  // 몇 시간이 추가되었는지 처리하는 코드
		this.minute %= 60;  // minute을 항상 0 ~ 59의 범위로 만들어 주는 코드
	}
	
	public void addSecond(int second) {
		if(second <= 0) {
			return;
		}
		this.second += second;
		addMinute(this.second / 60);  // 몇 분이 추가되었는지 처리하는 코드
		this.second %= 60;  // second을 항상 0 ~ 59의 범위로 만들어 주는 코드
	}
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
public class Test04_A {
	public static void main(String[] args) {
		Watch watch = new Watch();
		watch.hour = 16;
		watch.minute = 15;
		watch.second = 30;
		watch.see();  // 16시 15분 30초
		watch.addHour(25);  	// 25시간 후(1시간)
		watch.see();  // 17시 15분 30초
		watch.addMinute(61);	// 61분 후 	(1시간 1분)
		watch.see();  // 18시 16분 30초
		watch.addSecond(3661);	// 3661초 후(1시간 1분 1초)
		watch.see();  // 19시 17분 31초
	}
}
