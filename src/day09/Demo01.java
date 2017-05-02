package day09;
/**
 * 方法签名=方法名+参数列表
 */

public class Demo01 {
	public static void main(String[] args) {
		//根据签名调用对应的方法
		Foo foo=new Foo();
		//根据签名识别方法
		foo.add();
		foo.add(5, 6);
		foo.test();
	}

}
class Foo{
	//Foo类中必有不同的方法签名
	public void test(){
		System.out.println("test()");
	}
	public void add(){
		System.out.println("add()");
	}
	public void add(int a,int b){
		System.out.println("add(int,int)");
	}
	
}