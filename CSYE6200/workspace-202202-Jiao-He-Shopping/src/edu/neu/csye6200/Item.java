package edu.neu.csye6200;

public class Item {
	
	private int id;;
	private String name;
	private double price;
	
	public Item(int id,double price, String name) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id= " + id + ", name= " + name + ", price= " + price + "]";
	}
	
public static void demo() {
		
		System.out.println(Cart.class.getName() + ".demo()...");
		
		Item bread = new Item(1,3,"bread"); // create  three  items object for shopping
		Item apple = new Item(2,1.5,"apple");
		Item milk = new Item(3,4,"milk");
		Item peach = new Item(4,4.4,"peach");
		
		System.out.println("\n******  Item     Details  ******");
		System.out.println(bread.toString());
		System.out.println(apple.toString());
		System.out.println(milk.toString());
		System.out.println(peach.toString());
		
		
		// create a  object Cart.
		Cart myShoppingCart = new Cart();
		double cash = 20;
		double total = 0;
		double change = 0;
		
		// silly checkout
		myShoppingCart.sillyCheckout(cash, bread.getPrice(), total, change);
		myShoppingCart.sillyCheckout(cash, apple.getPrice(), total, change);
		myShoppingCart.sillyCheckout(cash, milk.getPrice(), total, change);
		myShoppingCart.sillyCheckout(cash, peach.getPrice(), total, change);
		
		System.out.println("\n******  Silly Check Out  ******");
		System.out.println(myShoppingCart);
		
		// checkout
		myShoppingCart.Checkout(myShoppingCart, bread);
		myShoppingCart.Checkout(myShoppingCart, apple);
		myShoppingCart.Checkout(myShoppingCart, milk);
		myShoppingCart.Checkout(myShoppingCart, peach);
		
		System.out.println("\n******  Smart Check Out  ******");		
		System.out.println(myShoppingCart);
		
		
		System.out.println(Cart.class.getName() + ".demo()...done!");
		
	}
	
}
