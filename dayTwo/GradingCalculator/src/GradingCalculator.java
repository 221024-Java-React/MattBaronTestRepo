/*
 Matt Baron, October 25 2022
 Following along with grading calculator exercise during training
 */

import java.util.*;

public class GradingCalculator {
	public static void main(String[] args) {
		//Scanner will scan for input, constructor tells it where to get input from
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		while(running) {
			//check for next grade
			System.out.println("Please enter score: ");
			double score = input.nextDouble();
			input.nextLine(); //don't get return key confused with input
			System.out.println();
			
			//Grade the assignment
			if(score >= 90) {
				System.out.println("A");
			}
			else if(score >= 80) {
				System.out.println("B");
			}
			else if(score >= 70) {
				System.out.println("C");
			}
			else if(score >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
			
			System.out.println("Are you complete with grading? (Y/N)");
			String complete = input.nextLine();
			running = complete.equals("Y") ? false : true;
			// not foolproof, any non-Y input will keep grading but good enough for me
			// just wanted to point this out
			
			
		}
	}

}
