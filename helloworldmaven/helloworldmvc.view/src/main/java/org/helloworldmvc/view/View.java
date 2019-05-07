package org.helloworldmvc.view;

import org.helloworldmvc.contract.IView;

public class View implements IView {
	
	public void displayMessage(String message) {
		System.out.println(message);
	}

}
