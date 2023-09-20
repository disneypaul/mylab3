


//My solution

import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
		if(array.length <= 0)
   	 return -1;
		int pos = -1;
		int startPos = 0;
		int endPos = array.length-1;
		while(startPos <= endPos){
			pos = ((endPos + startPos) / 2);
			if(array[pos] == target)
				return pos;
			if(array[pos] < target)
				startPos = pos+1;
			else
				endPos = pos-1;
		}
		
		return -1;
  }
}
