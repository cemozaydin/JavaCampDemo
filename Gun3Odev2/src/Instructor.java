public class Instructor extends User{
   private double rating;

    public Instructor() {
    }

    public Instructor(double rating) {
        this.rating = rating;
    }

    public Instructor(int id, String firstName, String lastName, String email, String password, String courseName, double rating) {
        super(id, firstName, lastName, email, password, courseName);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
