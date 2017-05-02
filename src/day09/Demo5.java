package day09;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		int[] ary=new int[5];
		System.out.println(ary[0]);
//		ary=null;
		System.out.println(ary);
		ary[0]=10;
		int n=ary.length;
		ary=new int[3];
		ary[0]=10;
		System.out.println(ary[0]);
		//扩容更换数组，更换新数组
		ary=Arrays.copyOf(ary, ary.length+1);
		System.out.println(ary.length);
		int[] ary1=ary;
		ary[1]=5;
		System.out.println(ary1[1]);	
	}
}
