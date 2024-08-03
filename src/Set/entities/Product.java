package Set.entities;

import java.util.Objects;

public class Product implements Comparable<Product>{
	private String product;
	private double price;
	
	Product(String product, double price){
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "Product [product=" + product + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return product.toUpperCase().compareTo(o.getProduct().toUpperCase());
	}
	
	
}
