package day09;

public class Demo02 {
	public static void main(String[] args) {
		PayMoney cashier=new PayMoney();
		cashier.pay(5.5);
		cashier.pay("123456","abcdefghijkl");
		cashier.pay("123445566");
	}

}
class PayMoney{
	/*
	 * 方法的重载：方法名相同，参数不同
	 */
	public void pay(double money){
		System.out.println("现金支付");
	}
	public void pay(String id,String pwd){
		System.out.println("信用卡支付");
	}
	public void pay(String barcode){
		System.out.println("支付宝支付");
	}
}