package score.average;

public class Averagescore {
	double tot;
	double avg;
	double kor;
	double eng;
	double math;
	public static void main(String[] args) {
		Score a = new Score();
		Totalscore b = new Totalscore(); 
		Averagescore c = new Averagescore();
		
	
		c.methodavg();
	}
	
	void methodavg() {
		System.out.println(tot);
		avg= tot/3;
		System.out.println(avg);
	}
}
