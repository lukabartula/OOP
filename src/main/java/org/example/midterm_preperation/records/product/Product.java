package org.example.midterm_preperation.records.product;

import java.util.Arrays;
import java.util.List;

/*Create a record named Product with the following
attributes:productId (int), productName (String), price (double).
Then, create a class named ProductManager with a method named filterProductsByPrice,
which accepts a list of products and a maximum price, and returns a new list containing
only the products with a price less than or equal to the specified maximum.
 */


record Product(int product_id, String productName, double price) {}

class ProductManager{

    public List<Product> products;

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public List<Product> filterProductsByPrice ( double maxPrice){
        return products.stream()
                .filter(product -> product.price()<=maxPrice)
                .toList();
    }
}

class Main{
    public static void main(String[] args) {
        ProductManager p = new ProductManager(
                Arrays.asList(
                new Product(1, "Detergent", 4.5),
                new Product(2, "Bread", 1.2),
                new Product(3, "Kila lazanja u crvenoj jabuci", 14.0)
        ));

        System.out.println(p.filterProductsByPrice( 4.7));
    }
}
