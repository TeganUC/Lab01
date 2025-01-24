import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getID() {
        Assertions.assertEquals("000001", new Person("000001","Tegan","Rohne","Ms.",2005).getID());
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("Tegan", new Person("1","Tegan","Rohne","Ms.",2005).getFirstName());
    }

    @Test
    void getLastName() {
        Assertions.assertEquals("Rohne", new Person("1","Tegan","Rohne","Ms.",2005).getLastName());
    }

    @Test
    void getTitle() {
        Assertions.assertEquals("Ms.", new Person("1","Tegan","Rohne","Ms.",2005).getTitle());
    }

    @Test
    void getYOB() {
        Assertions.assertEquals(2005, new Person("1","Tegan","Rohne","Ms.",2005).getYOB());
    }

    @Test
    void getFormalName() {
        Assertions.assertEquals("Ms. Tegan Rohne", new Person("1","Tegan","Rohne","Ms.",2005).getFormalName());
    }

    @Test
    void getAge() {
        Assertions.assertEquals(20, new Person("1","Tegan","Rohne","Ms.",2005).getAge());
    }

    @Test
    void getAgeAgain() {
        Assertions.assertEquals(45, new Person("1","Tegan","Rohne","Ms.",2005).getAge(2050));
    }

    @Test
    void toCSV() {
        Assertions.assertEquals("1, Tegan, Rohne, Ms., 2005", new Person("1","Tegan","Rohne","Ms.",2005).toCSV());
    }

    @Test
    void toXML(){
        Assertions.assertEquals("<XML><ID>1</ID><firstName>Tegan</firstName><lastName>Rohne</lastName><title>Ms.</title><YOB>2005</YOB></XML>", new Person("1","Tegan","Rohne","Ms.",2005).toXML());
    }

    @Test
    void toJSON(){
        Assertions.assertEquals("{\"XML\":{\"ID\":\"1\",\"firstName\":\"Tegan\",\"lastName\": \"Rohne\",\"title\": \"Ms.\",\"YOB\": \"2005\"}}", new Person("1","Tegan","Rohne","Ms.",2005).toJSON());
    }
}