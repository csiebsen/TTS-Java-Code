package com.acme;

import com.acme.enums.WorkerTypeEnum;
import com.acme.util.StringUtils;

public class AcmeMain {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		controller.runDemo();
		
		System.out.println(WorkerTypeEnum.FULL_TIME);
	}
	
}
