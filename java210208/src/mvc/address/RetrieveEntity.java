package mvc.address;

import java.util.List;
import java.util.Map;

public class RetrieveEntity {
//오버로딩에 리턴타입은 영향이 없다.
	/**
	 * 상세조회 구현
	 * @param vo - getID();
	 * @return AddressVO ( or Map)
	 *  SELECT 컬럼명1, 컬럼명2, ....
	 *    FROM 
	 *   WHERE ID = ? 
	 */
	public AddressVO select(AddressVO vo) { // 무조건 1개 로우만 가능함.
		System.out.println("RetrieveEntity select(vo) 호출 성공");
		return null;
	}
	
	public Map<String,Object> selectMap(AddressVO vo) { // 무조건 1개 로우만 가능함.
		System.out.println("RetrieveEntity select(vo) 호출 성공");
		return null;
	}

	public AddressVO[] select() { // n개 로우 가능함.
		System.out.println("RetrieveEntity select() 호출 성공");
		return null;
	}

	public List<AddressVO> selectList(AddressVO vo) { // n개 로우 가능함.
		System.out.println("RetrieveEntity selectList(vo) 호출 성공");
		return null;
	}
}
