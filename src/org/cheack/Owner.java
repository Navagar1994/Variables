package org.cheack;

                    //  Static Variable  //

public class Owner {
      static int c;
	static void ownerName() {//stored in static memory(CLM-class loader memory)
	    System.out.println("owner name is vijayragavan"); 
	}
	static void ownerLocation() {
	    System.out.println("owner address is omr chennai");

	}

	public static void main(String[] args) {
		
	    ownerName();
	    ownerLocation();
	    System.out.println(c);
		
		
	}

}
