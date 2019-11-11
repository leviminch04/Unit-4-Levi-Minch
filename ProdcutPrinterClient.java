public class ProdcutPrinterClient {
    public static void main(String[] args) {
        Product product1 = new Prodcut("prodcut2", 10);
        Product product2 = new Product("product2", 5);
        System.out.println(product1.toString());
        product1.reducePrice(15);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        product2.reducePrice(15);
        System.out.println(product2.toString());
    }
}
