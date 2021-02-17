package score.average;

public class Totalscore {
	
	double tot;
	double kor;
	double eng;
	double math;
	public static void main(String[] args) {
		Score a = new Score();
		Totalscore b = new Totalscore();
		Averagescore c = new Averagescore();
		b.kor = a.kor;
		b.eng = a.eng;
		b.math = a.math;
		b.methodtot();
		c.tot = b.tot;

	}
	double methodtot() {
		tot=kor+math+eng;
		System.out.println(tot);
		Score a = new Score();
		Totalscore b = new Totalscore();
		Averagescore c = new Averagescore();
		b.kor = a.kor;
		b.eng = a.eng;
		b.math = a.math;
		return b.kor+b.eng+b.math+b.tot;
	}

}
