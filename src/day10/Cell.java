package day10;

public class Cell {
	int row;
	int col;
	public Cell(int row,int col){
		this.row=row;
		this.col=col;
	}
	public String toString(){
		return "("+row+","+col+")";
	}
}
