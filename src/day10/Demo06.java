package day10;

public class Demo06 {
	public static void main(String[] args) {
		Goo g=new Goo();
		System.out.println(g.m);
		System.out.println(g.n);
	}

}
class Foo{
	int n;
	public Foo(){
		n=8;
	}
}
class Goo extends Foo{
	int m;
	public Goo(){
		super();
		m=7;
	}
}