// Name:Leonidas Karnesis
// USC NetID:5332632819
// CS 455 PA1
// Spring 2018

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
import java.util.Random;
public class CoinTossSimulator {
	private Random generator;
	private int sides;
	private int tails;
	private int heads;
	private int tailhead;
	private int total;
    


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator(int s) {
		sides=s;
		generator=new Random();
       
   }


	
   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */

   //if the program run correctly it will return true
public boolean correct() {
	if (total==heads+tails+tailhead) return true;
	else return false;
}

public void run(int numTrials) {
	int x = total;
	total = total + numTrials;
		//suppose that number 1 is head and number 2 is tails
		for (int i = x +1; i<=total; i++) {
		int c1 = 1+ generator.nextInt(sides);
		int c2 = 1+ generator.nextInt(sides);
 	if (c1==1 && c2==1) {heads++ ;}
 	else if (c1==2 && c2==2 ) {tails++ ;}
 	else  {tailhead++ ;} }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
	  
       return total; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
	   
	   
       return heads; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
	   
   
       return tails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
	    
       return tailhead; // DUMMY CODE TO GET IT TO COMPILE
   }
   
   
   
   
   


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   tails=0;
	   heads=0;
	   tailhead=0;
	   total=0;

   }

}