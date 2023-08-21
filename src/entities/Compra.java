package entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Integer order;
	private Double value;
	
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
		products.add(product);
	}
	
	public Double totalCompra() { 
		for(Product product: products) {
			value += product.getPrice();
		}
		return value;
	}
	
	
}
