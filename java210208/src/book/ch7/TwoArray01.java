package book.ch7;

public class TwoArray01 {
	void init() {
		int is[][] = {{1,2},{3,4},{5,6},{7,8}};
		int x = 0;
		while(x<is.length) {
			int y = 0;
			while(y<is[x].length) {
				System.out.println("is["+x+"]["+y+"]="+is[x][y]);
				y++;
			}
			x++;
		}System.out.println("=============================");
	}

	public static void main(String[] args) {
		TwoArray01 A = new TwoArray01();
		A.init();
		
		//2는 로우를 말함 3은 컬럼을 말함.
		int is[][] = new int[2][3]; // 2차배열이다. 
		for(int i= 0;i<is.length;i++) { // 2번진행
			for(int j=0;j<is[i].length;j++) {	 // 3번 진행
				System.out.println("is["+i+"]["+j+"]="+is[i][j]);
				
				
			}///end in for
		}///end out for
	}

}
