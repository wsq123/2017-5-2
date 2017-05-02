package day09;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * 为Cell1类设计重载的下落方法
		 */
		Cell1 a=new Cell1();
		a.row=9;
		a.drop();
		System.out.println(a.row);
		a.drop(3);
		System.out.println(a.row);
	}
}
class Cell1{
	int row;
	int col;
	public void drop(){
		row++;
	}
	public void drop(int step){
		row +=step;
	}
}