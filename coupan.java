import java.util.*;
import java.lang.*;
class coupan{
    public static void main(String[] args) {
        
        int random1;
        int count=0;
        int i;
        System.out.println("Enter number of Coupen");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        int coupen[] = new int[n];
         
          System.out.println("randon numbers:");
        int randonCount=0;
        for(i=0;i<n;i++){
            random1 = rand.nextInt(n);
            System.out.println(random1);
            randonCount++;
            int k=-1;
            for(int j=0;j<=i;j++){
                 if(coupen[j]== random1){
                    
                    break;
                }
                k++;
            }
            if(i==k)
            {
               
                coupen[count]=random1;
               count++;
            }
            i=count;
            
        }      
        System.out.println("No.of coupen generated"); 
        for(i=0;i<count;i++){
            
            System.out.println(coupen[i]);
        }
        count++;
        System.out.println(n);
        System.out.println("The nuber of times random function call are:"+randonCount);
           System.out.println("The nuber of coupens are:"+count);

    }
}