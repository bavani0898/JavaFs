package Newpack;

public class student {
	 

	 String name;
	 int rollnumber;
	 double marks;

	// Parameterized Constructor
	 
	  student(String n,int roll,double mar){
		 name=n;
		 rollnumber=roll;
		 marks = mar;
		 System.out.println("Name: "+name);
		 System.out.println("Rollnumber: "+rollnumber);
		 System.out.println("Marks: "+marks);
	 }
	

public static void main(String[] args) {
	student obj = new student("Bavani",108,78);

}


}
