
import java.util.*;
public class Harmonic{
	public static void main(String[] args){
		double sum=0.0,temp;
		int i,	a = 4;
		for(i=1;i<=a;i++){	
			System.out.print(""+(1.0/i)+" + ");
			sum = sum + (1.0/i);
		}
		System.out.println("NoSuchMethodException harmonic term is "+sum);
	}
}

