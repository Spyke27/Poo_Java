package testes;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import entities.Client;
import entities.Compra;
import entities.Product;

public class CompraTest {
	
	@BeforeAll
	public static void createCompra() {
		
	}

	@Test
	public void testCompra() {	
		// Creating product's list
		List<Product> list = new ArrayList<>();
		Client chris = new Client(3, "Chris Molthes", "chris@gmail.com");
		// Creating products
		Product notebook = new Product("Acer Nitro", 5800.50, 3);
		// Creating compra and adding product
		Compra compra1 = new Compra(1, chris, list);
		compra1.addProduct(notebook);
		// Get Quantity products left in stock
	     
	     Assertions.assertEquals(2, notebook.getQuantity());
	     Assertions.assertEquals(5800.50, compra1.totalOrder());
	}
}
