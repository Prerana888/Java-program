package com.xworkz.sundirect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springXML = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springXML);
		Sundirect dth = container.getBean(Sundirect.class);
		dth.wacthingTV();
		dth.pictureAndSoundQuality();
	}
}
