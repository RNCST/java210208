package design.duck;

public class MallardDuck extends Duck{
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quakBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
