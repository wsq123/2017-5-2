package day08;

public class Demo03 {
	public static void main(String[] args) {
		Student stu=new Student();
		
		System.out.println(stu.sid);//int默认值为0
		System.out.println(stu.name);//String默认值为null
		System.out.println((int)stu.gender);//gender无默认值，应先转为int，则为0
		System.out.println(stu.isMarried);//boolean默认值为false
		System.out.println(stu.weight);//double默认值为0.0
	}
}
class Student{
	int sid;
	String name;
	char gender;
	boolean isMarried;
	double weight;
}