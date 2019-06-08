import java.util.*;
public class Gambler{
	public static void main(String args[]){
		int stack=10;
		int goal=15;
		int loss=0,win=0;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of times to play: ");
		int not=sc.nextInt();
		win=stack;
		loss=stack;
		for(int i=0;i<not;i++){
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
		per = (win*100)/not;
		System.out.println("win percentage "+per);
		per = (loss*100)/not;
		System.out.println("loss percentage "+per);
	}
}