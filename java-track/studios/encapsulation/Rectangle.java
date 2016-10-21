package encapsulation;

public class Rectangle {
	//Fields:
	
	private int width;
	private int length;
	
	
	//width - int
	//length - int
	
	
	//Behaviors:
	//create a rectangle
	
	public Rectangle(int width,int length)
	{
		this.width = width;
		this.length = length;
				
	}
	
	public int getArea(){
		return this.width * this.length;
	}
	public int getPerimeter(){
		return 2 * (this.width + this.length);
	}
	public boolean compareSize(int otherrec){
		return (this.getArea()== otherrec);
	}
	public boolean isASquare(){
		return (this.width == this.length);
	}
	}
	
	
	


