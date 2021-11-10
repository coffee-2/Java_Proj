package ex.ch06;

public class ShopService { //p.282-18
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {return instance;}
	
}
