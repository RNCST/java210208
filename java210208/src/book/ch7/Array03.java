package book.ch7;

public class Array03 {

	public static void main(String[] args) {
		EmpVO eVOS[] = new EmpVO[3];
		
		EmpVO eVO = new EmpVO();
		eVO.setEmpno(0001); eVO.setEname(" AAAA "); eVO.setSal(1.11);
		eVOS[0] = eVO;
		
		eVO = new EmpVO(); // 새로운 주소번지 부여
		eVO.setEmpno(0002); eVO.setEname(" BBBB "); eVO.setSal(2.22);
		eVOS[1] = eVO;
		
		eVO = new EmpVO(); // 새로운 주소번지 부여
		eVO.setEmpno(0003); eVO.setEname(" CCCC "); eVO.setSal(3.33);
		eVOS[2] = eVO;
				
		System.out.println(eVO);
		System.out.println("");
		for(EmpVO eVO2:eVOS) {  /// 
			System.out.println(eVO2);
			System.out.println(eVO2.getEmpno()+eVO2.getEname()+eVO2.getSal());
			System.out.println("");
		}
	}

}
