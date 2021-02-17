package book.ch4;

public class WhileTest {

	public static void main(String[] args) {
		//파라미터 자리에 true나 false 같은 상수를 사용하지 않기
		while(true) { // while문은 항상 무한루프 방지 코드를 작성할 것.
			break;
		}
		boolean isStop = false;
		while(!isStop) { // 권장되는 사용법
			
		}
		while(true) { // 권장되지 않는 사용법
			break;
		}
		int i = 5;
		
		
		
	} // end of main  Method

} // end of WhileTest class
