// ///////////////////////////////////////////
//  Purpose : Given N distinct Coupon Numbers, how many random numbers do you
//                  need to generate distinct coupon number? This program simulates this random
//                  process.
// @Author  : Mahesh Aurad
// Date     : 14 june 2019
// Input    : 6
// Output   : The distinct copen are : 2 5 3 1 4 6
// Output   : The Number of times random function call : 16
// ///////////////////////////////////////////




import java.util.Scanner;
import java.util.Random;

class coupan{
    public static int noOfCoupen,random1=0,loopCounter=0,distinctCoupenCount = 0;
    public static int randomNumberCount;
    static int coupenArray[];
    Random randomObj = new Random();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of Coupen");
         noOfCoupen = sc.nextInt();
        
         coupenArray = new int[noOfCoupen];  //array of coupens
         
        System.out.println("randon numbers:");
        Random randomObj = new Random();
        getDistinctCoupenFromRandomValues(noOfCoupen,randomObj);
        display();                                                                          
        sc.close();
    }

    //get distinct coupen from random values
   public static void getDistinctCoupenFromRandomValues(int noOfCoupen,Random randomObj){
        int loopCounter=0,randomNumber=0;
   
        for(loopCounter=0;loopCounter<noOfCoupen;loopCounter++){
            int temp=0;
            randomNumber = randomObj.nextInt(noOfCoupen);
            randomNumberCount++;
            
            for(int j=0;j<=loopCounter;j++){
                if(coupenArray[j]== randomNumber){
                    temp++;
                    break;
                }
                
            }
            if(temp==0)                            //check for the 
            {
               
                coupenArray[distinctCoupenCount]=randomNumber;
                distinctCoupenCount++;
            }
            loopCounter=distinctCoupenCount;
        }      
    }

    //display which display the disticnt coupen 
    public static void display(){
        System.out.println("No.of coupen generated"); 
        for(loopCounter=0;loopCounter<distinctCoupenCount;loopCounter++){
            System.out.println(coupenArray[loopCounter]);
        }
        distinctCoupenCount++;
       
        System.out.println(noOfCoupen);
        System.out.println("The nuber of times random function call are:"+randomNumberCount);
        System.out.println("The nuber of coupens are:"+distinctCoupenCount);
    }
}