package design.duck;

public class WoodDuck extends Duck{
	public WoodDuck() {
		flyBehavior = new FlyNoWay();
		quakBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("===WoodDuck Display() call===");
		
	}

}
