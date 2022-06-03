package draw;

class Triangle extends Shape{
	
	Point[]p = new Point[3]; // 3개의 인스턴스배열 생성
	Triangle(Point[] p) {
		this.p = p;
	}
	void draw () {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
	
}
