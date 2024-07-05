import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Product> products = new ArrayList<Product>();

		// 진짜 매장 만들기
		Store store1 = new Store();
		store1.name = "매장1";

		Customer customer1 = new Customer();
		customer1.name = "고객1";
		customer1.age = 10;
		customer1.phone = "010-1111-1111";
		customers.add(customer1);

		Customer customer2 = new Customer();
		customer2.name = "고객2";
		customer2.age = 20;
		customer2.phone = "010-2222-2222";
		customers.add(customer2);

		Customer customer3 = new Customer();
		customer3.name = "고객3";
		customer3.age = 30;
		customer3.phone = "010-3333-3333";
		customers.add(customer3);

		store1.setCustomers(customers);

		Product product1 = new Product();
		product1.name = "물건1";
		product1.price = 1000;
		products.add(product1);

		Product product2 = new Product();
		product2.name = "물건2";
		product2.price = 2000;
		products.add(product2);

		Product product3 = new Product();
		product3.name = "물건3";
		product3.price = 3000;
		products.add(product3);

		store1.setProducts(products);

		System.out.println("매장 이용 고객 수 : " + customers.size() + "명" + " || 제품 수 : " + products.size() + "개" + "\n");

		// 1번 고객이 2번 물건을 샀을때, 고객이 산 제품, 고객이 산 총 금액, 제품 전체 금액
		store1.pay(customer1, product2);
		store1.pay(customer1, product1);

		store1.pay(customer2, product1);

		store1.pay(customer3, product3);
		
		
		// 1번 고객 - 산 제품= 물건2,2000원 총 금액 : 2000
		// 1번 고객 - 산 제품= 물건1:1000원,물건2:2000원 총 금액 : 3000
		for (Customer c : store1.getCustomers()) {
			
			// 물건을 산 사람들만 나오게
			if (c.buyProducts.size() > 0) {
				System.out.println("---------------------------------------------------------");
				System.out.println("고객 이름 : " + c.name + " || 나이 : " + c.age + " || 번호 : " + c.phone + "이 구매한 제품");
				for (Product bp : c.getBuyProducts()) {
					System.out.println("제품 이름 : " + bp.name + " || 가격 : " + bp.price + "원");
				}
				// 물건 산 사람들의 총금액
				System.out.println("총 금액 : " + c.buyPrice + "원");		
			}
		}
		//매장의 총 매출
		System.out.println("---------------------------------------------------------");
		System.out.println("매장 매출 : " + Product.totalPrice + "원");
		System.out.println("---------------------------------------------------------");

//		System.out.println(customer1.getBuyProducts());

	}

}
