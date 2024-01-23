package com.skyline.lc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
private double price;
	
	public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public Pepsi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi:: init");
	}

	public void destroy() throws Exception {
	System.out.println("Going to put boottle  vack to shop:: destroy");
		
	}

}
