package oopDemo;

public class Main {

	public static void main(String[] args) {
		Student student1 =new Student(1, "Semih", "Gençten", 0.32);
		System.out.println(student1.coursePercentage);
		
		Course course1=new Course(1, "Java", "21 Nisan", "Engin Demiroğ");
		System.out.println(course1.instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.AddToCourse();
		studentManager.EndContinue();
	}

}
