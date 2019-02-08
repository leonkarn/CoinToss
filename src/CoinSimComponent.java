// Name:Leonidas Karnesis
// USC NetID:5332632819
// CS 455 PA1
// Spring 2018
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
public class CoinSimComponent extends JComponent {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int numtrials;	
 private static final int vb=50;
 private static final int bw=60;// width of each bar
 
CoinTossSimulator coin= new CoinTossSimulator(2);

 
  
	public CoinSimComponent(int trials) {
		numtrials=trials;
		coin.run(numtrials);
		
	}
	
	
	 
	public void paintComponent(Graphics g)	{
	
	Graphics2D g2= (Graphics2D) g;
			
		
			
	//location of the left side of the bar
	    int w=(getWidth()-3*bw)/4;
		int leftheads=getWidth()-3*w-3*bw;
		int leftheadtail=getWidth()-2*w-2*bw;
		int lefttails=getWidth()-w-bw;
		
		
		
		//bar heights
		int heightheads=coin.getTwoHeads();
		int heightheadtail=coin.getHeadTails();
		int heighttails=coin.getTwoTails();
		
		//scale
		double scale= (double)(getHeight()-2*vb)/coin.getNumTrials();
		
		
		
		//bottom location of the label
		int botHeads=getHeight()-vb ;
		int botHeadTail=getHeight()-vb; 
		int botTails=getHeight()-vb;
		
		//Creating the strings of the percentages for the three labels
		int H=(coin.getTwoHeads()*100/(coin.getNumTrials()));
		int HT=(coin.getHeadTails()*100/(coin.getNumTrials()));
		int T=(coin.getTwoTails()*100/(coin.getNumTrials()));
		Integer.toString(H);
		Integer.toString(HT);
		Integer.toString(T);
		
		//Bar objects					
		Bar twoHeads=new Bar(botHeads,leftheads,bw,heightheads,scale,Color.RED,"Two Heads:"+coin.getTwoHeads()+"("+H+"%)");
		Bar HeadTail=new Bar(botHeadTail,leftheadtail,bw,heightheadtail,scale,Color.GREEN,"A Head and a Tail:"+coin.getHeadTails()+"("+HT+"%)");
		Bar twoTails=new Bar(botTails,lefttails,bw,heighttails,scale,Color.BLUE,"Two Tails:"+coin.getTwoTails()+"("+T+"%)");
		
		//drawing the bars	
		twoHeads.draw(g2);
		twoTails.draw(g2);
		HeadTail.draw(g2);
	}
	
	  

}