package Hashmap_27jan_2025;

import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str =sc.nextLine();

		if (!str.isEmpty()) {
			
			char[] EachWord = str.toCharArray();
			
			for (int i = 0; i < EachWord.length; i++) {
				int count = 1;
				for (int j = i + 1; j < EachWord.length; j++) {
					if (EachWord[i] == EachWord[j]) {
						count++;
						EachWord[j] = '*';
					}
				}
				if (count > 0 && EachWord[i] != '*'&& EachWord[i]!=' ') {
					HashMap<Character, Integer> list=new HashMap<Character, Integer>();
					list.put(EachWord[i],count);
					System.out.println("'"+EachWord[i]+"'"+" occurs "+count+" Times ");
				}
			}
						
			
		}else 
		{
			System.err.println("No output as there are no characters");
		}
		
		

	}

}
