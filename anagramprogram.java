import java.util.Scanner;
import java.util.Date;
import java.sql.Timestamp;
//import java.lang.*;
public class anagramprogram {
	static int length1;
	static int length2;
	static int i=0,j=0,count=0;
	
	static int arr[]=new int[26];
	public static void main(String arg[]) {
		System.out.println("Enter first string:");

		//Scanner sobj = new Scanner(System.in);
		Scanner sobj = new Scanner(System.in);
		String str1;
		
		Date date=new Date();
		
		long  time=date.getTime();
		

		System. out. println("Time in Milliseconds: " + time);
		str1= sobj.nextLine();
		System.out.println("Enter second string:");
		String str2; 
		str2= sobj.nextLine();
		length1=str1.length();
		length2=str2.length();
		//if(str1.length().equals(str2.length())) 
		if(length1!=length2){
			
			System.out.println("It is not anagram");
			return;
		}
		char chArr1[]=str1.toCharArray();
		char chArr2[]=str1.toCharArray();
		
		while(i<length1)
		{
			for(j=0;j<26;j++) {
				if((chArr1[i]-65==j)||(chArr1[i]-97==j)) {
					arr[i]++;	
				}
			}
			i++;
		}
		i=0;
		while(i<length2)
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

	}
	

}
