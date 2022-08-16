package ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.model;

import java.util.Collections;

public class Product implements Comparable<Product> {
    private int id;
    private String nameProduct;
    private float price;

    public Product() {
    }

    public Product(int id, String nameProduct, float price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.getPrice()-product.getPrice());
    }

}
