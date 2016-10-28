abstract class shape{
	double length,wide;
	double pi=3.1415926;
	String name;
	public void print(){
		double area=length*wide;
		System.out.println("the square area is "+area);
	}
}
class area extends shape{
	  int buttom,tall;
	  public void print(int  buttom,int tall){
	  double area=1/2*buttom*tall;
	  System.out.println("the tringle area is "+area);
	  }
	  int side;
	  public void print(int side){
	  double area=side*side;
	  	System.out.println("the square area is "+area);
	  }
	  double r;
	  double pi=3.1415;
	  public void print(double r){
	  double area=pi*r*r;
	  	System.out.println("the circle area is "+area);
	  }
}
	
public class Test{
	public static void main(String args[]){
          area triangle=new area();
          area circle=new area();
          area square=new area();
          triangle.print(12,3);
          circle.print(2);
          square.print(5.0);
	}		
}
