package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project2 {
	
	public static File myFIle;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		myFIle = new File("/Users/yeaseenarafat/Y_E_@_S_E_EN/JAVA/Project2/src/project2/input.txt");
	    Scanner sc = new Scanner(myFIle);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	  
		

	}

}
