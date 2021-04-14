package thread.bakery;

/**
 * like loginClientThread
 * @author OSH
 *
 */
public class Baker extends Thread{
	BakerStack bakerStack = null;
	
	
	public Baker(BakerStack bakerStack) {
		System.out.println("===run Baker(BakerStack bakerStack)");
		this.bakerStack = bakerStack;
	}
	public Baker() {

	}//wait join notify yield(양보) sleep
	@Override
	public void run() {
		System.out.println("===run Baker.start() and Baker.run()");
		String bread = null;
		bread = makeBread();
		bakerStack.push(bread);
		try {
			Thread.sleep(9999999); // 3초 정지
		} catch (InterruptedException e) {
			System.out.println("Who?");
		}
	}
	public String makeBread() {
		System.out.println("===run Baker.makeBread() (1~3 random bread)");
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
		System.out.println("===make ||"+bread+"|| in this time");
		return bread;
	}
}
