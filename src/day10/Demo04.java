package day10;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * java的二维数组：元素是一维数组的组数（元素arr[1]）
		 */
		int[][] arr=new int[3][];//3指有3个arr元素，arr[0],arr[1],arr[2]均为int[][]型
		System.out.println(arr[0]);
		arr[0]=new int[2];//2指arr[0]里有2个元素，arr[0][0],arr[0][1]
		arr[1]=new int[3];//3指arr[1]里有3个元素，arr[1][0],,,,是int型，默认均为0
		arr[2]=new int[2];
		System.out.println(arr[0][0]);
		
		arr[1][2]=10;
		System.out.println(arr[1][2]);
	}

}
