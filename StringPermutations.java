// ///////////////////////////////////////////
// ///Programme: String Permutations 
// ///Author   : Mahesh Aurad
// ///Date     : 12 june 2019
// ///Input    : abba
// ///Output   : [abba,abab,aabb,baba,baab,bbaa]
// ///////////////////////////////////////////

// //import package Scanner for input from user 
import java.util.Scanner;

public class StringPermutations{
    static int DistinctPermutationCount=0,k;           //count number of distinct permuatations
    static int lenght,newlenght=0;                     //lenght of the input string,newlenght is lenght of the disticnt permutation array of string
    static int factorial=1,possiblePermuatationlenght; //factorial of the lenght of the string for dynamic array length and set it to possiblePermuatationlenght 
   static String[] distinctPermutationStringArray = new String[10000]; //array of string for distinct string permutations

    public static void main(String arg[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");  //get input string from user
        String inputString=sc.nextLine();
        lenght=inputString.length();
        possiblePermuatationlenght = lenght; //set that lenght to possiblePermuatationlenght

        //get possible lenght of combinataion of input string 
        while(possiblePermuatationlenght != 0){
            factorial = factorial*possiblePermuatationlenght;
            possiblePermuatationlenght--;
        }
        possiblePermuatationlenght = factorial;  //after getting the possible length of combination of string set to  possiblePermuatationlenght
       
        System.out.println("length of input string is : "+lenght);
        StringPermutations stringPermutationObj = new StringPermutations();

       try{
        System.out.println("Distinct permutations are:");
        System.out.print("[");
        stringPermutationObj.permute(inputString,0,lenght-1);
        
        for(int i=0;i<newlenght;i++){
            System.out.print(distinctPermutationStringArray[i]+"\t");
        }

        System.out.println("]");
        System.out.println("number of distinct permuatations are:"+DistinctPermutationCount);
       
    
        }
        //if the exception occer then it catch into the catch block
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The index you have entered is invalid");
        System.out.println("Please enter an index number between 0 and 6");
       }
         sc.close(); //close the allocated resource
   
    }
     /** 
     * permutation method 
     * @paramstr string to calculate permutation for 
     * @param start starting index 
     * @param end end index 
     */
    private void permute(String paramString,int start,int end){
        int i=0;
        if(start == end){
            getDistinctString(paramString);
        }
        else{
            for( i=start;i<=end;i++){
                paramString=swap(paramString,start,i);
                permute(paramString,start+1,end);
                paramString=swap(paramString,start,i);
               
            }
        }
        
    }

/** 
     * Swap Characters at position 
     * @param string string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
*/

    public String swap(String string,int i,int j){
        char temp;
        char[] charArray = string.toCharArray();
        temp= charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);

    }

/**
    * get distinct string from permutaions  
     * @param paramString string value 
*/
    
    public static void getDistinctString(String paramString){
        int i=0,icnt=1;
        for(i=0;i<newlenght;i++){   
            if(distinctPermutationStringArray[i].equals(paramString)){
                icnt++;
                break;
            }
        }
        if(newlenght==0){
            distinctPermutationStringArray[newlenght] = paramString;
            //System.out.print(distinctPermutationStringArray[newlenght]+"\t");
            newlenght++;
            DistinctPermutationCount++;
            icnt++;
        }else if(icnt==1){
            distinctPermutationStringArray[newlenght] = paramString;
            //System.out.print(distinctPermutationStringArray[newlenght]+"\t");
            newlenght++;
            DistinctPermutationCount++;
        }
    }
}

// End of the programme
    