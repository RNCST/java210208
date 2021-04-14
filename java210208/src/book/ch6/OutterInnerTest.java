package book.ch6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

class Outter{
	Logger logger = LogManager.getLogger(OutterInnerTest.class);
	int i=5;
	Outter(){
		System.setProperty
		(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "log4j.xml");
	}
	class Inner{
		int j=10;
		public void go() {
			logger.info("run go()");
		}
	}
	public void print() {
		logger.info("run print()");
	}
}
public class OutterInnerTest {
	Logger logger = LogManager.getLogger(OutterInnerTest.class);
	public void methodA() {
		logger.info("methodA 호출 성공");
	}
	public static void main(String[] args) {
		System.setProperty
		(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "log4j.xml");
		Outter outter = new Outter();
		outter.print();
		Outter.Inner oi = outter.new Inner();
		oi.go();
	}

}
