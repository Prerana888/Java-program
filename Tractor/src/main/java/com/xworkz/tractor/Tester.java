package com.xworkz.tractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tractordao.TractorDAO;
import com.xworkz.tractordto.TractorDTO;

public class Tester {

	public static void main(String[] args) {
		String contextConfiguration = "application.xml";
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(contextConfiguration);

		TractorDAO tractordao = context.getBean(TractorDAO.class);
		TractorDTO tractordto = new TractorDTO("mahindra",5000.0,"red",50.0);
		tractordao.saveTractor(tractordto);
	}

}
