import java.io.*;
import java.util.*;
public class TestDriver extends GasPump
{
public static void main(String args[]) throws IOException
	{
		GasPump g=new GasPump();
		float a,b,d,cash;
		int gs;
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tCS 589: FALL 2015");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   PROJECT ");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tROSHNI MASAND");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   A20355488 ");
		System.out.print("Press enter to continue");
		sc.nextLine();
		int i=0;
		int k;
		while(i==0)
		{
		System.out.println("Test Driver for GasPump Class");
		System.out.println("1. Activate");
		System.out.println("2. PayCredit");
		System.out.println("3. Reject");
		System.out.println("4. Approved");
		System.out.println("5. PayCash");
		System.out.println("6. Cancel");
		System.out.println("7. Regular");
		System.out.println("8. Super");
		System.out.println("9. Diesel");
		System.out.println("10. StartPump");
		System.out.println("11. PumpLiter");
		System.out.println("12. StopPump");
		System.out.println("13. NoReceipt");
		System.out.println("14. Receipt");
		System.out.println("15. TurnOff");
		System.out.println();
		System.out.println();
		System.out.println("Testing Related Methods");
		System.out.println("16. ShowState");
		System.out.println("17. ShowPrice");
		System.out.println("18. ShowW");
		System.out.println("19. Number of Gallons Pumped");
		System.out.println("20. Quit");
		System.out.println("Please select the operation");
		
		x=sc.nextInt();
		
		switch(x)
		{
			case 1: 
			System.out.println("GasPump Class");
			System.out.println("Activate(float a,float b,float d) method");
			System.out.println();
			System.out.println("Enter R Price");
			a=sc.nextFloat();
			System.out.println("Enter S Price");
			b=sc.nextFloat();
			System.out.println("Enter D Price");
			d=sc.nextFloat();
			System.out.println("The returned value is: "+g.Activate(a,b,d));
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			
			case 2:
			System.out.println("GasPump Class");
			System.out.println("PayCredit() method"); 
			System.out.println();
			System.out.println("The returned value is: "+g.PayCredit());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			
			case 3: 	
			System.out.println("GasPump Class");
			System.out.println("Reject() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Reject());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			
			case 4:
			System.out.println("GasPump Class");
			System.out.println("Approved() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Approved());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;


			case 5:
			System.out.println("GasPump Class");
			System.out.println("PayCash(float c) method");
			System.out.println();
			System.out.println("Enter Cash");
			cash=sc.nextFloat();
			System.out.println("The returned value is: "+g.PayCash(cash));
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 6:
			System.out.println("GasPump Class");
			System.out.println("Cancel() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Cancel());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 7:
			System.out.println("GasPump Class");
			System.out.println("Regular() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Regular());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 8:
			System.out.println("GasPump Class");
			System.out.println("Super() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Super());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;	

			case 9:
			System.out.println("GasPump Class");
			System.out.println("Diesel() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Diesel());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 10:
			System.out.println("GasPump Class");
			System.out.println("StartPump() method");
			System.out.println();
			System.out.println("The returned value is: "+g.StartPump());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 11:
			System.out.println("GasPump Class");
			System.out.println("PumpLiter() method");
			System.out.println();
			System.out.println("The returned value is: "+g.PumpLiter());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 12:
			System.out.println("GasPump Class");
			System.out.println("StopPump() method");
			System.out.println();
			System.out.println("The returned value is: "+g.StopPump());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 13:
			System.out.println("GasPump Class");
			System.out.println("NoReceipt() method");
			System.out.println();
			System.out.println("The returned value is: "+g.NoReceipt());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			case 14:
			System.out.println("GasPump Class");
			System.out.println("Receipt() method");
			System.out.println();
			System.out.println("The returned value is: "+g.Receipt());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 15:
			System.out.println("GasPump Class");
			System.out.println("TurnOff() method");
			System.out.println();
			System.out.println("The returned value is: "+g.TurnOff());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;
			
			
			case 16:
			gs=g.getState();
			if(gs==-1)
			System.out.println("State: Entry State");
			else if(gs==-2)
			System.out.println("State: Exit State");
			else
			System.out.println("State:  S"+g.getState());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 17:
			
			System.out.println("Price: $ "+g.getPrice());
			System.out.println("Total: $"+g.getTotal());
			System.out.println("Cash: $"+g.getCash());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 18:
			System.out.println("Value of w: "+g.getW());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 19:
			System.out.println("Number of Gallons pumped: "+g.getNumberOfGallons());
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			break;

			case 20:
			System.out.println("Quit");
			i=1;
			break;

			default:
			System.out.println("Please enter valid input");
			System.out.print("Press enter to continue");
			sc.nextLine();
			sc.nextLine();
			
		}	
		}		
	}
}
