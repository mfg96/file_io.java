package lab9;
import java.io.*;
import java.util.*;
import java.lang.*;

public class file_io{
	
	public static void main(String args[]) {
	
	String fName,lName,DOB;
	int x,y;
	Scanner sc=new Scanner(System.in);
	
	try {
		File fd=new File("Database.txt");
	
	if(!fd.exists()) {
		
			fd.createNewFile();}
		
	PrintWriter pw=new PrintWriter(fd);
	System.out.printf("Please enter 1 to continue or 0 to exit: ");
	x=sc.nextInt();
	
	while(x!=0) {
		sc.nextLine();
	System.out.printf("Please enter First Name: \n");
	fName=sc.nextLine();
	System.out.printf("Please enter Last Name: \n");
	lName=sc.nextLine();
	System.out.printf("Please enter Date of Birth(mm/dd/yyyy): \n");
	DOB=sc.nextLine();
	pw.println(fName+","+lName+","+DOB);
	System.out.println("Saved to Database file!");
	System.out.printf("Please enter 1 to continue or 0 to exit: ");
	x=sc.nextInt();
	
	}//while loop ends
	pw.close();
	
	}//try block ends
	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//catch closes here
	
	BufferedReader br=null;
	
	System.out.println("Please enter 1 to read file or 0 to exit:");
	y=sc.nextInt();
	
	if(y==0) {
		System.out.println("Bye!");
		System.exit(0);
	}
	
	try {
		
		br=new BufferedReader(new FileReader("Database.txt"));
		ArrayList<String> line =new ArrayList<String>();
		int i=0;
		
		while((line.add(br.readLine())) && (line.get(i) != null)) {
			i++;
		}
		
		//String arr[]=new String[125];
		//arr=line.get(0).split(",");
		//System.out.println("array:"+arr[0]);
		//Collections.sort(line);
		//Collections.sort(line.spliterator());
		
		for(String ln: line) {
			if(ln != null)
				System.out.println(ln);
		}
		
	} 
	catch (IOException e) {
		
		e.printStackTrace();
	}//catch closes here
	
	
	//sc.close();
	}
}
