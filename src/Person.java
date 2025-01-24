import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Objects;

public class Person {

    private String ID;
    private String firstName = "";
    private String lastName = "";
    private String title = "";
    private int YOB;

    /**
     * Get the person's ID
     * @return a String response that represents the ID of the current person
     */
    public String getID() {
        return ID;
    }

    /**
     * Get the person's first name
     * @return a String response that represents the first name of the current person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the person's last name
     * @return a String response that represents the last name of the current person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get the person's title
     * @return a String response that represents the title of the current person
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the person's year of birth
     * @return an int response that represents the year of birth of the current person
     */
    public int getYOB() {
        return YOB;
    }

    /**
     * Sets the person's first name
     * @param firstName string representing the person's first name
     * @return none
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the person's last name
     * @param lastName string representing the person's last name
     * @return none
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the person's title
     * @param title string representing the person's title
     * @return none
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the person's year of birth
     * @param YOB integer representing the person's year of birth
     * @return none
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //Person constructor
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    /**
     * Get the person's full name (firstName + lastName)
     * @return a String response that represents the full name of the current person
     */
    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * Get the person's full name with title (fullName + title)
     * @return a String response that represents the full name of the current person
     */
    public String getFormalName(){
        return this.getTitle() + " " + this.getFullName();
    }

    /**
     * Get the person's current age
     * @return an int response that represents the age of the current person
     */
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - YOB;
    }

    /**
     * Get the person's current age based on a given year
     * @return an int response that represents the age of the current person
     */
    public int getAge(int year) {
        return year - YOB;
    }

    /**
     * Converts data to CSV format
     * @return a String response that represents all the data of a given person in CSV format
     */
    public String toCSV(){
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * Converts data to XML format
     * @return a String response that represents all the data of a given person in XML format
     */
    public String toXML() {
        return "<XML><ID>" + ID + "</ID><firstName>" + firstName + "</firstName><lastName>" + lastName + "</lastName><title>" + title + "</title><YOB>" + YOB + "</YOB></XML>";
    }

    /**
     * Converts data to JSON format
     * @return a String response that represents all the data of a given person in JSON format
     */
    public String toJSON(){
        return "{\"XML\":{\"ID\":\"" + ID + "\",\"firstName\":\"" + firstName + "\",\"lastName\": \"" + lastName + "\",\"title\": \"" + title + "\",\"YOB\": \"" + YOB  + "\"}}";
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
