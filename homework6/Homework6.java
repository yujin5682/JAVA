import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Homework6 {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<>();
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Product> buyProducts = new ArrayList<>();
		
		
		Store store = new Store();
		store.name = "매장";
		
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
		
		store.setCustomers(customers);
		store.setProducts(products);
		
		store.pay(customer1, product1);
		store.pay(customer1, product2);
		
		store.pay(customer2, product2);
		store.pay(customer2, product3);
		
		store.pay(customer3, product1);
		
		//매장 안에 들어있는 고객의 수, 제품의 수
		System.out.println("매장 이용 고객 수 : " + store.getCustomers().size() + "명 || 제품 갯수 : " + store.getProducts().size() + "개");

		//고객 명 : 고객1 , 나이 : 10, 번호 : 010-1111-1111
		//구매 물건 : 물건 1 , 가격 : 1000
		//총 가격 : 1000원
		//조건 : 물건을 구매한 회원들의 배열을 돌려야함
		
		for (Customer c : store.getCustomers()) {
			if (c.buyProducts.size() > 0) {
				System.out.println("고객 명 : " + c.getName() + " || 나이 : " + c.getAge() + " || 번호 : " + c.getPhone());
				
				for (Product bp : c.getBuyProducts()) {
					System.out.println("물건 명 : " + bp.getName() + " || 가격 : " + bp.getPrice() + "원");
				}
				System.out.println("총 가격 : " + c.buyCount + "원");
				
				
			}
		}
		System.out.println("매장 총 매출 : " + Product.totalPrice + "원");
		
		
		//과제 6 날짜별 팔린 물건들을 리스트에 추가
		HashMap<String, ArrayList<Product>> dayToSoldProductList = new HashMap<>();

		
		//날짜 확인 Date
		Date date1 = new Date();
		Date date2 = new Date();
		Date date3 = new Date();
		
		//Calendar 추상 클래스 : Date와 같이 날짜와 시간을 다루는 클래스, 추상 클래스이기 때문에 직접 객체 생성 불가
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		calendar1.add(Calendar.DATE, -2);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date2);
		calendar2.add(Calendar.DATE, -1);
		
		Calendar calendar3 = Calendar.getInstance();
		calendar3.setTime(date3);
		calendar3.add(Calendar.DATE, 0);
		
		//SimpleDateFormat : 날짜 포맷 변경
		SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
		String yesterday2 = format1.format(calendar1.getTime());

		SimpleDateFormat format2 = new SimpleDateFormat("YYYY-MM-dd");
		String yesterday = format2.format(calendar2.getTime());

		SimpleDateFormat format3 = new SimpleDateFormat("YYYY-MM-dd");
		String today = format3.format(calendar3.getTime());
		
		dayToSoldProductList.put(yesterday2, buyProducts);
		dayToSoldProductList.put(yesterday, buyProducts);
		dayToSoldProductList.put(today, buyProducts);
		
		//날짜별 팔린 총 금액
		HashMap<String, Integer> dayToTotal = new HashMap<String, Integer>();
		
		dayToTotal.put(yesterday2, store.storeCount);
		dayToTotal.put(yesterday, store.storeCount);
		dayToTotal.put(today, store.storeCount);
		
		
		//for each 문으로 map의 모든 key를 가져와 set객체로 반환하는 것을 반복
		for (String key : dayToSoldProductList.keySet()) {
			
			System.out.println("키 : " + key + " || 값" + dayToSoldProductList.get(key));
			
			System.out.println("키 : " + key + " || 총 금액 " + dayToTotal.get(key));
			
		}
		
	}

}
