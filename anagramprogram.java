import java.util.Scanner;
import java.util.Date;
import java.sql.Timestamp;

public class anagramprogram {
	static int lengthOfFirstString;
	static int lengthOfSecondString;
	static int i=0,j=0,count=0;
	
	static int arr[]=new int[26];
	public static void main(String arg[]) {
		System.out.println("Enter first string:");

		//Scanner sobj = new Scanner(System.in);
		Scanner sobj = new Scanner(System.in);
		String stringFirst;
		
		Date date=new Date();
		
		long  time=date.getTime();
		

		System. out. println("Time in Milliseconds: " + time);
		stringFirst= sobj.nextLine();
		System.out.println("Enter second string:");
		String stringSecond; 
		stringSecond= sobj.nextLine();
		lengthOfFirstString=stringFirst.length();
		lengthOfSecondString=stringSecond.length();
		//if(stringFirst.length().equals(stringSecond.length())) 
		if(lengthOfFirstString!=lengthOfSecondString){
			
			System.out.println("It is not anagram");
			//return;
		}
		char chArr1[]=stringFirst.toCharArray();
		char chArr2[]=stringFirst.toCharArray();
		
		while(i<lengthOfFirstString)
		{
			for(j=0;j<26;j++) {
				if((chArr1[i]-65==j)||(chArr1[i]-97==j)) {
					arr[i]++;	
				}
			}
			i++;
		}
		i=0;
		while(i<lengthOfSecondString)
		{
			for(j=0;j<26;j++) {
				if((chArr2[i]-65==j)||(chArr2[i]-97==j)) {
					arr[i]--;	
				}
			}
			i++;
		}
		for(j=0;j<26;j++)
		{
			if(arr[i]!=0)
			{
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("it is anagram");
		}
		else
		{
			System.out.println("it is anagram");
		}
		long time1=date.getTime();
		System. out. println("Time in Milliseconds: " + time1);
		long time2;
		time2=time1-time;
		System. out. println("Time in Milliseconds: " + time2);
		sobj.close();

	}
	

}
