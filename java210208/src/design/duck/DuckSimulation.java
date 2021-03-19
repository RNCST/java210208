package design.duck;

public class DuckSimulation {

	public static void main(String[] args) {
		Duck myDuck = new WoodDuck();
		myDuck.display();
		myDuck.performFly();
		myDuck.performQuack();
		Duck herDuck = new RubberDuck();
		herDuck.display();
		herDuck.performFly();
		herDuck.performQuack();
		Duck hisDuck = new MallardDuck();
		hisDuck.display();
		hisDuck.performFly();
		hisDuck.performQuack();
		
		
	}

}
