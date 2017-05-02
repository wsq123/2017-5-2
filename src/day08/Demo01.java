package day08;

public class Demo01 {
	public static void main(String[] args) {
		String name="范传奇";
		int age=18;
		char gender='男';
		double salary=5000;
		
		String name1="李鸿禾";
		int age1=50;
		char gender1='女';
		double salary1=4000;
		
		//分配一组数据:new Emp()创建对象
		Emp fan=new Emp();
		Emp li=new Emp();
		fan.name="范传奇";
		li.name="李鸿禾";	
	}
}

/*
 * 类用于创建对象的模板，定义对象的结构
 * 定义对象（一组数据）的结构
 * 仅仅是结构的定义，没有具体数据
 * 
 */
class Emp{
	String name;
	int age;
	char gender;
	double salry;
}