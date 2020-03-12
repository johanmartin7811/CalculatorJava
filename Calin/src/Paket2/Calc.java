package Paket2;
import java.util.Scanner;

public class Calc {
	Scanner operation = new Scanner(System.in);
	String[] calculationArray = {"+","-","*","/"};
	@SuppressWarnings("resource")
	public void Menu(){
	boolean run = true;
	while(run) {
		System.out.println("---------Välkommen----------\n");
		System.out.println("------ Välj ett räknesätt------\n");
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
	   		System.out.println("Skriv in ditt första nummer : ");
	   		num1 = input.nextDouble();
	   		System.out.println("Skriv in ditt andra nummer : ");
	   		num2 = input.nextDouble();
	   		System.out.println("Summan är: ");
	    	}catch(Exception e) {
	    		System.out.println("Använd korrekt input\n");
	    		 
	    		
	    	}
	    }
	    else if (choice.equals("2"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt första nummer : ");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println("Differensen är: ");
	    	}catch(Exception e) {
	    		System.out.println("Använd korrekt input\n");
	    	}
	    }
    	
	    else if (choice.equals("3"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt första nummer :");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println( "Produkten är: ");
	    	}catch(Exception e) {
	    		System.out.println("Använd korrekt input\n");
	    	}
	    }
	    else if (choice.equals("4"))
	    {
	    	try {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Skriv in ditt första nummer :");
	    	num1 = input.nextDouble();
	    	System.out.println("Skriv in ditt andra nummer : ");
	    	num2 = input.nextDouble();
	    	System.out.println( "Kvoten är " );
	    	}catch(Exception e) {
	    	System.out.println("Använd korrekt input\n");
	    		
	    	}
	    	
	    }
	    else if (choice.equals("5")) 
	    {
	    	System.out.println("Du har nu avslutat Kalkylatorn!!!!!\nFör att starta upp den igen tryck CTRL + F11 ");
	    	System.exit(0); 
	    }
	    else
	    {
	    	System.out.println("Använd korrekt input\n ");
	    }
	    
	    
	    /*Kolla och gå igenom arrayen*/
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
				System.out.println("Du får ej dela med siffran 0\n");
			  }
				
				break;
			}
	    }
	   
			
	    }
	    
	}
	
	}


         
	



            
            
            
	



	
            
            	            
      


