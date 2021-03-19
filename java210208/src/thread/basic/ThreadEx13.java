package thread.basic;

class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("[[[ A스레드 RUN ]]]");
	}
}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("[[[ B스레드 RUN ]]]");
	}
}

class ThreadEx13 {
	public static long startTime = 0;
	/*
	 * 34 [main thread 시작] 
	 * 35 [A thread 로딩-ready]
	 * 36 [B thread 로딩-ready]
	 * 38 [A thread 시작-start() -> run()]
	 * 39 [B thread 시작-start() -> run()]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		A th1 = new A();
		B th2 = new B();
		B th  = new B();
		Thread th3 = new Thread(th);
	
		th1.start(); // 콜백메소드인 run을 호출
		th2.start();
		
		
		
		startTime = System.currentTimeMillis();
		
		
		try {
			th1.join(); // th1작업이 끝날 때까지 기다린다.
			th2.join(); // th2작업이 끝날 때까지 기다린다.
		} catch (InterruptedException e) {}
		
		System.out.println("소요시간:" + (System.currentTimeMillis() - ThreadEx13.startTime));
	}

}
