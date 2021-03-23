package book.ch8;

public class RectAngle extends Shape {
	int width = 10;
	int height = 4;

	@Override
	void fillDraw() {
		
	}
	
	@Override
	void area() {
		double area = 0.0;
		area        = width*height;
		System.out.println("사각형의 면적은 "+area);
	}

}
