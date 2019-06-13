// ///////////////////////////////////////////
// ///Programme: Take a command line argument N and print the table of power of 2 
// ///Author   : Mahesh Aurad
// ///Date     : 13 june 2019
// ///InputCmd : 12 
// ///Output   : 2 4 8 16 32 64 128 256 512 1024
// ///////////////////////////////////////////

import java.util.Scanner;

public class Power{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		if(a<0 && a>=31){
		System.out.println("The Power should be in-between 0-31");
		return;
	}
	System.out.println("2^ "+a+"is ="+Math.pow(2,a));

	power(a);//call for power function
	}

	//get powers of 2  
	static void power(int a){
		int power=1,temp=0;
		
		if(a<30){
			for(int loopCounter=0;loopCounter<a;loopCounter++){
				temp=loopCounter;
				while(temp!=0){
				power=power*2;
				temp--;
				}
				System.out.println("2^ "+loopCounter+" = "+power);
				power=2;	
			}
		}
	    }
}	


