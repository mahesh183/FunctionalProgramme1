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
    static int DistinctPermutationCount=0,k;           //
    static int lenght,newlenght=0;
    static int count1=0;
    static int factorial=1,possiblePermuatationlenght;
   static String[] distinctPermutationStringArray = new String[10000];

    public static void main(String arg[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String inputString=sc.nextLine();
        lenght=inputString.length();
        possiblePermuatationlenght = lenght;
        while(possiblePermuatationlenght != 0){
            factorial = factorial*possiblePermuatationlenght;
            possiblePermuatationlenght--;
        }
        possiblePermuatationlenght = factorial;
       
        

        System.out.println("length of input string is : "+lenght);
        StringPermutations stringPermutation = new StringPermutations();

       try{
        System.out.println("Distinct permutations are:");
        System.out.print("[");
        stringPermutation.permute(inputString,0,lenght-1);
        System.out.print("]");
        System.out.println("number of distinct permuatations are:"+DistinctPermutationCount);
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The index you have entered is invalid");
        System.out.println("Please enter an index number between 0 and 6");
       }
       
       // stringPermutation.distinctPermutations();
        
         sc.close();
   
    }
     /** 
     * permutation method 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String paramString,int start,int end){
        int i=0,icnt=1;
        if(start == end){
            
            for(i=0;i<newlenght;i++){
                if(distinctPermutationStringArray[i].equals(paramString)){
                    icnt++;
                    break;
                }
            }
            if(newlenght==0){
                distinctPermutationStringArray[newlenght] = paramString;
                System.out.print(distinctPermutationStringArray[newlenght]+"\t");
                newlenght++;
                DistinctPermutationCount++;
                icnt++;
            }else if(icnt==1){
                distinctPermutationStringArray[newlenght] = paramString;
                System.out.print(distinctPermutationStringArray[newlenght]+"\t");
                newlenght++;
                DistinctPermutationCount++;
            }
        }
        else{
            for( i=start;i<=end;i++){
                paramString=swap(paramString,start,i);
                permute(paramString,start+1,end);
                paramString=swap(paramString,start,i);
               
            }
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

    // public void distinctPermutations(){
    //     for(int i=0;i<count-1;i++){
    //         k=0;
    //         for(int j=0;j<count;j++){
    //              if(permutationsStringArray[i].equals(permutationsStringArray[j])){
    //                 break;         
    //             }
    //             k++;
    //         }
    //         if(k==i)
    //         {
    //             distinctPermutationStringArray[count1]=permutationsStringArray[i];
    //                count1++;
    //         }
    //     }

    //         System.out.print("[");
    //     for(int i=0;i<count1;i++){
            
    //         System.out.print(distinctPermutationStringArray[i]+"\t");
    //     }
    //     System.out.print("]");
    //      System.out.println(count);

    // }
}
// import java.util.Scanner;
// // Java program to print all permutations of a 
// // given string. 
// public class StringPermutations { 
//     public static void main(String[] args) 
//     { 
//         String str = "ABC"; 
//         int n = str.length(); 
//         StringPermutations permutation = new StringPermutations(); 
//         permutation.permute(str, 0, n - 1); 
//     } 
  
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
//     private void permute(String str, int l, int r) 
//     { 
//         if (l == r) 
//             System.out.println(str); 
//         else { 
//             for (int i = l; i <= r; i++) { 
//                 str = swap(str, l, i); 
//                 permute(str, l + 1, r); 
//                 str = swap(str, l, i); 
//             } 
//         } 
//     } 
  
//     /** 
//      * Swap Characters at position 
//      * @param a string value 
//      * @param i position 1 
//      * @param j position 2 
//      * @return swapped string 
//      */
//     public String swap(String a, int i, int j) 
//     { 
//         char temp; 
//         char[] charArray = a.toCharArray(); 
//         temp = charArray[i]; 
//         charArray[i] = charArray[j]; 
//         charArray[j] = temp; 
//         return String.valueOf(charArray); 
//     } 
// } 
  
// // This code is contributed by Mihir Joshi 