package day10;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 数组是对象，数组变量是引用类型变量，引用类型变量可以赋值为null
		 */
		int[] ary=new int[5];
		System.out.println(ary[0]);//0
		System.out.println(ary);//地址
//		ary=null;
//		System.out.println(ary[0]);
		ary=new int[4];
		ary[1]=7;
		System.out.println(ary[1]);//7
		
		/*
		 * 扩容更换数组，用Arrays.copyOf(原数组引用，你想扩容的长度（原长+想加几个上去）)
		 */
		ary=Arrays.copyOf(ary, ary.length+1);
		System.out.println(ary.length);//5
		
		//两个引用指向同一对象
		int[] ary1=ary;
		ary1[1]=9;
		System.out.println(ary1[1]);//9
	}
}
