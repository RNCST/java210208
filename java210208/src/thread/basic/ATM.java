package thread.basic;

public class ATM extends Thread {
	private int depositeMoney = 10000;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				withDraw(1000);
			}
		}
	}

	private void withDraw(int withDrawMoney) {
		if (depositeMoney >= 0) {
			if (depositeMoney > withDrawMoney) {
				depositeMoney = depositeMoney - withDrawMoney;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("잔액 : %,d 원 %n", depositeMoney);
			} else {
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.println("잔액이 부족합니다.");
				this.stop();
			}
		}

	}
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread thread1 = new Thread(atm);
		thread1.run();
	}
}
