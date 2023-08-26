package entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Integer order;
	
	Client client;;
	List<Product> products = new ArrayList<>();
	
	public Compra(Integer order, Client client, List<Product> products) {
		this.order = order;
		this.client = client;
		this.products = products;
	}

	public Integer getOrder() {
		return order;
	}

	public Client getClient() {
		return client;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		if(product.getQuantity() >= 1) {
			products.add(product);
			product.setQuantity(product.getQuantity()-1);
		} else {
			System.out.println(product.getName() + " Unavailable!");
		}
	}
	
	public Double totalOrder() { 
		Double value = 0.0;
		for(Product product: products) {
			value += product.getPrice();
		}
		return value;
	}
	
	
	public void listProducts() {
		System.out.println("----------------------------------");
		if(!products.isEmpty()) {
			System.out.println("Products:");
			for(Product product: products) {
				System.out.println(product.getName() + ": R$" + product.getPrice());
			}
		} else {
			System.out.println("No products added!");
		}
		System.out.printf("\nTotal order: R$%.2f", totalOrder());
	}

	@Override
	public String toString() {
		return "Order: " + order + "\nClient: " + client.getName();
	}
}
