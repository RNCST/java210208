package design.duck;

public abstract class Duck {
	FlyBehavior flyBehavior = null;
	QuackBehavior quakBehavior = null;
	public Duck() {
		System.out.println("default constructor call");
	}
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quakBehavior.quack();
	}
	public void swimming() {
		System.out.println("모든 오리는 물에 뜬다.");
	}

}
