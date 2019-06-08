import java.util.Scanner;
import java.lang.*;

public class StringPermutations{
    static int count=0;
    static int n,k;
    static int count1=0;
    static String[] strArray = new String[100];
    static String[] strArray1 = new String[100]; 
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        n=str.length();
        System.out.println("length of string is : "+n);
        StringPermutations sp = new StringPermutations();
        sp.permute(str,0,n-1);
        
        System.out.println("combinations are:");
        for(int i=0;i<count-1;i++){
            k=0;
            for(int j=0;j<count;j++){
                 if(strArray[i].equals(strArray[j])){
            //        System.out.println("sTRING IS SAME"+i+" "+strArray[i]);
                    //break;
                    break;         
                }
                k++;
            }
            if(k==i)
            {
                 strArray1[count1]=strArray[i];
                   count1++;
            }
          //  System.out.println(strArray[i]);
        }

            System.out.print("[");
        for(int i=0;i<count1;i++){
            System.out.print(strArray1[i]+"\t");
            
        }
        System.out.print("]");
         System.out.println(count);
   
    }
    private void permute(String str,int start,int end){
        int k=0,i=0;
        
    
        if(start == end){
            //System.out.println(str);
             //System.out.println(strArray.length);
            strArray[count]=str;
            count++;
               
             ///this loop will find the unique string from string combinations
            // for(i = 0;i<count1;i++){
            //     if(count1==0)
            //     {
            //         System.out.println("inside count"+strArray[count]);
            //         strArray[count1]=str;
            //         break;
            //     }
            //      if(strArray[i].equals(str)){
            //         //System.out.println("sTRING IS SAME"+i+" "+strArray[i]);
            //         break;         
            //     }
            //     k++;
            //     // System.out.println("inside for loop");
            // }
            // if(count1==0){
            //     count1++;
            // }
            // else
            // if(k==i){
            //     strArray[count1]=str;
            //    System.out.println(strArray[count1]);
            //     count1++;
            // }
        }
        else{
            for( i=start;i<=end;i++){
                str=swap(str,start,i);
                permute(str,start+1,end);
                str=swap(str,start,i);
               
            }
            //System.out.println(count);
        }
        
    }
    public String swap(String s,int i,int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp= charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);

    }
}
