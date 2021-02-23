package book.ch5;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class EmpList {
	
	/**  ctr alt j
	 * @param empno - 사원번호
	 * @return String[] - 사원이름, 부서명
	 */
	public String[] getEmpDetail(int empno) {
		String[] info = new String[2];
		
		EmpVO eVO = new EmpVO();
		eVO.setDeptno(7566);           // getDeptno = 7566;
		int deptno = eVO.getDeptno();  // deptno = getDeptno = 7566;
									   //
		String ename = eVO.getEname(); //7566 사원에 대한 부서번호
		info[0] = ename;			   //info 1번째 배열은 사원이름.
		
		
		DeptVO dVO = new DeptVO();
		dVO.setDeptno(deptno);			//getDeptno = 17line의 deptno = 7566; 
		String dname = dVO.getDname();  //
		info[1] = dname;			    //info 2번째 배열은 부서이름.
		return info;
		
	}  
	   // Q.사원번호를 넣었을때  사원의 이름과 부서의 이름이 나오도록.
	   // 1.  emp 테이블에서 사원번호를 넣었을때 부서의 번호가 출력되도록
       //  1-1. ename = eVO.getEname(사원번호) --> ename = 사원번호;
	   //  1-2. eVO.getDeptno(사원번호) --> eVO.setDeptno = Deptno;
	   //  1-3. info[0] = ename;      --> 배열의 첫번째 값은 사원이름
	
	   // 2.  1번에서 출력된 값을 보관
	   //  2-1 deptno = eVO.getDeptno()
	
	   // 3.  2번에서 보관한 값을 dept테이블 내에 넣었을때 해당하는 부서병이 출력되도록.
	   //  3-1. dVO.getDname(deptno) --> dVO.setDname = dname;
	   //  3-2. info[1] = dname;     --> 배열의 두번째 값은 부서이름.
	
	public static void main(String[] args) {
		EmpVO vo = new EmpVO();
		EmpList EL = new EmpList();
		System.out.println(EL.getEmpDetail(0));

	}
}
