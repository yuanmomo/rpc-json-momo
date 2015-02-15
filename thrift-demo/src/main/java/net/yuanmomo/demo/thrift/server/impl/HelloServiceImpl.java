package net.yuanmomo.demo.thrift.server.impl;

import net.yuanmomo.thrift.demo.Hello.Iface;

import org.apache.thrift.TException;


public class HelloServiceImpl implements Iface { 
   @Override 
   public boolean helloBoolean(boolean para) throws TException { 
       return para; 
   } 
   
   @Override 
   public int helloInt(int para) throws TException { 
       try { 
           Thread.sleep(20000); 
       } catch (InterruptedException e) { 
           e.printStackTrace(); 
       } 
       return para; 
   } 
   @Override 
   public String helloNull() throws TException { 
       return null; 
   } 
   @Override 
   public void helloVoid() throws TException { 
       System.out.println("Hello World"); 
   }

	@Override
	public String helloString(String para, int age, boolean male) throws TException {
		System.out.println(para + " " + age +" " + male);
		return para + " " + age +" " + male;
	} 
}