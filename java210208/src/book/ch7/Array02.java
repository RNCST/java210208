package book.ch7;

public class Array02 {
	int x = 3;
	String names = null;
	String enames[] = {"SMITH","KING","WORD"};
	public static void main(String[] args) {
		Array02 a2 = new Array02();
		boolean isOk[] = new boolean[a2.x];
		for (boolean bo : isOk) { // 전체조회 이해를 할것.
			System.out.println(bo);
		}
		a2.enames = new String[a2.x];
	}

}
