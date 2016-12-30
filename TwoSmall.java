public class TwoSmall{
    public static void main(String[] args) {
    	
    	int number = 0;
    	int smallest = 0;
    	int secondSmallest = 0;
    	
    	number = IO.readInt();
    	if (number == 0){  
    			IO.reportBadInput();
    			System.exit(0);
    	}
    	smallest = number;
    	while (number != -1){	       //int sentinel value -1 ends loop
    		number = IO.readInt();
    		if (number == 0){  
    			IO.reportBadInput();
    			System.exit(0);        //ends program
    		}
    		else {} //Nothing
    		if (number == -1){         //skips to test of loop
    			continue;
    		}
    		else{} //Nothing
    		if ((number >= smallest) && (secondSmallest == 0)){ //for first secondSmallest assignment
    			secondSmallest = number;
    		}
    		else if ((number >= smallest) && (number <= secondSmallest)){
    			secondSmallest = number;
    		}
    		else{} //Nothing
    		if (number <= smallest){
    			secondSmallest = smallest;
    			smallest = number;
    		}	
    	}
    	IO.outputIntAnswer(smallest);
    	IO.outputIntAnswer(secondSmallest);
    }
}
