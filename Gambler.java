// ///////////////////////////////////////////
//  Purpose : Simulates a gambler who start with $stake and place fair $1 bets until
//  				he/she goes broke (i.e. has no money) or reach $goal. Keeps track of 
//   				the number of times he/she wins and the number of bets he/she makes. 
//  				Run the experiment N times, averages the results and prints them out.
// @Author  : Mahesh Aurad
// Date     : 13 june 2019
// Input    : 
// Output   : 
// ///////////////////////////////////////////

import java.util.*;
public class Gambler{
	public static void main(String args[]){
		int stack=10,goal=15,loss=0,win=0;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of times to play: ");
		int noOfTimesPlay=sc.nextInt();
		System.out.println("+: ");
		stack=sc.nextInt();
		System.out.println("Enter the number of : ");
		goal=sc.nextInt();
		win=stack;  //total number of wins made
		loss=stack; //total number of bets
		for(int i=0;i<noOfTimesPlay;i++){
			if(Math.random()<0.5){
				stack--;
				loss++;
			}
			else{
				stack++;
				win++;
			}
			if(goal==win){
			break;	
			}
		}

		System.out.println("win "+win);
		System.out.println("loss "+loss);
		percentage = (win*100)/noOfTimesPlay;
		System.out.println("win percentage "+per);
		percentage = (loss*100)/noOfTimesPlay;
		System.out.println("loss percentage "+per);
	}
}
