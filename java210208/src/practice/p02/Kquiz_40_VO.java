package practice.p02;

//Value Object, DTO(Data Transer Object)

//Question 40 : private 멤버필드 접근방법(set,get의 형식)
//A JavaBeans component has the following field:
//11. private boolean enabled;  //boolean형 멤버필드
//Which two pairs of method declarations follow the JavaBeans standard for accessing this field? (Choose two.) 
//
//A. public void setEnabled( boolean enabled)        oo
//public boolean getEnabled()
//B. public void setEnabled( boolean enabled)
//public void isEnabled()
//C. public void setEnabled( boolean enabled)        oo
//public boolean isEnabled()
//D. public boolean setEnabled( boolean enabled)
//public boolean getEnabled()
//
public class Kquiz_40_VO {

	public class VO {
		private String mem_id = null; // 아이디 담기
		private String mem_pw = null; // 비번 담기
		private boolean gender = false; // 성별 담기

		/*
		 * 생성자는 반환타입이 없다. 클래스이름과 동일해야 하다. 전역 변수의 초기화를 담당한다. static블럭에서 하는 일을 맡겨도 괜찮다. 만일
		 * 소켓통신을 통해서 서버사이드와 클라이트 사이트를 구현(구축)
		 * 
		 * 메소드 오버로딩
		 * 전제조건  - 모두 같은 이름이다. 다른이름이라멶 ㅐ당 무
		 * 접근제한자가 있고 없고 영향 없다.
		 * 리턴타입이 있고없고 영향 없다. - 생성자는 해당 없음.
		 * 예외를 던지고 그렇지 않고는 영향이 없다.
		 * void go() throws Exception, SQLException{}
		 */

		public VO() {} // 디폴트 생성자

		public VO(String mem_id){//파라미터가 있는 생성자
			this.mem_id = mem_id;
		}

		public VO(String mem_id, String mem_pw){//파라미터가 있는 생성자
			this.mem_id = mem_id;
			this.mem_pw = mem_pw;
		}

		public VO(String mem_id, String mem_pw, boolean gender){//파라미터가 있는 생성자
			this.mem_id = mem_id;
			this.mem_pw = mem_pw;
			this.gender = gender;
		}
//==========================================================================================
		public String getMem_id() {
			return mem_id;
		}

		public void setMem_id(String mem_id) {
			this.mem_id = mem_id;
		}

		public String getMem_pw() {
			return mem_pw;
		}

		public void setMem_pw(String mem_pw) {
			this.mem_pw = mem_pw;
		}

		public boolean isGender() { // booleabn은 get이 아닌 is가 기본인데 get써도됨
			return gender;
		}

		public void setGender(boolean gender) {
			this.gender = gender;
		}

	}
}
