// ///////////////////////////////////////////
//  Purpose : Flip coin and print percentage of heads and tails 
// @Author  : Mahesh Aurad
// Date     : 14 june 2019
// Input    : The number of times flip coin:4
// Output   : Percentage of heads=75.00% vs tails=25.00%(head=3,tails=1)
// ///////////////////////////////////////////


import java.util.*;
public class FlipCoin{
	public static void main(String args[]){
		int numOfTimeFlipCoin,loopCounter,tail=0,head=0;
		int tail=0;
		int head=0;
		float percentage,temp;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter the number of times to Flip Coin: ");
		numOfTimeFlipCoin=sc.nextInt();
		if(numOfTimeFlipCoin<1){
			System.out.println("The number of times to Flip Coin should be greater than Zero: ");		
		}
		}while(numOfTimeFlipCoin<1);
		for(loopCounter=0;loopCounter<numOfTimeFlipCoin;loopCounter++){
			if(Math.random()<0.5){
				tail++;
			}
			else{
				head++;
			}
		}
		System.out.println("head "+head);
		System.out.println("tail "+tail);
		percentage = (head*100)/numOfTimeFlipCoin;
		System.out.println("head percentage "+percentage);
		percentage = (tail*100)/numOfTimeFlipCoin;
		System.out.println("tail percentage "+percentage);
	}
}
