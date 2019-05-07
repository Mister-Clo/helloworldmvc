package org.helloworldmvc.model;

import org.helloworldmvc.contract.IModel;

public class Model implements IModel {
	
	private LireFile lf = new LireFile();

	public String getHelloWorld() {
		System.out.println(lf.getHelloWorldMessage());
		return null;
	}

}
