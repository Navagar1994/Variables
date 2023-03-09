package org.cheack;

                   ////     Instance or Global Variable   ///

public class Company {
	   int b; //or int b=3 // it takes default value
	  
	   protected void companyName() {//accepts any access specifier // stored in heap memory
		   System.out.println("company name is qspiders");
	   }
	   private void companyAddresss() {
		   System.out.println("company address is thambaram chennai");
		   System.out.println(b);
	}
    
	   public static void main(String[] args) {
		
		   Company c = new Company();
		   
		   c.companyName();
		   c.companyAddresss();
	}
}
