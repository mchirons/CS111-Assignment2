public class ReverseWords {
    public static void main(String[] args) {
    	String tempWord = ""; //for storing word that is about to be reversed
    	String reversedWord = ""; //for storing the word that has been reversed
    	String reversedString = ""; //for storing the final answer string
    	
    	String inputString = IO.readString();  //takes string input from user, store in inputString
    	for (int i = 0; i < inputString.length(); i++){ //repeats for each character of inputString
    		if ((int)inputString.charAt(i) > 64 && (int)inputString.charAt(i) < 91){ //checks if character is A-Z
    			//is valid input
    		}
    		else if((int)inputString.charAt(i) > 96 && (int)inputString.charAt(i) < 123){ //checks if character is a-z
    			//is valid input
    		}
    		else if((int)inputString.charAt(i) == 32){ //checks if character is " " whitespace
    			//is valid input
    		}
    		else{ // if none of the above, character is bad input
    			IO.reportBadInput();
    			System.exit(0);
    		}
    	}
    	
    	inputString = inputString + " "; //so that each word has a " " character following
    	String alteredString = inputString; //stores input string in a variable that will be manipulated
    	boolean areWordsLeft = true; //to initiate loop
    	while (areWordsLeft){
    		tempWord = alteredString.substring(0, alteredString.indexOf(" "));//makes a new string of the first word of altered string with trailing space removed
    		alteredString = alteredString.substring(alteredString.indexOf(" ") + 1, alteredString.length()); //alteredString now excludes tempWord
    		for (int i = 1; i <= tempWord.length(); i++){ //continues for as many letters there are in tempWord
    			reversedWord = reversedWord + tempWord.charAt(tempWord.length() - i); //takes the last letter of tempWord and adds it to reversedWord
    		}
    		reversedWord = reversedWord + " "; //adds trailing space back on 
    		reversedString = reversedString + reversedWord; //adds newly reversed word to the final answer string
    		reversedWord = ""; //clears reversedWord so that it can store next reversed word in string
    		if (alteredString.equals("")){ //if true that means that there are no more words to reverse
    			areWordsLeft = false;
    		}
    		else{
    			//loop continues
    		}
    	}
    	reversedString = reversedString.trim(); //removes trailing " " that was added at the beginning to inputString
    	IO.outputStringAnswer(reversedString); //outputs answer string
    }
}
