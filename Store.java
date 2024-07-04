import java.util.ArrayList;

public class Store {

	String name;
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	ArrayList<Product> products = new ArrayList<>();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public ArrayList<Customer>  getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	
	void pay(Customer customer, Product product) {
		customer.getBuyProducts().add(product);
		customer.buyPrice += product.price;
		product.totalPrice += product.price; 
	}
	
}
