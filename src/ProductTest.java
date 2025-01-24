import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void getID() {
        Assertions.assertEquals("000001", new Product("000001","Cookies","Freshly clicked",20.0).getID());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Cookies", new Product("000001","Cookies","Freshly clicked",20.0).getName());
    }

    @Test
    void getDescription() {
        Assertions.assertEquals("Freshly clicked", new Product("000001","Cookies","Freshly clicked",20.0).getDescription());
    }

    @Test
    void getCost() {
        Assertions.assertEquals(20.0, new Product("000001","Cookies","Freshly clicked",20.0).getCost());
    }

    @Test
    void toCSV() {
        Assertions.assertEquals("000001, Cookies, Freshly clicked, 20.0", new Product("000001","Cookies","Freshly clicked",20.0).toCSV());
    }

    @Test
    void toXML(){
        Assertions.assertEquals("<XML><ID>000001</ID><name>Cookies</name><description>Freshly clicked</description><cost>20.0</cost></XML>", new Product("000001","Cookies","Freshly clicked",20.0).toXML());
    }

    @Test
    void toJSON(){
        Assertions.assertEquals("{\"XML\":{\"ID\":\"000001\",\"name\":\"Cookies\",\"description\": \"Freshly clicked\",\"cost\": \"20.0\"}}", new Product("000001","Cookies","Freshly clicked",20.0).toJSON());
    }
}