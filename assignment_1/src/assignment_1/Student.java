package assignment_1;

public class Student {
int age;
int roll_no;
public void display1()
{
System.out.println("Welcome to all of you");	
}
public void display2()
{
System.out.println("Automation is easy");
}
public static void main(String[] args) {
	Student so = new Student();
	so.display1();
	so.display2();
	so.age=20;
	so.roll_no=13;
	System.out.println("Student age is:" +so.age);
	System.out.println("Student roll no is:" +so.roll_no);
	System.out.println("Student roll no is:" +so.roll_no);
			
}

}
