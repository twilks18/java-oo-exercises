package blogz;
import java.util.ArrayList;

import java.util.regex.Pattern;

public class User {
	private String uName;
	private String hashpWord;
	private String pWord;
	private static ArrayList<User> users;
	
	
	public User(String uName, String pWord){
		if (isValidUsername(uName) == false){
			throw new IllegalArgumentException("Username invalid");
		}
		this.uName = uName;
		this.pWord = pWord;	
		
	}
	public String getusername(){
		return this.uName;
	}
	public String getpassword(){
		return this.pWord;
	}
	private static String hashpassword(String password){
		return password;
	}
	public boolean isValidPassword(){
		return (this.pWord.equals(hashpassword(this.pWord)));
	}
	public static boolean isValidUsername(String username) {
		boolean b = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}",username);
		return  b;				
	}
	public ArrayList<User> getList(){
		return users;
	}
	
	
	}
