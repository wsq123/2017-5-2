package day13;
/**
 * 该类用于表示XML文档中一个EMP标签所表示的员工信息。
 * @author Administrator
 *
 */
public class Emp {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	public String toString(){
		return id+","+name+","+age+","+gender+","+salary;
	}

}
