package kampOdevHafta2;

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(1, "Java+React Kamp", "Engin Demiroğ");
		Courses courses2 = new Courses(2, "C#+Angular Kamp", "Engin Demiroğ");
		Courses courses3 = new Courses(3, "Programlamaya Giris Temel Kurs", "Engin Demiroğ");

		Courses[] course = { courses1, courses2, courses3 };

		for (Courses courses : course) {
			System.out.println(courses.courseName);
		}

		System.out.println("-------*-------");

		CourseManager courseManager = new CourseManager();
		courseManager.courseAdd(courses1);
		courseManager.courseDelete(courses2);


	}

}
