import java.util.ArrayList;

public class Customer {

	String name;
	int age;
	String phone;
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	ArrayList<Product> buyProducts = new ArrayList<>();
	
	int buyCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public ArrayList<Product> getBuyProducts(){
		return buyProducts;
	}
	
	public void setBuyProducts(ArrayList<Product> buyProducts) {
		this.buyProducts= buyProducts;
	}
	
	
}
