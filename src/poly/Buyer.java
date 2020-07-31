package poly;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
//	Vector<Product> item = new Vector<Product>();
	List<Product> item = new ArrayList<Product>();

	void buy(Product p) {
		if (money < p.getPrice()) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		item.add(p);
		System.out.println(p + "을 구입하셨습니다.");

	}

	void refund(Product p) {
		if (item.remove(p)) {
			money += p.getPrice();
			bonusPoint -= p.getBonusPoint();
			System.out.println(p + "을 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}

	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("구입 하신 물품이 없습니다.");
			return;
		}
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.getPrice();
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액 : " + sum + "만원");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");

	}
}
