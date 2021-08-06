package app.practice.ArraysExample;
import java.util.Arrays;

public class Anagrams {
	
	public static String sortChars(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
	

	public static void main(String[] args) {
		String word = "java2blog";
        String anagram = "aj2vabgol";
        
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
        
        System.out.println(sortedWord.equals(sortedAnagram));
	}

}
