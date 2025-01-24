import java.util.Calendar;
import java.util.Objects;

public class Product {

    private String ID;
    private String name = "";
    private String description = "";
    private double cost;

    /**
     * Get the product's ID
     * @return a String response that represents the ID of the current product
     */
    public String getID() {
        return ID;
    }

    /**
     * Get the product's name
     * @return a String response that represents the name of the current product
     */
    public String getName() {
        return name;
    }

    /**
     * Get the product's description
     * @return a String response that represents the description of the current product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the product's price
     * @return a double response that represents the cost of the current product
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the product's name
     * @param name string representing the product's name
     * @return none
     */
    public void setFirstName(String firstName) {
        this.name = name;
    }

    /**
     * Sets the product's description
     * @param title string representing the product's description
     * @return none
     */
    public void setDescription(String title) {
        this.description = description;
    }

    /**
     * Sets the product's cost
     * @param cost double representing the product's monetary value
     * @return none
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    //Product constructor
    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /**
     * Converts data to CSV format
     * @return a String response that represents all the data of a given person in CSV format
     */
    public String toCSV(){
        return ID + ", " + name + ", " + description + ", " + cost;
    }

    /**
     * Converts data to XML format
     * @return a String response that represents all the data of a given person in XML format
     */
    public String toXML() {
        return "<XML><ID>" + ID + "</ID><name>" + name + "</name><description>" + description + "</description><cost>" + cost + "</cost></XML>";
    }

    /**
     * Converts data to JSON format
     * @return a String response that represents all the data of a given person in JSON format
     */
    public String toJSON(){
        return "{\"XML\":{\"ID\":\"" + ID + "\",\"name\":\"" + name + "\",\"description\": \"" + description + "\",\"cost\": \"" + cost  + "\"}}";
    }

}
