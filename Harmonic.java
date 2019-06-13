// ///////////////////////////////////////////
// ///Programme: compute the nth harmonic value
// ///Author   : Mahesh Aurad
// ///Date     : 13 june 2019
// ///Input    : 4
// ///Output   : The nth harmonic value is : 2.083
// ///////////////////////////////////////////

import java.util.*;
public class Harmonic{
	static int loopCounter=1;
	static double sumNthHarmonic=0;
	public static void main(String[] args){
		double sum1=0.0,temp;
		int harmonicValue = 0;
		Scanner sObj=new Scanner(System.in);
		
		System.out.println("Enter the Harmonic value:");
		harmonicValue = sObj.nextInt();
		sumNthHarmonic=calculateHarmonic(harmonicValue);
		
		System.out.println();
		System.out.println("The nth Harmonic value is: "+sumNthHarmonic);
		sObj.close();
}
	//method to calculate the nth Hormonic value  
	public static double calculateHarmonic(int harmonicValue){
		if(harmonicValue<=0){
			System.out.println("number should be greater than 0");
		}else if(loopCounter<=harmonicValue){
			System.out.print(""+(1.0/loopCounter)+" + ");
			sumNthHarmonic = sumNthHarmonic + (1.0/loopCounter);
			loopCounter++;
			//harmonicValue--;
			calculateHarmonic(harmonicValue);
		}
	return sumNthHarmonic;
	}	
}

//
