package kampOdevHafta3;

public class InstructorManager {
	public void add (Instructor instructor) {
		System.out.println(instructor.instructorCourse + ":kursu sisteme eklendi");
	}
	
	public void delete (Instructor instructor) {
		System.out.println(instructor.instructorCourse + ":kursu sistemden silindi");
	}

}
