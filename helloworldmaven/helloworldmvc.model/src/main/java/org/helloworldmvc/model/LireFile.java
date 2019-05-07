package org.helloworldmvc.model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LireFile {
	private static String FileName = new String("yo.txt");
    private static LireFile instance = null;
    private String helloWorldMessage = null;
    private BufferedInputStream bis =null;
    
    
    public LireFile() {
    	this.readFile();
    }
    public static LireFile getInstance() {
    	return instance;
    }
    
    private static void setInstance(LireFile instance) {
    	LireFile.instance = instance;
    }
    
    private void readFile() {
    	try {
    		bis = new BufferedInputStream(new FileInputStream(new 
    				File("yo.txt")));
    		
    		byte[] buf =new byte[20];
    		while(bis.read(buf) != -1) {
    			for (byte bit:buf) {
    				System.out.print((char)bit);
    				char tmp= (char)bit;
    				helloWorldMessage =Character.toString(tmp);
    			}
    			System.out.println("");
    			buf = new byte[8];
    		}
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		try {
    			if(bis !=null)
    				bis.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	
    }
    
    public String getHelloWorldMessage() {
    	return helloWorldMessage;
    }
    public void setHelloWorldMessage(String helloWorldMessage) {
    	this.helloWorldMessage = helloWorldMessage;
    }

}
