package design.duck;

/**
 * @author OSH
 * 단독으로는 인스턴스화를 할 수 없다.
 * 반드시 구현체 클래스가 잇어야 함.
 * 메소드 오버라이딩을 꼭 해야함.
 * 만일 하지 않으면 너도 인터페이스가 되어야 함.
 *
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		
		System.out.println("WithWing.fly() call");
		// TODO Auto-generated method stub

	}

}
