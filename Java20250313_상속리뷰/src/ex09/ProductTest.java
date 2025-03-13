package ex09;

public class ProductTest {

	public static void main(String[] args) {

		Product[] products = new Product[5];
		
		products[0] = new Product();
		products[1] = new Product("새우깡", 10, 1500);
		products[2] = new Product("신라면", 100, 1300);
		products[3] = new Product("담배", 10, 4500);
		products[4] = new Product("소주", 20, 1500);
		
		for(int i=0; i<products.length; i++)
			System.out.println(products[i]);
	}
}
