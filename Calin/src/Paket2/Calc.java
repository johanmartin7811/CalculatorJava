package Paket2;
import java.util.Scanner;

public class Calc {
	Scanner operation = new Scanner(System.in);
	String[] calculationArray = {"+","-","*","/"};
	@SuppressWarnings("resource")
	public void Menu(){
	boolean run = true;
	while(run) {
		System.out.println("---------V�lkommen----------\n");
		System.out.println("------ V�lj ett r�knes�tt------\n");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");	
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        System.out.println("5. Avsluta");
        String choice;
	    choice = operation.nextLine();
	    double num1 = 0, num2 = 0;
       
	  //If statements to check which operation.
	   
	    if (choice.equals("1"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	   		System.out.println("Skriv in ditt f�rsta nummer : ");
	   		num1 = input.nextDouble();
	   		System.out.println("Skriv in ditt andra nummer : ");
	   		num2 = input.nextDouble();
	   		System.out.println("Summan �r: ");
	    	}catch(Exception e) {
	    		System.out.println("Anv�nd korrekt input\n");
	    		 
	    		
	    	}
	    }
	    else if (choice.equals("2"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt f�rsta nummer : ");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println("Differensen �r: ");
	    	}catch(Exception e) {
	    		System.out.println("Anv�nd korrekt input\n");
	    	}
	    }
    	
	    else if (choice.equals("3"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt f�rsta nummer :");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println( "Produkten �r: ");
	    	}catch(Exception e) {
	    		System.out.println("Anv�nd korrekt input\n");
	    	}
	    }
	    else if (choice.equals("4"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt f�rsta nummer :");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println( "Kvoten �r " );
	    	}catch(Exception e) {
	    	System.out.println("Anv�nd korrekt input\n");
	    		
	    	}
	    	
	    }
	    else if (choice.equals("5")) 
	    {
	    	System.out.println("Du har nu avslutat Kalkylatorn!!!!!\nF�r att starta upp den igen tryck CTRL + F11 ");
	    	System.exit(0); 
	    }
	    else
	    {
	    	System.out.println("Anv�nd korrekt input\n ");
	    }
	    
	    
	    /*Kolla och g� igenom arrayen*/
	    for (int i=0; i< calculationArray.length; i++)
	    {
	    	if (choice.equals("1"))
	    	{
	    		System.out.println(num1 + num2 +"\n");
	    		
	    		break;
	    	}
	    	else if (choice.equals("2") )
			{
				
				System.out.println(num1 - num2 +"\n");
				break;
			}
			else if (choice.equals("3"))
			{
				System.out.println(num1 * num2 +"\n");
				break;
			}
	    	
			else if (choice.equals("4"))
			{
			    System.out.println(num1 / num2);
			  if(num1 == 0 || num2 == 0) {
				System.out.println("Du f�r ej dela med siffran 0\n");
			  }
				
				break;
			}
	    }
	   
			
	    }
	    
	}
	
	}


         
	



            
            
            
	



	
            
            	            
      


