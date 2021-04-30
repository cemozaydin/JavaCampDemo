public class Main {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(
                1,
                "Engin",
                "Demiroğ",
                "engin.demirog@mail.com",
                "12345",
                "C# ve Angular",
                4.9);

        Instructor instructor2 = new Instructor(
                2,
                "Murat",
                "Kurtboğan",
                "murat.kurtbogan@mail.com",
                "12345",
                "SQL Server",
                4.8);

        InstructorManager instructorManager = new InstructorManager(new DatabaseLogger());
        // Eğitmen Ekleme
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        // Eğitmen Listeleme
        Instructor[] instructors = {instructor1,instructor2};
        instructorManager.list(instructors);

        // Eğitmen Güncelleme-Silme
        instructorManager.update(instructor1);
        instructorManager.delete(instructor2);

        System.out.println("-----------------------------------------");

        Student student1 = new Student(1,"Cem","Özaydın","cemozaydin@mail.com","12345","C#","234334");
        Student student2 = new Student(2,"Canan","Yolcu","cananyolcu@mail.com","12345","SQL","434333");

        StudentManager studentManager = new StudentManager(new FileLogger());
        // Öğrenci Ekleme
        studentManager.add(student1);
        studentManager.add(student2);
        // Öğrenci Listeleme
        System.out.println("--- Öğrenci Listesi ----");
        Student[] students = {student1,student2};
        studentManager.list(students);



    }
}
