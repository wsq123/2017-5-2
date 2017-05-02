package day10;
/**
 * 新建一个父类，父类中有：
 * 1、每个对象都有四个格子
 * 2、每个对象都可下移
 * 3、每个对象都可左移
 * 4、每个对象都会输出
 * 
 */
import java.util.Arrays;

public class Tetromino {
	Cell[] cells=new Cell[4];
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	public String toString(){
		return Arrays.toString(cells);
	}

}
