package day13;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用DOM解析XML文件
 * @author Administrator
 *
 */
public class ParseXMLDemo {
	public static void main(String[] args) {
		try {
			/*
			 * 使用DOM解析XML文档的大致流程：
			 * 1、创建SAXReader
			 * 2、读取XML文档数据并进行解析（读取就解析了），返回Document对象
			 *   Document对象就表示XML文档信息了。耗时操作，会将XML信息全部载入
			 *   内存。
			 * 3、通过Document对象获取根元素。
			 * 4、根据XML文档结构，通过根元素逐层遍历，最终达到遍历XML文档的目的。
			 */
			//1
			SAXReader reader=new SAXReader();//..Reader表示字符输入流
			//2
			Document document=reader.read(new File("emplist.xml"));
			//3
			/*
			 * Document提供了获取根元素的方法：
			 * Element getRootElement()
			 * 
			 * Element用于表示XML文档中的一个元素（一对标签）。
			 * org.dom4j.Element
			 */
			Element root=document.getRootElement();
			List<Emp> empList=new ArrayList<Emp>();
			
			
			
		} catch (Exception e) {
			
		}
	}
	
}
