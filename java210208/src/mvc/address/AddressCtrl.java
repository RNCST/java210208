package mvc.address;
import java.util.List;

public class AddressCtrl {

	private AddressVO returnVO = new AddressVO();
	//아래와 비교되는 값들은 모두 AddressBook에서 받아오거나 또는 ModifyDialog에서 받아와야 한다.
	//ModifyDialog에서는 입력, 수정만 처리한다.
	//입력은 INSERT INTO addrDB(COLUM,N....) VALUES(? ? ? ? ?...)
	//UPDATE addrDB SET address='서울시 마포구 공덕동',....WHERE ano=5;
	//삭제는 AddressBook의 JTable에서 직접 처리한다. Delete from addrDB WHERE ano=5;
	//comman = delete;
	//ano = 5;
	
	private AddressVO inVO = new AddressVO();

	private static String _DEL = "delete";
	private static String _INS = "insert";
	private static String _MOD = "update";
	private static String _SEL = "select";
	private static String _ALL = "selectall";

	public AddressCtrl(AddressVO vo) {
		this.inVO = vo;
	}

	public AddressCtrl() {
		// TODO Auto-generated constructor stub
	}

	public AddressVO send(AddressVO vo) throws Exception {
		String command = inVO.getCommand();
		if(_DEL.equals(command)) {
			DeleteEntity del = new DeleteEntity();
			returnVO = del.delete(vo);
		}else if(_INS.equals(command)) {
			RegisterEntity reg = new RegisterEntity();
			returnVO = reg.insert(vo);
		}else if(_MOD.equals(command)) {
			ModifyEntity mod = new ModifyEntity();
			returnVO = mod.update(vo);
		}else if(_SEL.equals(command)) {
			RetrieveEntity retr = new RetrieveEntity();
			returnVO = retr.select(vo);
		}
		return returnVO;
	}

	public AddressVO[] send() throws Exception {
		AddressVO[] returnVOs = null;
		System.out.println("send() 호출 성공 - 반환타입이 AddressVO[]");
		return returnVOs;
	}
	public List<AddressVO> sendAll() throws Exception {
		List<AddressVO> selectAll = null;
		System.out.println("send() 호출 성공 - 반환타입이 List<AddressVO>");
		return selectAll;
	}	
}
	