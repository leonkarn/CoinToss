// Name:Leonidas Karnesis
// USC NetID:5332632819
// CS 455 PA1
// Spring 2018
public class CoinTossSimulatorTester {
	public static void main(String[] args) {
	CoinTossSimulator coin= new CoinTossSimulator(2);
	
	System.out.println("After constructor:");
	System.out.println("Number of trials[exp:0]");
	System.out.println("Two-head tosses: 0");
	System.out.println("Two-tail tosses: 0");
	System.out.println("One-head one-tail tosses: 0");
	
	System.out.println("");
	
	coin.run(1);
	System.out.println("After run(1)");
	System.out.println("Number of trials [exp:1]"+coin.getNumTrials());
	System.out.println("Two-head tosses: "+coin.getTwoHeads());
	System.out.println("Two-tail tosses: "+coin.getTwoTails());
	System.out.println("One-head one-tail tosses:" +coin.getHeadTails());
	System.out.println("Tosses add up corectly ?"+coin.correct());
	System.out.println("");
	

	coin.run(10);
	System.out.println("After run(10)");
	System.out.println("Number of trials [exp:11]"+coin.getNumTrials());
	System.out.println("Two-head tosses: "+coin.getTwoHeads());
	System.out.println("Two-tail tosses: "+coin.getTwoTails());
	System.out.println("One-head one-tail tosses:" +coin.getHeadTails());
	System.out.println("Tosses add up corectly ?"+coin.correct());
	System.out.println("");
	
	
	coin.run(100);
	System.out.println("After run(100)");
	System.out.println("Number of trials [exp:111]"+coin.getNumTrials());
	System.out.println("Two-head tosses: "+coin.getTwoHeads());
	System.out.println("Two-tail tosses: "+coin.getTwoTails());
	System.out.println("One-head one-tail tosses:" +coin.getHeadTails());
	System.out.println("Tosses add up corectly ?"+coin.correct());
	System.out.println("");
	
	//reset
	coin.reset();
	System.out.println("After reset:");
	System.out.println("Number of trials [exp:0]"+coin.getNumTrials());
	System.out.println("Two-head tosses: "+coin.getTwoHeads());
	System.out.println("Two-tail tosses: "+coin.getTwoTails());
	System.out.println("One-head one-tail tosses:" +coin.getHeadTails());
	System.out.println("Tosses add up corectly ?"+coin.correct());
	System.out.println("");
	
	coin.run(1000);
	System.out.println("After run(1000):");
	System.out.println("Number of trials [exp:1000]"+coin.getNumTrials());
	System.out.println("Two-head tosses: "+coin.getTwoHeads());
	System.out.println("Two-tail tosses: "+coin.getTwoTails());
	System.out.println("One-head one-tail tosses:" +coin.getHeadTails() );
	System.out.println("Tosses add up corectly ?"+coin.correct());
	System.out.println("");
}
}