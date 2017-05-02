package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用dom解析xml文档
 * dom:文档对象模型
 * @author adminitartor
 *
 */
public class ParseXMLDemo {
	public static void main(String[] args) throws DocumentException, FileNotFoundException {
		/*
		 * 使用dom解析xml文档的步骤:
		 * 1:创建SAXReader
		 * 2:使用SAXReader读取并解析xml文档
		 *   解析后会返回一个Document的对象，
		 *   该对象即表示解析的xml文档内容。
		 *   这一步就是dom耗时耗资源的地方了,
		 *   因为会将xml文档全部读取完并载入
		 *   内存。
		 * 3:通过Document获取根元素
		 * 4:根据文档结构从根元素开始逐级获取
		 *   子元素，以达到遍历xml文档内容的目的  
		 */
		//1
		SAXReader reader = new SAXReader();
		
		//2
		Document doc = reader.read(
			new FileInputStream("emplist.xml")
		);
		
		/*
		 * 3 获取根元素
		 * Document提供了获取根元素的方法:
		 * Element getRootElement()
		 * 
		 * Elememt
		 * 每一个Element实例都表示xml文档中
		 * 的一个元素，即:一对标签
		 * 通过Element实例，可以获取该实例表示
		 * 的标签中的相关信息，例如该标签的名字
		 * 标签的属性，以及该标签包含的所有子标签
		 * 
		 */
		Element root = doc.getRootElement();
		/*
		 * String getName()
		 * Element的该方法用来获取其表示的标签
		 * 的名字。
		 */
		System.out.println(
			"根标签名为:"+root.getName()
	    );
		/*
		 * 4:解析xml文档内容，获取其中保存的
		 *   所有员工信息。
		 *   每个员工解析后可以使用Emp类的一个
		 *   实例保存
		 */
		//该集合用来保存解析出来的所有员工信息
		List<Emp> empList 
			= new ArrayList<Emp>();
		
		/*
		 * Element提供了获取子标签的相关方法，
		 * 常用的:
		 * Element element(String name)
		 * 获取当前标签下指定名字的子标签(在子标签
		 * 名字没有重复的时候常用)
		 * 
		 * List elements()
		 * 获取当前标签下的所有子标签，返回的集合中
		 * 是若干的Element实力，每一个实例表示其中的
		 * 一个子标签。
		 * 
		 * List elements(String name)
		 * 获取当前标签下指定名字的所有子标签(在
		 * 子标签名字有重复的时候使用)
		 * 
		 */
		//获取根标签中的所有子标签<emp>
		List<Element> list 
			= root.elements();
		//遍历所有子标签，每一个就是一个emp标签
		for(Element empEle : list){
			//获取name的值
			//先获取name标签
			Element nameEle = empEle.element("name");
			/*
			 * Element提供了方法:
			 * String getText()
			 * 该方法用来获取当前标签中间的文本
			 * 
			 * String getTextTrim():
			 * 在获取了标签中间的文本后还会去除
			 * 该字符串两边的空白
			 * 
			 */
			String name = nameEle.getText();
			/*
			 * Element提供了一个方法:
			 * String elementText(String name)
			 * 该方法可以获取当前标签下指定名字的子标签
			 * 中间的文本。 
			 */
			//获取年龄
			int age = Integer.parseInt(
				empEle.elementText("age")
			);
			
			//获取性别
			String gender = empEle.elementText("gender");
			
			//获取工资
			int salary = Integer.parseInt(
				empEle.elementText("salary")	
			);
			/*
			 * Attribute attribute(int index)
			 * Attribute attribute(String name)
			 * 获取当前标签中的属性
			 * 
			 * Attribute的每一个实例用于表示标签
			 * 的一个属性
			 */
			Attribute attr 
				= empEle.attribute("id");
			int id = Integer.parseInt(
				attr.getValue()
			);
			
			Emp emp = new Emp(id,name,age,gender,salary);
			empList.add(emp);
		}
		
		System.out.println("解析完毕!");
		System.out.println(
			"得到了"+empList.size()+"个员工信息"
		);
		for(Emp emp : empList){
			System.out.println(emp);
		}
		
		
	}
}






