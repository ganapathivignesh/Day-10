package com.enu;

import java.util.Scanner;

public class Weight {
	
	
	public enum Planet
	{
		MERCURY(3.70),
		
		VENUS(8.87),
		EARTH(9.8),
		MARS(3.711),
		JUPITER(24.79),
		NEPTUNE(11.15),
		URANUS(8.87);
		double value;
		
		
		private Planet(double value)
		{
			this.value=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.MERCURY");
			System.out.println("2.VENUS");
			System.out.println("3.MARS");
			System.out.println("4.JUPITER");
			System.out.println("5.NEPTUNE");
			System.out.println("6.URANUS");
			System.out.println("7.EARTH");
			System.out.println("8.exit");
			
			System.out.println("enter ur choice");
			ch=sc.nextInt();
			System.out.println("enter mass");
			double mass=sc.nextDouble();
			double wt;
			
			
			switch(ch)
			{
			case 1:
				wt=(double)mass*Planet.MERCURY.value;
				System.out.println("weight on mercury"+" "+wt);
				break;
				
			case 2:
				wt=(double)mass*Planet.VENUS.value;
				System.out.println("weight on venus"+" "+wt);
				break;
				
			case 3:
				wt=(double)mass*Planet.MARS.value;
				System.out.println("weight on mars"+" "+wt);
				break;
				
			case 4:
				wt=(double)mass*Planet.JUPITER.value;
				System.out.println("weight on jupiter"+" "+wt);
				break;
				
			case 5:
				wt=(double)mass*Planet.NEPTUNE.value;
				System.out.println("weight on neptune"+" "+wt);
				break;
				
			case 6:
				wt=(double)mass*Planet.URANUS.value;
				System.out.println("weight on uranus"+" "+wt);
				break;
				
			case 7:
				wt=(double)mass*Planet.EARTH.value;
				System.out.println("weight on earth"+" "+wt);
				break;
				
			case 8:
				break;
				
				
				default:
					System.out.println("invalid");
			}
		}while(ch!=9);
			
			
			
	}
			
}
		

	


