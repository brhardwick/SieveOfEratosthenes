package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {
    public static void main(String[] args) {
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	int x = 1/0;    	
    	try {
    		String max;
    		if(args.length>0 && args != null)
    			max = args[0];
    		else
    		{
    			System.out.print("Please enter a max number to look for primes: ");
    			max = reader.readLine();
    		}
			if(IsInt(max))
			{
				
				int MaxPrimes = Integer.parseInt(max);
				if(MaxPrimes<2)
				{
					System.out.print("Please enter a prime greater than 1.");
					return;
				
				}
				System.out.print("The primes less than or equal to "+ max + ": ");
				Erastosthenes e = new Erastosthenes(MaxPrimes);
		        e.Print();
			}
			else
			{
				System.out.print("Cannot convert to integer");
			}
		} catch (Exception e1) {
			
			e1.printStackTrace();
		} 	
    }
    
    static boolean IsInt(String s)
    {
    	try {
    		Integer.parseInt(s);
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    }
}
