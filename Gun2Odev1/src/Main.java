import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ========== Course Operations ========== //
		Course course1 = new Course(
				1,
				"Yazılım Geliştirici Yetiştirme Kampı",
				"Engin Demiroğ",
				" (C# + ANGULAR)"
		);
		Course course2 = new Course(
				2,
				"Yazılım Geliştirici Yetiştirme Kampı",
				"Engin Demiroğ",
				"(JAVA + REACT)"
		);
		Course course3 = new Course(
				3,
				"Programlamaya Giriş için Temel Kurs",
				"Engin Demiroğ",
				"(Python)"
		);

		CourseManager courseManager = new CourseManager();
		System.out.println();
		System.out.println("----- Eklenen Kurslar (CourseManager.CourseAdd Metodu ) -----");
		courseManager.CourseAdd(course1);
		courseManager.CourseAdd(course2);
		courseManager.CourseAdd(course3);

		System.out.println();
		System.out.println("----- Kurs Listesi (CourseManager.CourseList Metodu ) -----");
		Course[] courses = {course1,course2,course3};
		courseManager.CourseList(courses);

		System.out.println();
		System.out.println("----- Silinen Kurs/Kurslar (CourseManager.CourseDelete Metodu )------");
		courseManager.CourseDelete(course3);

		// ========== Instructor Operations ========== //
		ArrayList<Instructor> instructors = new ArrayList<Instructor>(Arrays.asList(
				new Instructor(1,"Engin Demiroğ"),
				new Instructor(2,"Cem Özaydın")
		));

		Instructor instructor1 = new Instructor(3,"Altan Yanbakan");
		instructors.add(instructor1);

		System.out.println();
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("----- Eğitmenler Listesi ------");
		instructorManager.GetAll(instructors);

		// ========== Category Operations ========== //
		Category category1 = new Category(1,"Tümü");
		Category category2 = new Category(2,"Programlama(3)");

		System.out.println();
		CategoryManager categoryManager = new CategoryManager();
		System.out.println("----- Kategori Listesi ------");
		categoryManager.CategoryAdd(category1);
		categoryManager.CategoryAdd(category2);

	}
}
