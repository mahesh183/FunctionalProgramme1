import java.util.Scanner;
public class StringPermutation{
    static int count=0;
    static int n;
    static int count1=0;
    static String[] strArray = new String[n]; 
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        n=str.length();
        System.out.println("length of string is : "+n);
        StringPermutation sp = new StringPermutation();
        sp.permute(str,0,n-1);

        System.out.println(count);
   
    }
    private void permute(String str,int start,int end){

        if(start == end){
            System.out.println(str);
            count++;
            for(int i = 0;i<strArray.length;i++){
                if(strArray[i] != str){
                    strArray[count1] = str;
                    System.out.println(strArray[count1]);
                    count1++;
                }
                else{
                    System.out.println("Inside break");
                    break;
                }    
            }
        }
        else{
            for(int i=start;i<=end;i++){
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
