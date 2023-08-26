package testes;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Client;
import entities.Compra;
import entities.Product;

public class CompraTest {
	
	@Test
	public void testCompra() {	
		// Creating product's list
		List<Product> list = new ArrayList<>();
		Client client = new Client(3, "Chris Molthes", "chris@gmail.com");
		// Creating products
		Product product = new Product("Acer Nitro", 5800.50, 3);
		// Creating compra and adding product
		Compra compra = new Compra(1, client, list);
		compra.addProduct(product);
	     
	     Assertions.assertEquals(2, product.getQuantity());
	     Assertions.assertEquals(5800.50, compra.totalOrder());
	}
}
