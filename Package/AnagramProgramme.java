import MyPackage.Util;
import java.util.Scanner;
import java. sql. Timestamp;
import java.util.Date;

class AnagramProgramme{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);
        boolean checkAnagram=false;
        Date date=new Date();
        long time = date. getTime();
        System. out. println("Time in Milliseconds : "+time);
        Timestamp ts = new Timestamp(time); 
        System. out. println("Current Time Stamp 1: "+ts);
        System.out.println("Enter the First String:");
        String firstString=sObj.nextLine();

        System.out.println("Enter the Second String:");
        String secondString=sObj.nextLine();

        checkAnagram=Util.Anagram(firstString,secondString);
        long time1 = date. getTime();
        System. out. println("Current Time Stamp 2: "+ts);
        System. out. println("Time in Milliseconds 1: "+time1);
        if(checkAnagram==true)
        {
            System.out.println("The given string are anagram");
        }
        else
        {
            System.out.println("The given string are not anagram");
        }
    }
}