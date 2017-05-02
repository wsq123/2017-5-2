package day10;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 创建2000000个对象，及时将斩断引用关系，即引用不指向任何对象，那么这些对象会变为
		 * 游离的垃圾，会被垃圾回收器及时回收，不会造成内存泄漏（没用的东西把内存占着就叫内存泄漏）
		 */
//		int n=2000000;
//		int i=0;
//		for(;i<n;i++){
//			Cell c=new Cell(1,5);
//			c=null;
//		}
//		System.out.println(i);
		
		//如何避免内存泄漏：当对象使用后，及时将引用赋值为null	
	}

}
