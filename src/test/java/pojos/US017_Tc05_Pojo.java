package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US017_Tc05_Pojo {
    /*
    "createdBy": "team06",
            "createdDate": "2022-12-11T12:55:44.997217Z",
            "id": 395186,
            "name": "Yusuf",
            "description": "fgfdg",
            "price": 200.00,
            "defaultValMin": "500",
            "defaultValMax": "2000"
                 */

    private String createdBy;
    private int id;
    private String name;
    private String description;
    private double price;
    private String defaultValMin;
    private String defaultValMax;

    public US017_Tc05_Pojo(String createdBy, int id, String name, String description, double price, String defaultValMin, String defaultValMax) {
        this.createdBy = createdBy;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public US017_Tc05_Pojo() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "US017_Tc05_Pojo{" +
                "createdBy='" + createdBy + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }
}



