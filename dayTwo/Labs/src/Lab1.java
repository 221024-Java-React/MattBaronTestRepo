// Matt Baron Lab 1
// October 25 2022

class Lab1 {
	
	public static void main(String[] args) {
		// initialize main class and print message for debugging purposes 
		System.out.println("test message");
		
		// create variables of  data types
		boolean boo = true;
		byte maxByte = 127;
		short minShort = -32768;
		int maxInt = 2147483647;
		//long javaFlex = 3000000000;
		// If my research is right, Java runs on 3 billion devices. 
		//Assuming I added the right number of zeros, I'm told this value is out of range
		//float pie = 3.1415; //cannot convert from double to float, I hate floats
		double doubleYum = (2 * 3.1415);
		
		//TODO: fix errors with pie and JavaFlex
		
		//lazily print all values at once
		//System.out.println(boo, maxByte, minShort, maxInt, doubleYum);
		//The method println(boolean) in the type PrintStream is not applicable for the arguments (boolean, byte, short, int, double)
		//TODO: fix this after lunch
		
		
		//individual print for javaFlex
		//System.out.println("Java runs on ", javaFlex, " devices worldwide.");
		
	}
	
}