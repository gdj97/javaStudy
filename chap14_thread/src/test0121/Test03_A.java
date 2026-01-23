package test0121;
/*
 SumRunnable 클래스 구현하기 
1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Runnable 인터페이스를 구현하는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합
main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램
 */
class SumRunnable implements Runnable { //Thread 클래스의 객체 아님
	int start, end,sum;
	SumRunnable(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void run() {
		for(int i=start;i<=end;i++) {
			sum += i;
		}
	}
}

public class Test03_A {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable[] arr = new SumRunnable[5];
		Thread[] tarr = new Thread[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new SumRunnable(i*200+1,(i+1)*200);
			tarr[i] = new Thread(arr[i]); //Thread 객체
			tarr[i].start();
		}
		int sum = 0;
		for(Thread t : tarr) {
			t.join();
		}
		for(SumRunnable r : arr) {
			sum += r.sum;
		}		
		System.out.println("1 ~ 1000까지의 합:" + sum);
	}
}
