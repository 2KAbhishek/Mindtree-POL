import java.util.Scanner;

public class RevLettersOnly {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence = scan.nextLine();
		scan.close();
		String[] words = splitWith(sentence, ' ');
		String out = "";
		for (String word : words) {
			out += reverseLetters(word);
			out += " ";
		}
		out = out.substring(0, out.length() - 1);
		System.out.println("After reversal : " + out);
	}

	private static String[] splitWith(String str, char splitWith) {
		char[] words = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			words[i] = str.charAt(i);
		}
		
	    String temp="";
	    int j=0,length=0,size=0;
	    
	    for(int i = 0; i < str.length(); i++){
	        if(splitWith == str.charAt(i)){
	            size++;
	        }
	    }
	    
	    String[] arr = new String[size+1];
	    
	    for(int i = 0;i < words.length; i++) {
	        if(length > j) {
	            j++;
	            temp = "";
	        }
	        if(splitWith == words[i]){
	            length++;
	        }else{
	            temp += Character.toString(words[i]);          
	        }
	    arr[j] = temp;
	    }
	    return arr;
	}

	private static String reverseLetters(String sentence) {
		char[] str = new char[sentence.length()];
		for (int i = 0; i < sentence.length(); i++) {
			str[i] = sentence.charAt(i);
		}
		
        int r = str.length - 1, l = 0; 
  
        while (l < r) { 
            if (!Character.isAlphabetic(str[l])) 
                l++; 
            else if(!Character.isAlphabetic(str[r])) 
                r--; 
  
            else { 
                char tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        }
        
        String newWord = "";
        for (char c: str) newWord += c;
		return newWord; 
	}
}
