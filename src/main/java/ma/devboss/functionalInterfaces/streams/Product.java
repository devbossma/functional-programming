package ma.devboss.functionalInterfaces.streams;

import org.jetbrains.annotations.NotNull;

public class Product implements  Comparable{
    private String name;
    private String category;
    private Double price;
    private Boolean inStock;

    public Product(String name, String category, Double price, Boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.inStock = inStock;
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
        return "\nProduct{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                "}\n"
;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return this.getPrice().intValue();
    }
}
