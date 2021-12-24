package beautyparlerdemo;

import java.util.Scanner;

public class DiscountRate {
	static float findFinalPricePremieme(float price) {
		int discount = 20;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	static float findFinalPriceGold(float price) {
		int discount = 15;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	static float findFinalPriceSilver(float price) {
		int discount = 10;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	public static void main(String[] args) {
		int price;
		int discount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter price of the product :");
		price = sc.nextInt();

		// System.out.println("Enter Discount of the product :");
		// discount = sc.nextInt();

		System.out.println("Final price premieme is " + findFinalPricePremieme(price));
		System.out.println("Final price Gold is " + findFinalPriceGold(price));
		System.out.println("Final price Silver is " + findFinalPriceSilver(price));
	}

}