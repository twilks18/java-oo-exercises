

import java.util.Arrays;

public class Course {
	private String Name;
	private int Credits;
	private int Remain_seat;
	private Student[] Roster;
	
	
	public Course(String Name, int Credit, int Remain_seat){
		this.Name = Name;
		this.Remain_seat= Remain_seat;
		this.Roster = new Student[Remain_seat];
		this.Credits = 0;
	}
	
	public String getName(){
		
		return this.Name;
		
	}
	
	
//	public void setRemaingSeats(int remain){
//		this.Remain_seat = remain;
//	}
	
	public int getRemainingSeats(){
		return this.Remain_seat;
	}
	
	public void setCredits( int credits){
		this.Credits = credits;
	}
	
	public int getCredits(){
		return this.Credits;
	}
	
	public boolean addStudent(Student student){
		// Is student enrolled in Course?
		for (int i = 0; i < this.Roster.length; i++) 
			if (this.Roster[i] != null){
			if (this.Roster[i].getName().equals(student.getName())){
				System.out.println(this.Roster[i].getName());
				System.out.println(student.getName());
				return false;
				
			}						
		}
		// add student if there are seats remaining
		if (this.Remain_seat > 0){			
			int avail_seat = this.Roster.length -this.Remain_seat;
			this.Roster[avail_seat] = student;
			this.Remain_seat --;
			return true;
			
			}
		return false;
	}
	
//	public String generateRoster(){
//		int avail_seat = this.Roster.length -this.Remain_seat;
//		this.Roster = this.Roster[avail_seat];
//		return Arrays.toString(Roster);
//		
//	}
	public double averageGPA(){
		double all_stud_gpa = 0;
		int num_students=0;
		for (int i = 0; i < this.Roster.length; i++){	 
			  if(this.Roster[i] != null){
				all_stud_gpa += this.Roster[i].getGPA() ;
				num_students++;	     
	     
			 }
		
		}
		double ave_gpa = all_stud_gpa/num_students;
		return ave_gpa;
	}
			 		 
	public String generateRoster(){
		String student_roster = " ";
		for(int i=0; i < this.Roster.length; i++){
			if (this.Roster[i] != null){
				student_roster += this.Roster[i].getName();
			}
		}
		return student_roster;
	}
	public String toString(){
		return"Course Number: " + this.Name + "Credits: " + this.Credits;
	}
	
	
	public static void main(String[] args){
		Student a = new Student("a ","b ",3);
		Student b = new Student("c ","d ", 4);
		Student c = new Student("e ","f ",5);
		Student[] Roster = new Student[3];
		Roster[0] =  a;
		Roster[1]= b;
		Roster[2]=c;
		System.out.println(Roster[0].getName());
		System.out.println(Roster[1].getName());
		System.out.println(a.getName());
		String var_a =Roster[0].getName(); 
		String var_b = a.getName();
		System.out.println(var_a == var_b);
		System.out.println(var_a.equals(var_b));
		System.out.println(Roster.length);
		System.out.println(Arrays.toString(Roster));
	}
	
	}

		
		
		
				
	
	
	


