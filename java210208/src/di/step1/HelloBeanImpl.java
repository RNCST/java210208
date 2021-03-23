package di.step1;

public class HelloBeanImpl implements HelloBean {
	private String msg = null;
	//setter 객체 주입법.(자바코드 적용)
	//생성자 객체 주입법(xml코드)
	
//	아래 코드는 객체 생성 관리를 내가 해야함.
//	String name = new String("SCOTT");
	
	//setter메소드로 사용하는 것은 객체 생성및 관리를 스프링에서 대신 해줌.
	public void setMsg(String msg) {
		this.msg = msg;
	}
//	msg = new String("Hello");
	@Override
	public String getGreeting(String msg) {
		return "Spring"+this.msg;
	}
	//Bean이 초기화 된 후 호출되는 메소드
	public void initMethod() {
		System.out.println("initMethod call");
	}
	//Bean이 소멸되기 전에 호출되는 메소드
	public void destroyMethod() {
		System.out.println("destroyMethod call");
	}
}
