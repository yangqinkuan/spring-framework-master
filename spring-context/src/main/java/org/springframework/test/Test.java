/**
 * FileName: Test
 * Author:   yangqinkuan
 * Date:     2019-7-22 10:28
 * Description:
 */

package org.springframework.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//注解
/*		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.refresh();
		ServiceDao serviceDao = annotationConfigApplicationContext.getBean(ServiceDao.class);
		serviceDao.query();*/
		//XML
		ApplicationContext ctx = new ClassPathXmlApplicationContext("static/config1.xml");
		XmlBean xmlBean = ctx.getBean(XmlBean.class);
		xmlBean.print();
	}
}
