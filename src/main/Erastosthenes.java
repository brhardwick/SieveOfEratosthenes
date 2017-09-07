package main;

public class Erastosthenes {
	public int Max;
	public boolean[] PrimeTable;
	
	///The constructor takes the max number to look for in primes
    public Erastosthenes(int max) {        
    	Max = max+2;
    	PrimeTable = new boolean[Max];
    	for(int x = 1; x < Max ; x++)
    	{
    		PrimeTable[x] = true;
    	}
    	CycleNumbers();
    }
    
    ///Cycles through each number, calling the MarkByIncrementing function
    private void CycleNumbers()
    {
    	
    	for(int x = 2; x < PrimeTable.length; x++)
    	{
    		if(PrimeTable[x] == false)
    			continue;
    		else
    			MarkByIncrementing(x);
    	}
    }
    
    ///Changes the state of each index based off of incrementing through by an incrementor. 
    ///It is basically taking each number and removing its multiples from the list of primes in a brute force format
    ///Takes the number to increment (which is also used as the starting index)
    ///Returns nothing, updates the Prime Table
    private void MarkByIncrementing(int incrementor)
    {
    	for(int x = incrementor+incrementor; x < PrimeTable.length ; x += incrementor)
    	{
    		PrimeTable[x] = false;
    	}
    }
    
    ///Outputs the result of the calculation.
    ///Parameters: none;
    ///Returns: none;
    public void Print()
    {
    	
    	for(int x = 2 ; x < PrimeTable.length ; x ++)
    	{
    		if(PrimeTable[x])
    		System.out.print(Integer.toString(x) + " ");	
    	}
    }
    
}
