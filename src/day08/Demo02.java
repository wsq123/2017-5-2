package day08;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * new用于分配空间（分配变量）
		 * new Cell()分配了3个int变量
		 * 这一组变量称为“对象”
		 */
		Cell c1=new Cell();
		Cell c2=new Cell();
		Cell c3=new Cell();
		Cell c4=new Cell();
		
		/*
		 * 初始化对象的数据
		 */
		c1.col=2;
		c1.row=6;
		c2.col=4;
		c2.row=5;
		c3.col=80;
		c4.col=6;
		
//		c1.row++;
//		c2.row++;
//		c3.row++;
//		c4.row++;
		c1.drop();
		c2.drop();
		c3.drop();
		c4.drop();	
	}
}

//公共的属性、方法都放在类中，这样更优雅！
class Cell{
	/*
	 * 对象都有行，列，颜色这三种属性
	 */
	int row;
	int col;
	int color;
	
	/*
	 * 对象都有drop()方法
	 */
	public void drop(){
		row++;
	}
}