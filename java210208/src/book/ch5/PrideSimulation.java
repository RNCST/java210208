package book.ch5;

public class PrideSimulation {

	public static void main(String[] args) {
	   Pride  myCar = null;
	   Pride hisCar = null;
	   Pride herCar = null;
//			  myCar = new Pride();
			 myCar  = new Pride(3,4);
			 myCar.speed     = 3;
			 myCar.wheelNum  = 4;
			 System.out.print(myCar.speed);
			 hisCar = new Pride(4,6);
			 hisCar.speed    = 4;
			 hisCar.wheelNum = 6;
			 System.out.print(hisCar.speed);
			 herCar = new Pride(5,8);
//			 Pride.speed     = 5;
			 Pride.wheelNum  = 8;
			 System.out.println(herCar.speed);
			 
			 System.out.print(myCar.wheelNum);
     		 System.out.print(hisCar.wheelNum);
		     System.out.print(herCar.wheelNum);
		     System.out.print(Pride.wheelNum);
		     System.out.println();
		     System.out.println("============================");
		     
		     System.out.print(myCar.speed+" ");
		     myCar.speedup();
		     System.out.print(myCar.speed+" ");
		     myCar.speedu(3);
		     System.out.print(myCar.speed+" ");
		     myCar.speedd(3);
		     System.out.print(myCar.speed+" ");
			 Pride.change();
	}

}
