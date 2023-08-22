package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.Client;
import entities.Compra;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();        
        int orderId = random.nextInt(100); 
        
        Client anna = new Client(1, "Anna Richester", "anna@gmail.com");
        Client bob = new Client(2, "Bob Brown", "bob@gmail.com");
        Client chris = new Client(3, "Chris Molthes", "chris@gmail.com");
        
        Product tv = new Product("TV Samsung", 1876.99, 5);
        Product notebook = new Product("Acer Nitro", 5800.50, 3);
        Product iphone = new Product("Iphone 12 Pro Max", 8204.70, 20);
        Product mouse = new Product("Logitech M275", 57.80, 10);
        Product fridge = new Product("Eletrolux Master", 2390.98, 2);
        
        List<Product> list = new ArrayList<>();
        
        Compra compra1 = new Compra(orderId, chris, list);
        compra1.addProduct(fridge);
        compra1.addProduct(iphone);
        compra1.addProduct(tv);
        compra1.addProduct(notebook);
        compra1.addProduct(mouse);

        
        System.out.println(compra1);
        compra1.listProducts();
	}

}
