import java.util.Calendar;
import java.util.Objects;

public class Person {

    private String ID;
    private String firstName = "";
    private String lastName = "";
    private String title = "";
    private int YOB;

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getFormalName(){
        return this.getTitle() + " " + this.getFullName();
    }

    //NOT FINISHED!
    public int getAge(){
        int age = 2025 - YOB;
        return age;

    }

    public int getAgeForYear(int year){
        int age = year - YOB;
        return age;
    }
    //End of unfinished code

    public String toCSV(){
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(ID, person.ID) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, title, YOB);
    }
}
