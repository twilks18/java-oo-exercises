

public class Student {
	//Fields:
	//First name
	//Last name
	//credits
	//gpa
	
	private String FirstName;
	private String LastName;
	private int StudentID;
	private int Credits;
	private double GPA;
	
	
	public Student(String FirstName, String LastName, int StudentID){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0.0;
		}
	
	
	public String getName(){
		return FirstName + " " + LastName;
	}
	
	public int getStudentID(){
		
		return this.StudentID;	
		
	}
	
	public int setCredits(int credits){
		this.Credits = credits; 
		return this.Credits;
		
	}		
	
		
	public int getCredits(){
		
		return this.Credits;
	}
	
	public double setGPA(double gpa){
		this.GPA = gpa;
		return this.GPA; 
	}
		
	public double getGPA(){
		
		return this.GPA;
	}
	
	
	
	public String getClassStanding(){
		if (this.Credits < 30){
			return "Freshman";			
		}
		
		else if (this.Credits< 60){
			return "Sophomore";
			}
		else if (this.Credits < 90){
			return "Junior";
		}
		
		else
			return "Senior";

	}
	
	public void submitGrade(double grade, int c_credits){
		
	
		double quality_score;
		quality_score = this.GPA * this.Credits;
		double new_course_score = grade * c_credits;
		quality_score += new_course_score;
		this.Credits += c_credits;
		this.GPA = quality_score/ this.Credits;
		this.GPA = Math.round(this.GPA *1000.0)/1000.0;
		
				
	}
	
	public double computeTuition(){
		
		
		
		int semester = (this.Credits/15) * 20000;
		double remaining_credits = (this.Credits % 15) * 1333.33;
		double tuition = semester + remaining_credits;
		return tuition;
				

	}
	
	public Student createLegacy(Student One, Student Two){
	   
		String babyName = One.getName();
		String babyLast = Two.getName();		
		int babyID = One.getStudentID() + Two.getStudentID();
		double babyGPA = (One.getGPA() + Two.getGPA())/2;
		int babyCredits = Math.max(One.getCredits(),Two.getCredits());
		Student baby = new Student(babyName, babyLast, babyID);
		baby.setGPA(babyGPA);	
		baby.setCredits(babyCredits);
		return baby;
		
		
	}
	
	
	
	public String toString(){
		return"First Name: " + this.FirstName + "Last Name: " + this.LastName + "Student ID: " + this.StudentID;
	}
	
}
	

	
	
	
	
	
	



