package thread.bakery;

public class Baker extends Thread{
	BakerStack bs = null;
	public Baker(BakerStack bs) {
		this.bs = bs;
	}
	public Baker() {

	}
	@Override
	public void run() {
		String bread = null;
		bread = getBread();
		bs.push(bread);
		try {
			Thread.sleep(3000); // 3초 정지
		} catch (InterruptedException e) {
			System.out.println("Who?");
		}
	}
	public String getBread() {
		String bread = null;
		switch((int)(Math.random()*3)) {
		case 0:
			bread = "CASE1 BREAD";
			break;
		case 1:
			bread = "CASE2 BREAD";
			break;
		case 2:
			bread = "CASE3 BREAD";
			break;
		}
		return bread;
	}
}
