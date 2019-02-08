// Name:Leonidas Karnesis
// USC NetID:5332632819
// CS 455 PA1
// Spring 2018
import javax.swing.JFrame;
import java.util.Scanner;
public class CoinSimViewer {
private static Scanner in;

public static void main(String[] args)
{
	in = new Scanner(System.in);
	JFrame frame= new JFrame();
	frame.setSize(800,500);
	frame.setTitle("CoinSim");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

 
System.out.println("Give number of trials");
int trials=in.nextInt();

while (trials<1) {
	System.out.println("ERROR:Number entered must be greater than 0");

	System.out.println("Enter number of trials");
	trials=in.nextInt();}
	
CoinSimComponent c2=new CoinSimComponent(trials);
frame.add(c2);
frame.setVisible(true);
	
	}}

