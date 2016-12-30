public class Fine{
    public static void main(String[] args) {
    	
    	int daysLate = 0;                                                       //Initiating variables
    	int bookCost = 0;
    	int lateFee = 0;
    	
    	System.out.println("Days late?");   
    	daysLate = IO.readInt();                                                //Stores int input in daysLate
    	System.out.println("Book cost?");
    	bookCost = IO.readInt();
    	if (bookCost <= 0 ){
    		IO.reportBadInput();
    		System.exit(0);
    	}
    	if (daysLate <= 0 ){
    		IO.reportBadInput();
    		System.exit(0);
    	}
    	else if ((daysLate > 0 ) && (daysLate < 8 )){                           //if 7 days or less late
    		lateFee = 10 * daysLate;    
    	}
    	else if ((daysLate >= 8) && (daysLate < 91)){                            //8 to 90 days late
    		lateFee = 70 + (20 * (daysLate - 7)); 
    	}
    	else {
    		lateFee = bookCost + 1000;                                          //old fees wiped, now book cost plus $10
    	}
    	IO.outputIntAnswer(lateFee);
    }
}
