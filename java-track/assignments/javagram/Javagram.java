package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		String imagePath = "path not set";
	
		
		// prompt user for image to filter and validate input
		do {
			
			
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
//				String[] relPathParts = relPath.split(File.separator);
//				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
			Filter filter = null;
		
		do{
			System.out.println("Select a Filter (1,2,3 or 4)");
			System.out.println("1. BlueFilter");
			System.out.println("2. RedFilter");
			System.out.println("3. GreenFilter");
			System.out.println("4. InvertedFilter");
			int selectFilter = in.nextInt();
			try {
				filter = getFilter(selectFilter);				
			}catch (IllegalArgumentException e){
				System.out.println("Invalid selection");
			 
			}
		}while(filter == null);
  
	
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		String fileName = "";
		String absFileName;
		
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		do{
			System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
			fileName = in.next();
			absFileName = dir + File.separator + fileName;
			
			if (absFileName.equals(imagePath)){
			
				System.out.println("Would you like to overwrite the original file? (type 'yes' or 'no')");
				String confirm = in.next();
				if (!confirm.equals("yes")){
					fileName = "";
				}
			}
			
		}while (fileName == "");	
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	
	private static Filter getFilter(int selectFilter) {		
		
		
		// TODO - create some more filters, and add logic to return the appropriate one
				
		 if (selectFilter == 1) {
			return new BlueFilter();
		
		}else if (selectFilter == 2){
			return new RedFilter();
		
		}else if (selectFilter == 3){
			return new GreenFilter();
		
		}else if (selectFilter == 4){
			return new InvertedFilter();
			
		 }else 
			throw new IllegalArgumentException();
		 }
		
	
		
}
