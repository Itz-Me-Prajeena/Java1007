package aggregationEx;

public class CircleArea {
	double pi=3.14;
	//SqrOperation obj;
	//SqrOperation obj = new SqrOperation();
	public double area(int radious)
	{
		SqrOperation obj = new SqrOperation();
		//obj=new SqrOperation();
		int rsqr=obj.sqrFn(radious);
		double area=pi*rsqr;
		return area;
	}

	public static void main(String[] args) {
		
		CircleArea ca=new CircleArea();
		System.out.println("Area of circle = "+ca.area(10));
			

	}

}
