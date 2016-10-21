package encapsulation;

public class Robot {
	
	//Fields:
	
	private String name;
	private int xposition;
	private int yposition;
	private int speed;
	private int orientation;
	//Name (String)
	//Position(int)
	//Speed(int)
	//Orientation(int)
	
	
	//Behaviors:
	
	//Create a Robot
	
	public Robot( String name, int xposition, int yposition, int speed, int orientation)
	{
		this.name = name;
		this.xposition = xposition;
		this.yposition= yposition;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getXPosition()
	{
		return this.xposition;
	}
	
	public int getYPosition()
	{
		return this.yposition;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getOrientation()
	{
		return this.orientation;
	}
	// can move
	
	public void canMove(int speed )
	{
		this.xposition = this.xposition + speed;				
		this.yposition = this.yposition + speed;
				
	}
	
	
	//rotate
	
	public void rotate(int r){
		
		
		
		if(r==90 || r == -270)
			System.out.println("robot is facing north");
		
		else if (r==-90||r==270)
			System.out.println("robot is facing south");
		else if (r==0)
			System.out.println("robot is facing east");
		else if (r==180|| r==-180)
			System.out.println("robot is facing west");
			
	
		
	}
	//determine how for away it is from another robot
	  
	public void distOthr(Robot fred){
		double xDifference = this.xposition - fred.xposition;
		double yDifference = this.yposition - fred.yposition;
		System.out.println("The robot is ") + this.xposition (" and ") this.yposition( " units away");

	}
	//can return a string ( Get the name,position,orientation,speed)
	public String toString(){
		return "Name: " + this.name + " Position x: " + this.xposition + "Position y: " + this.yposition + " Orientation: " + this.orientation + "Speed :" + this.speed;
	}
	public static void main(String args[]){
		Robot myRobot = new Robot("Robert",0,0,2,0);
		System.out.println(myRobot.getSpeed());
		myRobot.rotate(270);
		myRobot.distOthr(4, 8);
	}
}
