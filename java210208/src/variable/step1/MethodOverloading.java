package variable.step1;

import com.vo.DeptVO;

public class MethodOverloading {
	/*************************
	 * 
	 * 
	 * @param pdvo  =조건절에서 사용될 상수값을 담음. = where 들어갈 조건 값으로 사용됨.
	 * @return pdvo = 오라클에서 조회된 결과를 담음. = 화면 출력용으로 사용
	 */
	DeptVO go(DeptVO pdvo) {
		System.out.println(pdvo.getDeptno()+","+pdvo.getDname()+","+pdvo.getLoc());
		DeptVO rdvo = null;
		rdvo = new DeptVO();
		return rdvo;
	}
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.go();
		mol.go(10);  // 10 ==> 파라미터
		mol.go("Smith");//참조형 타입이니까 참조에 의한 호출이다. -String만 예외이다, 호출할때 주소번지가 아닌 값이 출력되기떄문에
		System.out.println(mol);
		
		DeptVO pdvo = new DeptVO();
		pdvo.setDeptno(50);
		pdvo.setDname("개발1팀");
		pdvo.setLoc("제주도");
		mol.go(pdvo);//주소번지를 넘겼다. 참조에 의한 호출이다. <==> 값에 의한 호출.
	}
	//
	void go() {
		System.out.println(1);
	}
	void go(int i) {
		System.out.println(2+i);
	}
	void go (String name) {
		System.out.println(3);
	}
	// 메소드 오버로딩  ==> 메소드이름은 같은데 서로 다른 메소드로 인지한다.
	// 자바스크립트에서는 지원되지 않는다. 
	

}

//
//
//1부터 N까지의 정수 합계를 구하는 프로그램을 작성하시오.
//
//출력)정수(n>0):100
//     합계(1~n):5050출력 정답

