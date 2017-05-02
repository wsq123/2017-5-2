package day08;
public class Demo04 {
	public static void main(String[] args) {
		Cell1 c=new Cell1();
		c.row=9;
		c.drop();
		Cell1 c2=null;
		/*
		 * Cell1类型的引用变量的值为null,即c2不指向任何对象
		 * 空指针异常那个：
		 * 当引用变量的值为null时，就是不指向任何对象时，如果访问其属性（元素）、方法时，就会发生
		 * 空指针异常
		 */
		
		//解决空指针异常的办法：
		/*
		 * 1：将引用变量合理的赋值，使其引用对象
		 * 2：避免调用null值引用的属性和方法
		 */
		//1
//		int n=3;
//		 n=c2.row;
//		System.out.println(n);
		
		//2
		if(c2!=null){
			c2.drop();
		}
		System.out.println("c2为空！");	
	}
}
class Cell1{
	int row;
	int col;
	public void drop(){
		row++;
	}
	public void moveRight(){
		col++;
	}
	public void moveLeft(){
		col--;
	}
}