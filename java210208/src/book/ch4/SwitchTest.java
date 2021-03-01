package book.ch4;

public class SwitchTest {

	public static void main(String[] args) {
		int protocol = 100;// 로그인
		protocol = 200;// 입장하기
		protocol = 300;// 다자간 대화
		protocol = 301;// 귓속말
		
		String id = "tomato";
		String input = "오늘 스터디할까";
		String msg = protocol + "#" + id + "#" + input;
		//제어문의 역할은 업무 순서에 대한 흐름을 바꾼다.
		//순서에 대한 정보를 바탕으로 의사를 결정할 수 있는 것은 팀장, 차장, 부장 선택자
		//선택(비즈니스로직계층-model계층)에 따라
		//break <-> continue
		//break; 훨씬더 많이 써왔다.
		//for문 while문,..... 무한루프를 방지하기위해서.
		//if문   break대신에 return; . 메소드를 탈출한다.
		//switch문에서의 break는 switch문을 탈출한다.
		switch (protocol) {// 원시형 타입 + string 타입
		case 0:
			// 실행문
			System.out.println("0입니다.");
			break;
		case 300:
			// 실행문
			System.out.println("10입니다.");
			break;
		case 301:
			// 실행문
			System.out.println("301입니다.");
			break;
		default: // 케이스가 모두 없을경우.
			System.out.println("break가 없으면 여기까지. default 입니다");
			break;
		} // end of switch
		System.out.println("여기");
	}

}
