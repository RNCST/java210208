package variable.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginView extends Object implements ActionListener {
	//인터페이스이다. 결합도를 낮추는 코드를 작성할떄 필요함, 클래스 설계시 필요
	JFrame jf = new JFrame();
	JButton jbtn_login = new JButton("로그인");
	
	public void initDisplay() {
		//내 자신이 이벤트 처리를 담당하는 핸들러 클래스이다라는 의미로 this를 사용한다.
		jbtn_login.addActionListener(this);//이벤트 소스와 이벤트 처리를 담당하는 클래스 연결, 매칭
		jf.add("North",jbtn_login);
		jf.setSize(500, 400);
		jf.setVisible(true); // false 시 비활성화 (== 아예 안켜지는것이 아닌 비활성화)
		//데이터의 연속성 --> 꺼져있을때도 데이터가 기억되어야함 (--> 오라클에 저장해야함)
		
	}
	//내안에 있는 메소드 이지만 static 영역 안에서 non-static을 접근할 수 없으므로 인스턴스화를 
	//통해서 해결할 수 있다.
	public static void main(String[] args) {
		LoginView view = new LoginView();
		
//		System.out.println(view.toString());
		view.initDisplay();
	}
	//@~~~~ = 어노테이션 -- 같은 이름으 메소드를 여러개 정의할 수 있다. 뒷바침하는 개념이 메소드 오버로딩과 오버라이딩이다.
	//오버라이딩(메소드이름이 같고 서로 상속관계일떄)
	@Override // 부모의 메소드를 재정의하는 것이다.
			  // 겉은 똑같지만 내용물은 똑같아질 수 없다.
	public void actionPerformed(ActionEvent e) {
		if(jbtn_login==e.getSource()) {
			//이벤트 감지는 컴퓨터가하고 버튼의 주번은 내가 정의함.
			System.out.println("이순신 님 환영합니다.");
	}

}

}