package org.cheack;

             /////  Local variable  /////

public class Orgnaization {//didn't any access specifier // stored in stack memory
	
	private void orgName() {
	      int a=2;
	    System.out.println("org name is tata motors");
        System.out.println(a);
	}
	private void orgId() {
	    System.out.println("org id is 588");
	    
	}
	public static void main(String[] args) {
		
		Orgnaization o = new Orgnaization();
		
		o.orgName();
		o.orgId();
		
		
	}

}
