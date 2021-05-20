package com.xworkz.utility.mailsender;

import org.apache.log4j.Logger;

public class Mailsender {
static Logger Logger;

static {
	Logger =Logger.getLogger(Mailsender.class);
}
public static void main(String args[]) {
	Logger.debug("hello");
	Logger.info("world");
	Logger.warn("welcome");
	Logger.error("error message");
}
}
