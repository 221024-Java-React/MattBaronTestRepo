/*  
 Matt Baron Lab 1
 October 25 2022
 */

class Lab1 {
	
	public static void main(String[] args) {
		// initialize main class and print message for debugging purposes 
		System.out.println("Lab 1 output:");
		
		// create variables of various data types
		boolean boo = true;
		byte maxByte = 127;
		short minShort = -32768;
		int maxInt = 2147483647;
		long javaFlex = 3000000000L;	//approximate amount of devices Java code runs on
		float pie = (float) 3.1415; 
		double doubleYum = 6.2831;
		
		/* Teachable moment: in Java decimal values are double by default
		and non-decimals are int by default. As I understand it, I got an error 
		initially because non-default data types need to be explicitly specified.
		Default data types make sense, but I'm curious why 
		the variable declaration isn't suffice to specify the data type.
		 */
		
		
		//print values 
		System.out.println("Print values of various datatypes below ");
		System.out.println(boo);
		System.out.println(maxByte);
		System.out.println(minShort);
		System.out.println(maxInt);
		System.out.println(javaFlex);
		System.out.println(pie);
		System.out.println(doubleYum);
		System.out.println("Fun fact: Java runs on " + javaFlex + " devices worldwide.");
		
		
	}
	
}