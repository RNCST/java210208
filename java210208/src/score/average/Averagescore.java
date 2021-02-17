package score.average;

public class Averagescore {
	
	double tot;
	double avg;

	public static void main(String[] args) {
		Score a = new Score();
		Totalscore b = new Totalscore(); 
		Averagescore c = new Averagescore();
		b.kor = a.kor;
		b.eng = a.eng;
		b.math = a.math;
		b.methodtot();
		c.tot = b.tot;
		c.methodavg();
	}

	void methodavg() {
		System.out.println("세 학생의 성적의 합은 "+tot);
		avg = tot / 3;
		Math.nextDown(avg);
		System.out.println("세 학생이 성적의 평균은 "+avg);;
	}
}


//1-4 인스턴스화를 하는 위치에 따른 차이에 대한 코드로 생각 및 실습을 해볼것.