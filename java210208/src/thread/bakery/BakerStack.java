package thread.bakery;

import java.util.Vector;

public class BakerStack {
	private Vector<String> v = new Vector<>();
	public synchronized String pop() {
		String bread = null;
		if(v.size()==0) {
			try {
				System.out.println("There is no Bread");
				this.wait();
			} catch (Exception e) {
				System.out.println("pick bread Exception : "+e.toString());
			}
			
		}
		bread = v.remove(v.size()-1);
		return bread;
	}
	public synchronized void push(String bread) {
		System.out.println("Pick the Bread");
		this.notify();
	}
}
