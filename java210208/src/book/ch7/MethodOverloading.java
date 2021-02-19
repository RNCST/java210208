package book.ch7;

import com.vo.DeptVO;

public class MethodOverloading {
//메소드 오버로딩의 전제조건 ==> 메소드 이름이 같을때. 
	void go() {	}
//	public void go() {	}         // 접근제한자는 영 향없다.
	public void go(int[] a) {}    // 메소드 오버로딩. 파라미터의 갯수가 달라짐
//	public void go(int[] b) {}    // 변수의 이름은 영향이없다.
	public void go(int a) {}      //  
	public void go(DeptVO dvo) {} // 다른 패키지의 메소드를 가져오는데 임포트가 필요하다.
//	public int  go() { return 0;} // 리턴타입이 있고없고는 영향을 끼치지않는다.
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
