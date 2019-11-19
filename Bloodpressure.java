//import object
import java.util.Scanner;
//declare class
public class Bloodpressure{
	//declare  method
	public static void main(String args[]){
		//declare variables
		int bloodPressureS = 0, bloodPressureD = 0;
		String age;
		Scanner input;
		//input
		input = new Scanner (System.in);
		System.out.println("Are you 18?");
		age = input.next();
			if(age.equalsIgnoreCase("No")){
				System.out.println("You cannot use this application");
			}
				 else if(age.equalsIgnoreCase("Yes")){
					System.out.println("Enter your systolic blood pressure/the first number:");
					bloodPressureS = input.nextInt();
					System.out.println("Enter your diastolic blood pressure/the second number:");
					bloodPressureD = input.nextInt();
					}
					//output && process
					//normal
					if(bloodPressureS < 120 && bloodPressureD < 80){
						System.out.println("Your blood pressure is normal.");
						}
						//elevated
						else if(bloodPressureS >= 120 &&  bloodPressureS <= 129 && bloodPressureD < 80){
							System.out.println("Your blood pressure is elevated.");
						}
						//stage 1
							else if(bloodPressureS >= 130 && bloodPressureS <= 139 || bloodPressureD >= 80 && bloodPressureD <= 89){
								System.out.println("You have high blood pressure(hypertension stage one.");
						}
						//stage 2
							else if(bloodPressureS >= 140 && bloodPressureS < 180 || bloodPressureD >= 90 && bloodPressureD <= 120){
								System.out.println("You have high blood pressure(hypertension stage two).");
						}
						//crisis
							else if(bloodPressureS >= 180 || bloodPressureD >= 120){
								System.out.println("You have a hypertensive crisis. Consult your doctor immediately.");
						}
						else{
							System.out.println("Error");
						}
	}
}