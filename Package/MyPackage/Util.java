package MyPackage;

public class Util{
    static int loopCounter=0,Checkcount=1;
    public static int integerArray[] = new int[26];
    public static boolean Anagram(String firstString,String secondString){
        int lengthOfFirstString=firstString.length();
		int lengthOfSecondString=secondString.length();
		 
		if(lengthOfFirstString!=lengthOfSecondString){
			
			System.out.println("It is not anagram");
			return false;
		}
		char chArrayOfFirstString[]=firstString.toCharArray();
		char chArrayOfSecondString[]=secondString.toCharArray();
		
		while(loopCounter<lengthOfFirstString)
		{
			for(int j=0;j<26;j++) {
				if((chArrayOfFirstString[loopCounter]-65==j)||(chArrayOfFirstString[loopCounter]-97==j)) {
					integerArray[loopCounter]++;	
				}
			}
			loopCounter++;
		}
		loopCounter=0;
		while(loopCounter<lengthOfSecondString)
		{
			for(int j=0;j<26;j++) {
				if((chArrayOfSecondString[loopCounter]-65==j)||(chArrayOfSecondString[loopCounter]-97==j)) {
					integerArray[loopCounter]--;	
				}
			}
			loopCounter++;
		}
		for(int j=0;j<26;j++)
		{
			if(integerArray[loopCounter]!=0)
			{
				Checkcount++;
				break;
			}
		}
		if(Checkcount==1) {
			System.out.println("it is anagram");
            return true;
		}
		else
		{
			System.out.println("it is anagram");
            return false;
		}
    }
    
}