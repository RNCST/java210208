package book.ch14;

public class ExException extends Exception{
	private int port = 7000;
	public ExException() {}
	public ExException(String msg) {
		super(msg); // super = Exception
	}
	public ExException(String msg, int port) {
		super(msg);
//		super(port); 부모 클래스에는 생성자 파라미터에 두번째 자리에 int인 생성자가 없다.
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

}
