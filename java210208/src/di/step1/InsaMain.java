package di.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMain {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("di\\step1\\InsaBean.xml");
		ApplicationContext context2 =
				new ClassPathXmlApplicationContext
				("di\\step1\\InsaBean.xml");

		InsaList insaList = (InsaList) context.getBean("insa");
		InsaMap mapbean = (InsaMap) context2.getBean("insaMap");
		System.out.println("insaList= "+insaList);
		System.out.println(insaList.insaBean);
		System.out.println("mapbean= "+mapbean);
		System.out.println(mapbean.mapBean);
		for (String s : insaList.insaBean) {
			System.out.println(s);
		}
		
		InsaList insaList2 = new InsaList();
		System.out.println(insaList2);
		System.out.println(insaList2.insaBean);

	}

}


