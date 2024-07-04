import java.util.ArrayList;

public class Customer {

	String name;
	int age;
	String phone;
	
//	ArrayList<Product> products = new ArrayList<>();
	
	ArrayList<Product> buyProducts = new ArrayList<>();
	
	static int buyPrice;
	
	
	
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
	
	
//	public ArrayList<Product> getProducts(){
//		return products;
//	}
//	public void setProducts(ArrayList<Product> products) {
//		this.products = products;
//	}
	
	
	public ArrayList<Product> getBuyProducts() {
		return buyProducts;
	}
	public void setBuyProducts(ArrayList<Product> buyProducts) {
		this.buyProducts = buyProducts;
	}
	
	
}
