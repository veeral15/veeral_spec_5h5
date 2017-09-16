import java.util.Calendar;
import java.util.Date;
import java.lang.IllegalArgumentException;

import org.apache.commons.lang3.ArrayUtils;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {
	
	private static final Exception IllegalArgumentException = null;
	private Student[] students;
	private Student student;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	//@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	//@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		if(students==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			this.students=students;
		}
	}

	//@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	//@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else 
		{
			students[index]=student;
		}
	}

	//@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			int n=students.length;
			for(int i=1;i<=n;i++)
			{
				students[n-(i-1)]=students[n-i];
			}
			students[0]=student;
		}
	}

	//@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			int n=students.length;
			students[n+1]=student;
		}
	}

	//@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else 
		{
			int n=students.length;
			for(int i=1;i<=(n-index);i++)
			{
				students[n-(i-1)]=students[n-i];
			}
			students[index]=student;
		}
	}

	//@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			students=(Student[]) ArrayUtils.remove(students, index);
		}
	}

	//@Override
	public void remove(Student student) {
		// Add your implementation here
		int n=students.length;
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(students[i]==student)
			{
				count=1;
				students=(Student[]) ArrayUtils.remove(students, i);
			}
		}
		if(count==0)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\nStudent data doesn't exist");
		}
	}

	//@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			int n=students.length;
			for(int i=(index+1);i<=n;i++)
			{
				students=(Student[]) ArrayUtils.remove(students, i);
			}
		}
	}


	//@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int n=students.length;
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(students[i]==student)
			{
				count=1;
				students=(Student[]) ArrayUtils.remove(students, i+1);
			}
		}
		if(count==0)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\nStudent data doesn't exist");
		}
	}

	//@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			for(int i=(index-1);i>=0;i--)
			{
				students=(Student[]) ArrayUtils.remove(students, i);
			}
		}
	}

	//@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int n=students.length;
		int count=0;
		for(int i=n;i>=0;i--)
		{
			if(students[i]==student)
			{
				count=1;
				students=(Student[]) ArrayUtils.remove(students, i-1);
			}
		}
		if(count==0)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\nStudent data doesn't exist");
		}
	}

	//@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=students.length;  
        Student temp;  
         for(int i=0;i<n;i++){  
        	 for(int j=1;j<(n-i);j++){  
        		 if(students[j-1].compareTo(students[j])>0) {
        			 //swap elements  
        			 temp = students[j-1];  
        			 students[j-1] = students[j];  
        			 students[j] = temp;  
        			 }     
        		 } 
        	 }
	}

	//@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int length=0;
		Date[] date1=new Date[length];
		for(int i=0;i<=length;i++)
		{
			if(student.getBirthDate().before(date))
			{
				length++;
				date1[i]=student.getBirthDate();
			}
			else
			{
				length++;
			}
			return students;
		}
		return null;
	}

	//@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		int length=0;
		Date[] date1=new Date[length];
		if(firstDate==null && lastDate==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			for(int i=0;i<=length;i++)
			if(student.getBirthDate().after(firstDate) && student.getBirthDate().after(lastDate))
			{
				length++;
				date1[i]=student.getBirthDate();
				return students;
			}
			else
			{
			length++;
			}
		}
		return null;
	}

	//@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		return null;
	}

	//@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(student.getId()==indexOfStudent)
		{
		Calendar today = Calendar.getInstance();
	    Calendar birthDate = Calendar.getInstance();
	    birthDate.setTime(student.getBirthDate());
	    if (birthDate.after(today)) {
	        throw new IllegalArgumentException("You don't exist yet");
	    }
	    int presentYear = today.get(Calendar.YEAR);
	    int birthDateYear = birthDate.get(Calendar.YEAR);
	    int presentDayOfYear = today.get(Calendar.DAY_OF_YEAR);
	    int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
	    int presentMonth = today.get(Calendar.MONTH);
	    int birthDateMonth = birthDate.get(Calendar.MONTH);
	    int presentDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
	    int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
	    int age = presentYear - birthDateYear;

	    // If birth date is greater than todays date then decrement age by one year
	    if ((birthDateDayOfYear - presentDayOfYear > 3) || (birthDateMonth > presentMonth)){
	        age--;
	    }
	    /* If birth date and today's date are of same month and birth day of month is greater
	        than todays day of month then decrement age */
	    else if ((birthDateMonth == presentMonth) && (birthDateDayOfMonth > presentDayOfMonth)){
	        age--;
	    }
	    return age;
		}
		return 0;
	}

	//@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here

		return null;
	}

	//@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max[]={};
		int j=0;
		for(int i=0;i<students.length;i++)
		{
			max[j]=0;
			if(student.getAvgMark()>=max[j])
			{
				max[0]=student.getAvgMark();
				if(student.getAvgMark()==max[j])
				{
					j++;
					max[j]=student.getAvgMark();
				}
				else if(max[j]<max[0])
				{
					max[j]=max[0];
				}
			}
		}
		return null;
	}

	//@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
		{
			try {
				throw IllegalArgumentException;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int d=student.getId()+1;
		return students[d];
	}
}
