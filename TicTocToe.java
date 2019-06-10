import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class TicTocToe{
    static char Arr[][]= new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    static int k=1,x,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count=0,count8=0;
    static int win[]=new int[]{0,0} ;
    public static void main(String arg[]){
        System.out.println("The Tic Toc Toe Game:");

         Scanner sc = new Scanner(System.in);
         //Random rand=new Random();
         display();
        do{
            if(count==9){
                break;
            }
            
            getValueFromUser();
            display();
            //getvalueFromCommputer();
            check();
            System.out.println("count1"+count1);
            System.out.println("count2"+count2);
            System.out.println("count3"+count3);
            System.out.println("count4"+count4);
            System.out.println("count5"+count5);
            System.out.println("count6"+count6);
            System.out.println("count7"+count7);
            System.out.println("count8"+count8);
            System.out.println("count"+count);

            if(count1==3 || count2==3 || count3==3 || count4==3 || count5==3 || count6==3 || count7==3)
            {
                win[0]=1;
                break;
            }
            count++;
        }while(win[0] !=1 || win[1] !=1);
        if(win[0]==1){
            System.out.println("The user win the match");
        }
        else if(win[1]==1){
            System.out.println("The computer win the match");
        }
        else{
            System.out.println("The match draw");
        }
        sc.close();
    }
    public static void display(){
    
        System.out.println();
        for(int i=0; i<3 ;i++){
            for(int j=0; j<3; j++){
                System.out.print("|"+Arr[i][j]);      
            }
            System.out.println("|");
         }
        System.out.println();
         
   }




   //Getting value or input from user
    public static void getValueFromUser(){
        do{
            System.out.println("Enter your position:");
            //Scanner sc = new Scanner(System.in);
            Random rand=new Random();
            x=rand.nextInt(10);
            System.out.println(x);
            switch(x){
                case 1:
                    if(Arr[0][0]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[0][0]='x';
                    break;
                case 2:
                    if(Arr[0][1]=='x'){
                       getValueFromUser(); 
                    }
                    Arr[0][1]='x';
                    break;
                case 3:
                   if(Arr[0][2]=='x'){
                        getValueFromUser(); 
                     }
                    Arr[0][2]='x';
                    break;
                case 4:
                   if(Arr[1][0]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[1][0]='x';
                    break;
                case 5:
                    if(Arr[1][1]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[1][1]='x';
                    break;  
                case 6:
                    if(Arr[1][2]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[1][2]='x';
                    break;  
                case 7:
                    if(Arr[2][0]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[2][0]='x';
                    break;
                case 8:
                    if(Arr[2][1]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[2][1]='x';
                    break;
                case 9:
                    if(Arr[2][2]=='x'){
                        getValueFromUser(); 
                    }
                    Arr[2][2]='x';
                    break;
                default:
                    System.out.println("Please Enter position in between 0-9:");

            }
        }while(x < 1 || x > 9);
       
        //display();
    }







    static void check(){
        System.out.println("inside check");
        
                if((Arr[0][0]=='x') || (Arr[0][1]=='x') || (Arr[0][2]=='x')){
                    count1++;
                    //break;
                 } 
                 else if((Arr[0][0])=='x' || (Arr[1][0])=='x' || (Arr[2][0])=='x'){
                     count2++;
                     //break;
                }else if((Arr[0][0])=='x' || (Arr[1][1])=='x' || (Arr[2][2])=='x'){                                //else if((Arr[i][j]=='x' && i==j))
                    count3++;
                }else if((Arr[1][0]=='x') || (Arr[1][1]=='x') || (Arr[1][2]=='x')){
                    count4++;
                }else if((Arr[2][0]=='x') || (Arr[2][1]=='x') || (Arr[2][2])=='x'){
                    count5++;
                }else if(Arr[0][1]=='x' || (Arr[1][1])=='x' || (Arr[2][1])=='x'){
                    count6++;        
                }else if(Arr[0][2]=='x' || (Arr[1][2])=='x' || (Arr[2][2])=='x'){
                    count7++;
                }else if(Arr[2][0]=='x' || (Arr[1][1])=='x' || (Arr[0][2])=='x'){
                    count8++;
                }
            }
 }
