// ///////////////////////////////////////////
//  Purpose : Flip coin and print percentage of heads and tails 
// @Author  : Mahesh Aurad
// Date     : 14 june 2019
// Input    : The number of times flip coin:4
// Output   : Percentage of heads=75.00% vs tails=25.00%(head=3,tails=1)
// ///////////////////////////////////////////



import java.util.*;
public class Factor{
	public int a;


	Factor(int ino){
		a=ino;
	}
	void PrimeFact(){
		int icnt=0;
		for(int i=2;i<=a/2;i++){
			if(a%i == 0){
				for(int j=2;j<i;j++){
					if(i%j==0){
						icnt++;
						
					}
					}
				if(icnt==0){
					System.out.println(i);
					
				}
				icnt=0;

				//System.out.println(i);

			}
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		Factor Fobj = new Factor(a);
		Fobj.PrimeFact();
		/*int icnt=0;
		for(int i=2;i<=a/2;i++){
			if(a%i == 0){
				for(int j=2;j<i;j++){
					if(i%j==0){
						icnt++;
						
					}
				}
				if(icnt==0){
					System.out.println(i);
					
				}
				icnt=0;

				//System.out.println(i);

			}
		}*/
	}
}
