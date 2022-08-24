package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private  String companyProduct;
    private double priceProduct;

    public Product()  {
    }

    public Product(String codeProduct, String nameProduct, String companyProduct, double priceProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.companyProduct = companyProduct;
        this.priceProduct = priceProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompanyProduct() {
        return companyProduct;
    }

    public void setCompanyProduct(String companyProduct) {
        this.companyProduct = companyProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", companyProduct='" + companyProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
