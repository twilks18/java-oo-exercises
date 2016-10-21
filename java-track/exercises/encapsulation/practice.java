package encapsulation;

import java.util.Arrays;

public class practice {
		public static void main(String[] args){
			Student a = new Student("a","b",3);
			Student b = new Student("c","d", 4);
			Student c = new Student("e","f",5);
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
			System.out.println(Roster.length);}
			public static String toString(Student[] Roster){
				return Arrays.toString(Roster);
				}
		
		}
		
		
		
		
		
		}
	}




