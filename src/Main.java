import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		int sid=0;
		String fn=null;
		Date birthday=null;
		double avgmrk=0.0;
		
		System.out.println("Enter the number of records you want to enter:");
		Scanner s=new Scanner(System.in);
		int num_rec=s.nextInt();
		
		StudentGroup sg=new StudentGroup(num_rec);
		
		for(int i=0;i<=num_rec;i++)
		{
			System.out.println("Enter the student ID");
			sid=s.nextInt();
			
			System.out.println("Enter the student's Full Name (Eg: David Beckham)");
			fn=s.nextLine();
			
			System.out.println("Enter the student Date Of Birth in yyyy-mm-dd format");
			String next = s.next("[0-9]{4}.[0-9]{2}.[0-9]{2}");
			try {
				birthday = new SimpleDateFormat("yyyy.MM.dd").parse(next);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			System.out.println("Enter the student's Average Marks");
			avgmrk=s.nextFloat();
			
			Student st=new Student(sid,fn,birthday,avgmrk);
		}
	
		
	}

}
