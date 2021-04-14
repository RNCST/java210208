package thread.bakery;

import java.util.Vector;

public class BakerStack {
	String bread = null;
	private Vector<String> breadVector = new Vector<>();

	public synchronized String pickBread() {
		System.out.println("===run BakerStack");
		for (int i = 0; i < breadVector.size(); i++) {
			if (breadVector.size() == 0) {
				try {
					System.out.println("There is no Bread");
					this.wait();
				} catch (Exception e) {
					System.out.println("pick bread Exception : " + e.toString());
				}

			}
		}
		System.out.println("===pick up | " + bread);
		bread = breadVector.remove(breadVector.size() - 1);
		System.out.println("===ROUND END  ");
		System.out.println("  ");
		return bread;
	}

	public synchronized void push(String bread) {
		System.out.println("===run BakerStack push || Pick the Bread");
		this.bread = bread;
		System.out.println("this bread is " + bread);
		breadVector.add(bread);
		this.notify();
	}
}
