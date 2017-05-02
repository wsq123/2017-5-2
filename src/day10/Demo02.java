package day10;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 引用数组
		 * 新建一个数组对象时，若其对象类型是引用类型（不是8种之一），若不赋值，则元素默认值均为null
		 * 不会发生空指针异常（原因：虽然不知道里面具体是什么，但存在指向关系，若令ary=null,即引用变量
		 * 的值为null,不指向任何对象，此时访问其元素，会发生空指针异常）,当然此对象类型肯定要提前定义好。
		 */
		Cell[] ary=new Cell[4];
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		System.out.println(ary[3]);
//		System.out.println(ary[4]);
		
		//Arrays.toString()方法：遍历出每个元素，然后放到一个集合中
		//找出数组集合，且指明了其中每个元素
		System.out.println(Arrays.toString(ary));
		
		//初始化数组元素（将每个定义好的元素对象传到Cell类中的构造器Cell(int row,int col)）
		//中（初始化的目的：将值传到定义的类中，再利用Cell类中定义好的方法输出）
		ary[0]=new Cell(3,4);
		ary[1]=new Cell(2,3);
		ary[2]=new Cell(1,2);
		ary[3]=new Cell(3,1);
		
		System.out.println(Arrays.toString(ary));	
	}
}
