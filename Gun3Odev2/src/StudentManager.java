public class StudentManager extends UserManager{

    private  BaseLogger _logger;

    public StudentManager(BaseLogger logger) {
        this._logger = logger;
    }

    @Override
    public void add(User student) {
        System.out.println("Öğrenci eklendi : " + student.getFirstName() + " " + student.getLastName());
        _logger.log();
    }

    @Override
    public void delete(User student) {
        System.out.println("Öğrenci silindi : " + student.getFirstName() + " " + student.getLastName());
        _logger.log();
    }

    @Override
    public void update(User student) {
        System.out.println("Öğrenci güncellendi : " + student.getFirstName() + " " + student.getLastName());
        _logger.log();
    }

    @Override
    public void list(User... users) {
        for(User user:users){
            System.out.println("Öğrenci Adı Soyadı : " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Aldığı Ders Adı : " + user.getCourseName());
            System.out.println();
        }
    }
}
