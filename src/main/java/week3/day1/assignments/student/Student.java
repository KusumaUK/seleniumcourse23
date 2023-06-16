package week3.day1.assignments.student;
import org.department.*;
public class Student extends Department{
	public void studentName()
	{
		System.out.println("srinika");
	}
	public void studentDept()
	{
		System.out.println("civils");
	}
	public void studentId()
	{
		System.out.println("civils28");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
