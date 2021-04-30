public class UserManager {

    public void add(User user){

    }

    public void delete(User user){

    }

    public void update(User user){

    }

    public void list(User... users){
        for(User user:users){
            System.out.println("Kullanıcı Adı Soyadı : " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Ders Adı : " + user.getCourseName());
            System.out.println();
        }

    }
}
