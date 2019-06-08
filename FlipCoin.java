import java.util.*;
public class FlipCoin{
	public static void main(String args[]){
		int num,i;
		int t=0;
		int h=0;
		float per,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("The number of times to Flip Coin: ");
		num=sc.nextInt();
		for(i=0;i<num;i++){
			if(Math.random()<0.5){
				t++;
			}
			else{
				h++;
			}
		}
		System.out.println("head "+h);
		System.out.println("tail "+t);
		per = (h*100)/num;
		System.out.println("head percentage "+per);
		per = (t*100)/num;
		System.out.println("tail percentage "+per);
	}
}