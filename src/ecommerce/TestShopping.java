package ecommerce;

public class TestShopping {
	public static void main(String[]args) {
		Customer customerSandy=new Customer();
		customerSandy.walkin();
		Security maxSecurity=new Security();
		maxSecurity.scan(customerSandy);
	}


}
