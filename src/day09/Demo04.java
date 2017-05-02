package day09;

public class Demo04 {
	public static void main(String[] args) {
		Cell c1=new Cell();
		c1=null;
//		c1.row;
		Cell c2=new Cell();
		Cell c3=c2;
		c2.row=9;
		System.out.println(c3.row);
	}
}
class Cell{
	int col;
	int row;
}