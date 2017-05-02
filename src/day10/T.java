package day10;

import java.util.Arrays;

/**
 * 建一个T型类，T型有四个格子，
 * 每个格子都有初始位置
 * 每个格子都要移动
 * 每个格子都要输出移动后的位置
 * @author Administrator
 *
 */
public class T {
	//新建四个格子对象
	Cell[] cells=new Cell[4];
	//在构造器中把每个格子的初始位置都定好
	public T(){
		cells[0]=new Cell(0,3);
		cells[1]=new Cell(0,4);
		cells[2]=new Cell(0,5);
		cells[3]=new Cell(1,4);
	}
	//加入格子下移的方法（row变）
	public void drop(){
//		for(int i=0;i<cells.length;i++){
//			cells[i].row++;
//		}
        cells[0].row++;
        cells[1].row++;
        cells[2].row++;
        cells[3].row++;  
	}
	public String toString(){
//		return cells[0].toString()+","+cells[1].toString()+","+cells[2].toString()
//				+","+cells[3].toString();
		return Arrays.toString(cells);
	}
	
}
