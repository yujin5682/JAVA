import java.util.ArrayList;
import java.util.HashMap;

public class Store {

	String name;
	
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<Product> products = new ArrayList<>();
	
	//오늘 팔린 물건들
	HashMap<String, ArrayList<Product>> dayToSoldProductList = new HashMap<>();
	//오늘 팔린 총 금액
	HashMap<String,Integer> dayToTotal = new HashMap<>();
	
	int storeCount = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Customer> getCustomers() {
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
	
	public void pay(Customer customer, Product product) {
		customer.getBuyProducts().add(product);
		customer.buyCount += product.price;
		product.totalPrice += product.price;
		this.storeCount += product.price;
	}
	
	
	
}
