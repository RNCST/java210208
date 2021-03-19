package design.duck;

public class RubberDuck extends Duck{
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quakBehavior = new SQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
