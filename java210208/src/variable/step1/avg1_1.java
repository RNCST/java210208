package variable.step1;

public class avg1_1 {
	double kor = 0;
	double math = 0;
	double eng = 0;

	/*******************************************************
	 * 
	 * @param kor2  - 국어점수
	 * @param math2 - 수학점수
	 * @param eng2  - 영어점수
	 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수의 값을 반환한다.
	 ***************************************************/
	private double hap(double kor2, double math2, double eng2) {
		double tot = 0;
		tot = kor + math + eng;
		System.out.println(tot);
		// insert here

		return tot;
	}

	/*****************************************
	 * 
	 * @param tot hap메소드를 호출하여 tot를 받아온다.
	 * @return
	 *****************************************/
	private double avg(double tot) {
		System.out.println("합은 " + tot);
		double avg = 0;
		avg = tot / 3;
		System.out.println("평균은 " + avg);
		return 0;
	}


	public static void main(String[] args) {
		avg1_1 ac = new avg1_1();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		double tot = ac.hap(ac.kor, ac.math, ac.eng);
		double test_avg2 = ac.avg(tot, 3);
	}
	/***************************************
	 * 
	 * @param tot - 총 합을 계산한 값
	 * @param subjectNumber - 과목수
	 * @return
	 */
	private double avg(double tot, int subjectNumber) {
	System.out.println(tot);
	System.out.println(subjectNumber);
	double imsi = tot/subjectNumber;
		return imsi;	
	}
		// 위에서 계산한 총점을 avg메소드의 파라미터로 넘기려면 반드시
		// 리턴타입이 필요함.
//	double test_avg = ac.avg(tot);

	}


