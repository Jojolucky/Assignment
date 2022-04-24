package edu.neu.csye6200;

public class Cart {
	public final static int MAJOR_VERSION = 1;
	public final static int MINOR_VERSION = 0;
	public final static String VERSION = Integer.valueOf(MAJOR_VERSION).toString()
			+ "." + Integer.valueOf(MINOR_VERSION).toString();
	
	private double myCash;
	private double myTotal;
	private double myChange;
	
	{
		this.myCash = 20;
		this.myTotal = 0;
		this.myChange =0;
	}
	
	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}
	
	public Cart() {
		super();
	}
	
	public double getMyCash() {
		return myCash;
	}

	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}

	public double getMyTotal() {
		return myTotal;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public double getMyChange() {
		return myChange;
	}


	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Cart");
		sb.append("[version ").append(VERSION).append("]: ");
		sb.append("\n\t * Cash: ").append(this.myCash);
		sb.append("\n\t * Total: ").append(this.myTotal);
		sb.append("\n\t * Change: ").append(this.myChange);
		return sb.toString();
		// return "Cart [myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}
	
	/**
	 * sillyCheckout:  use parameters PASSED BY VALUE
	 * calculate checkout:
	 * 1. add Item price to total (this is running subtotal from shopping)
	 * 2. subtract total from cash to compute change
	 *
	 */
	
	public void sillyCheckout(double cash, double price, double total, double change) {
		total += price;
		change = cash - total;
	}
	
	/**
	 * checkout:  use parameters PASSED BY REFERENCE
	 * calculate checkout;
	 * 1. add Item price to total(this is running subtotal from shopping)
	 * 2. subtract total from cash to compute change
	 */
	
	public double Checkout(Cart myCart, Item myItem) {
		myCart.setMyTotal(myCart.getMyTotal() + myItem.getPrice());
		myCart.setMyChange(myCart.getMyCash() - myCart.getMyTotal());
		return myCart.getMyChange();
		
	}
	
}
