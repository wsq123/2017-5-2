package day12;

import java.io.FileInputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用xpath检索xml数据
 * 若希望在dom解析中使用xpath,需要引入一个
 * jar包:jaxen
 * 
 * @author adminitartor
 *
 */
public class XPathDemo {
	public static void main(String[] args) {
		try {
			SAXReader reader
				= new SAXReader();
			Document doc = reader.read(
				new FileInputStream("myemp.xml")
			);
			String xpath = "/list/emp[gender='女']/age";
			List<Element> list = doc.selectNodes(xpath);
			for(Element e : list){
				System.out.println(e.getText());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



