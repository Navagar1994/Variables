package org.cheack;

               //  pre and post inc/dec  //

public class PrePost {
	int x =22; //22+1=23 23+1=24
	static int y =44;//44-1=43 43-1=42
	private void increment() {
		System.out.println(++x);//23
		System.out.println(y--);//44
		                        //24
		                        //42

	}
	public static void main(String[] args) {
		
		PrePost p = new PrePost();
		
		p.increment();
		
		PrePost p1 = new PrePost();
		
		p1.increment();
		
	}
}
