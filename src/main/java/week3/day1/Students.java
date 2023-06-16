package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("printing id "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("printing id "+id+"   "+name);
	}
	public void getStudentInfo(String email,String phonenumber)
	{
		System.out.println("print email");
		System.out.println("phone number");
	}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Students st=new Students();
    
    st.getStudentInfo(100);
    st.getStudentInfo(19," srinika");
    st.getStudentInfo("jyo@gmail.com","sss1234");
	}

}
