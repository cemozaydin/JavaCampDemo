public class InstructorManager extends  UserManager{

    private  BaseLogger _logger;

    public InstructorManager(BaseLogger logger) {
        this._logger=logger;
    }

    @Override
    public void add(User instructor) {
        System.out.println("Eğitmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
       _logger.log();
    }

    @Override
    public void delete(User instructor) {
        System.out.println("Eğitmen silindi : " + instructor.getFirstName() + " " + instructor.getLastName());
        _logger.log();
    }

    @Override
    public void update(User instructor) {
        System.out.println("Eğitmen güncellendi : " + instructor.getFirstName() + " " + instructor.getLastName());
        _logger.log();
    }

    @Override
    public void list(User... users) {
        for(User user:users){
            System.out.println("Eğitmen Adı Soyadı : " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Verdiği Ders Adı : " + user.getCourseName());
            System.out.println();
        }
    }
}
