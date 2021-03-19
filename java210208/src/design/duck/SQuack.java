package design.duck;

public class SQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("====SQuack==== calll");
	}

}
