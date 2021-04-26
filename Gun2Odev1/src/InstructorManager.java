import java.util.List;

public class InstructorManager {

    void InstructorAdd(Instructor instructor){
        System.out.println(instructor.instructorName + " adlı eğitmen eklenmiştir.");
    }

//    void InstructorDelete(Instructor instructor){
//        System.out.println(instructor.instructorName + " adlı eğitmen silinmiştir.");
//    }

    void GetAll(List<Instructor> instructors){
        instructors.forEach(instructor-> System.out.println(instructor.instructorName));
    }
}
