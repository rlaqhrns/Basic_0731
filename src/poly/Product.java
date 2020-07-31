package poly;

import java.util.List;

public class Product {
	private int price;
	private int bonusPoint;
	private List<Product> item;
	
	public Product (int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}
	public Product() {
		price = 0;
		bonusPoint = 0;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public int getBonusPoint() {
		return this.bonusPoint;
	}
	List<Product> getItem(){
		return this.getItem();
	}
	void setItem(List<Product> item) {
		this.item = item;
	}
}
