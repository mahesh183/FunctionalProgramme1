import MyPackage.Util;
import java.util.Scanner;
class AnagramProgramme{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);
        boolean checkAnagram=false;
        System.out.println("Enter the First String:");
        String firstString=sObj.nextLine();

        System.out.println("Enter the Second String:");
        String secondString=sObj.nextLine();

        checkAnagram=Util.Anagram(firstString,secondString);
        
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