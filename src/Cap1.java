import java.util.Scanner;
public class Cap1 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean goNext = true;
		String yes;
		String userText;
		String lowerText;
		while(goNext) {
		    System.out.println("Please enter a line of text to be translated:");
		    userText = userInput.nextLine();
		    lowerText = userText.toLowerCase();
		    if (userText.isEmpty()) {
		    	do{
		    		System.out.printf("Please try again.\n");
		    		userText = userInput.nextLine();
		    		lowerText = userText.toLowerCase();
		    	}while (userText.isEmpty());
		    }
		    	else {
		    		String[] wordBreak = lowerText.split(" ");
		    		String output = "";
		    	for (int i = 0; i < wordBreak.length; i++) {
		    		String pigLatin = wordReader(wordBreak[i]);
		    		output += pigLatin + " ";
			}
			System.out.println("Here is your sentence translated: " + output);
			System.out.println("");
			System.out.println("Would you like to translate another line? yes/no");
			yes = userInput.nextLine().toLowerCase();
			if(yes.equals("yes")) {
			   goNext = true;
		    }else {
			   break;
		    }
		}
		}
		System.out.println("Thanks for playing!");
		userInput.close();
	}
	private static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
	private static String wordReader(String word) {
		int vowel1 = -1;
		char ch;
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if (isVowel(ch)) {
				vowel1 = i;
				break;
			}
		}
		if (vowel1 == 0) {
			return word + "way";
		}else {
			String a = word.substring(vowel1);
			String b = word.substring(0, vowel1);
			return a + b + "ay";
		}
	}

}
