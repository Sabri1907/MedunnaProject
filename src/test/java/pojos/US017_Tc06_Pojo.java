package pojos;

public class US017_Tc06_Pojo {

    private String name;
    private String description;
    private Double price;
    private Integer defaultValMin;
    private Integer defaultValMax;

    public US017_Tc06_Pojo(String name, String description, Double price, Integer defaultValMin, Integer defaultValMax) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public US017_Tc06_Pojo() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(Integer defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public Integer getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(Integer defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "US017_Tc06_Pojo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin=" + defaultValMin +
                ", defaultValMax=" + defaultValMax +
                '}';
    }
}
