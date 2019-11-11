public class ProductPrinter {
    private String name = "";
    private int price = 0;
    public Product(String newName, int newPrice)
    {
        name = newName;
        price = newPrice;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void reducePrice(int percentReduce)
    {
        price = price - (percentReduce * price);
    }

    public String toString()
    {
        String result = "";
        result += "Name: " + name + "\n";
        result += "Price: " + price +"\n";
        return result;
    }
}
