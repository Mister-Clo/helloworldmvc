package org.helloworldmvc.main;


import org.helloworldmvc.contract.IModel;
import org.helloworldmvc.contract.IView;
import org.helloworldmvc.model.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	IView view = new View();
    	IModel model =new Model();
    	 Controller con = new Controller(view, model);
    }
}
