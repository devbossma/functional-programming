package ma.devboss.functionalInterfaces.streams;



public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private Boolean inStock;
    protected static Long counter = 0L;

    public Product(String name, String category, Double price, Boolean inStock) {
        this.id = ++counter;
        this.name = name;
        this.category = category;
        this.price = price;
        this.inStock = inStock;
    }

    public Long getId() {return this.id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }

   /*
    @Override
    public int compareTo(@NotNull Object o) {
        return this.getPrice().intValue();
    }*/
}
