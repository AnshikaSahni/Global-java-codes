/* Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.


*/


package anshi;

public class Box {
	Double width;
	Double height;
	Double length;
	 Box(Double W,Double H,Double L)
	 {
		 height=H;
		 width=W;
		 length=L;
	 }
	
	public void Volume()
	 {
		 System.out.println(height*width* length); 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Box b= new Box(1.0,4.1,5.6);
         b.Volume();
	}

}
