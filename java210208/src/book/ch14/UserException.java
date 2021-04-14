package book.ch14;

public class UserException {
	public void test(String[] Array) throws ExException{
		System.out.println("===run test(String[])");
		if(Array.length < 1 ) {
			throw new ExException("Array is empty");
		}else
			throw new ExException("Array is empty",7000);
	}
	public static void main(String[] args) {

		UserException ue = new UserException();
		try {			
			ue.test(args);
		} catch (ExException ee) {
			ee.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("finally- 무조건 실행됨.");
		}
	}
}
