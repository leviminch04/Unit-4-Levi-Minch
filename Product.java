public class Product {
    private String productName = "";
    private double productPrice = 0;
    public Product(String name, double price){
        productName = name;
        productPrice = price;

    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void reducePrice(int r){
        productPrice -= productPrice * (r / 100);
    }
}
