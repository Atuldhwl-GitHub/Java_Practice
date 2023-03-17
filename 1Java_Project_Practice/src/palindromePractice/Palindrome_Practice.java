package palindromePractice;



public class Palindrome_Practice {
	
	public static void main(String[] args) {
		
		String input = "racecar level noon civic the radar kayak refer";
		String[] words = input.split(" ");
		
		for (String word : words) {
		      if (isPalindrome(word)) {
		        System.out.println(word);
		      }
		    }
	}
	
	public static boolean isPalindrome(String word) {
	    int length = word.length();
	    for (int i = 0; i < length / 2; i++) {
	      if (word.charAt(i) != word.charAt(length - i - 1)) {
	        return false;
	      }
	    }
	    return true;
	  }
	
}
