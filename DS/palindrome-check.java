//Most efficient solution

import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length()/2; i++){
      if (str.charAt(i) != str.charAt(str.length()-i-1)){
        return false;
      }
    }
    return true;
  }
}


//O(n) Time | O(n) space complexity

class Program {
  public static boolean isPalindrome(String str) {
    StringBuilder reverseStr = new StringBuilder();
    for(int i=str.length()-1; i>=0; i--){
      reverseStr.append(str.charAt(i));
    }
    return str.equals(reverseStr.toString());
  }
}


//My solution

import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		if(str == null || str.length() == 0)
    	return false;
		int left = 0;
		int right = str.length()-1;
		while(left < right){
			
			if(str.charAt(left) != str.charAt(right))
				return false;
			
			left ++;
			right --;
			
		}
		
		return true;
  }
}





// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest {
  @Test
  public void TestCase1() {
    Utils.assertTrue(Program.isPalindrome("abcdcba"));
  }
}
