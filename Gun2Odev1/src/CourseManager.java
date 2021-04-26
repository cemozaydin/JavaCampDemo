
public class CourseManager {
	
	void CourseAdd(Course course) {
		System.out.println("* " + course.courseName + " " + course.detail + " adlı kurs eklenmiştir.");
	}
	
	void CourseDelete(Course course) {
		System.out.println(course.id + " nolu " + course.courseName + " " + course.detail + " isimli kurs silinmiştir");
	}
	
	void CourseList(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Kurs Adı  :  "  + course.courseName + " " + course.detail);
		}
		
	}

}
