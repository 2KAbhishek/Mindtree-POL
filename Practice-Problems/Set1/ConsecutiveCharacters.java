import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence : ");
		String sen = scan.nextLine();
		scan.close();
		printConsecutiveCharacters(sen);
	}

	private static void printConsecutiveCharacters(String sen) {
		char str[] = new char[sen.length()]; 
		for (int i = 0; i < str.length; i++)
			str[i] = sen.charAt(i);
		
		HashMap<String, Integer> counts = new HashMap<>();
		
        for (int i = 1; i < str.length; i++) { 
            if (str[i] == str[i - 1] + 1)  {
            	str[i-1] = (char) (Character.isUpperCase(str[i-1])? str[i-i] : str[i-1] - 32);
            	str[i] = (char) (Character.isUpperCase(str[i])? str[i] : str[i] - 32);
                String temp = str[i-1] +""+ str[i];
                
                if (counts.containsKey(temp)) counts.put(temp, counts.get(temp)+1);
                else counts.put(temp,1);
            }
        }
        for(Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
	}

}
