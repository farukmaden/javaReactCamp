package kampOdevHafta3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentId = 1;
		student.firstName = "faruk";
		student.lastName = "maden";
		student.email = "faruk@gmail.com";
		student.password = "1234";
		student.studentCourse = "java";

		Instructor instructor = new Instructor();
		instructor.instructorId = 1;
		instructor.firstName = "engin";
		instructor.lastName = "demiroğ";
		instructor.email = "engin@gmail.com";
		instructor.password = "1234";
		instructor.instructorCourse = "C#";

		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		userManager.delete(student);
		userManager.delete(instructor);
		
		System.out.println("-------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(student);
		studentManager.deleteCourse(student);
		
		System.out.println("-------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
	}

}
