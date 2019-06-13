// ///////////////////////////////////////////
// ///Programme: Check Leap Year 
// ///Author   : Mahesh Aurad
// ///Date     : 13 june 2019
// ///Input    : 2016
// ///Output   : 2016 is a leap year
// ///////////////////////////////////////////


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
	
	Scanner sObj=new Scanner(System.in);
	System.out.println("Enter year:");
	int year = sObj.nextInt(); 
       
        boolean leap = false;
	
        if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
            leap = true;
        }
        else{
            leap = false;
        }

        if(leap){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
