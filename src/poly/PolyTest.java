package poly;

import java.util.ArrayList;
import java.util.List;

public class PolyTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Product p = new Product();
		List<Product> al = new ArrayList<Product>();

		al.add(new Tv());
		al.add(new Tv());

		al.add(new Computer());
		al.add(new Tv());
		al.add(new Tv());

		al.add(new Audio());
		IAttachable im = new ImplAttatchable();
		
	}

}
