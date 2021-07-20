package theory;

import javax.swing.*;
import java.io.*;

public class FileCreation extends JFrame {

	static String filePath, parentDirectory;
	static File randomDir, randomFile, randomFile2;

	
	
	public static void main(String[] args) {
		//define a path
		randomDir = new File("/Users/greta/eclipse-workspace/Java Theory/Random");
		//make a directory
		randomDir.mkdir(); 
		
		//make a file
		randomFile = new File("random.txt"); 
		
		//directory making and file can be combined  in one statement too
		randomFile2 = new File("/Users/derekbanas/Documents/workspace3/Java Code/Random/random2.txt");
		//potential of IO exception needs to be handled
		try {
			//create a file
			randomFile.createNewFile();
			
			//get a path 
			filePath = randomFile.getCanonicalPath(); 
		} catch(IOException e) {
			e.printStackTrace(); 
		}
		
		if (randomFile.exists()){
			System.out.println("File is readable: " + randomFile.canRead());
			System.out.println("File is writable: " + randomFile.canWrite());
			System.out.println("File location: " + filePath);
			System.out.println("File name: " + randomFile.getName());

			//will be null if the directory has not been defined
			System.out.println("Parent directory: " + randomFile.getParent());

			//put all file in the array
			 String[] filesInDir = randomDir.list();
			 
			 for(String file : filesInDir) {
				 System.out.println(file);
			 }
			 
			 System.out.println("Is this a file: " + randomFile.isFile());
			 System.out.println("Is this hidden: " + randomFile.isHidden());
			 System.out.println("Last modified: " + randomFile.lastModified());
			 
			 //deletion of the file
			 if(randomFile.delete()){
				 System.out.println("File Deleted");
			 }
			 
			 //get files as objects and delete it
			 File[] fileObjInDir = randomDir.listFiles();

			 for(File fileName : fileObjInDir){
				 fileName.delete(); 
			 }
			 
			 //open file chooser
			 new FileCreation();


		}
	}
	
	public FileCreation (){
		//specifies the location
		JFileChooser fileChooser = new JFileChooser(randomDir); 
		
		//opens the file chooser
		fileChooser.showOpenDialog(this);
		
	}
}
