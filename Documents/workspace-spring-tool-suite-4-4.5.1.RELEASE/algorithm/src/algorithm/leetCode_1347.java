package algorithm;
import java.util.*;

public class leetCode_1347 {
	public static void main(String[] args) {
		//test commit
		class Solution {
		    public int minSteps(String s, String t) {
		    int[] temp = new int[26];
		        for(int i = 0; i<s.length(); i++) {
		        temp[s.charAt(i) - 'a'] ++;
		        temp[t.charAt(i) - 'a'] --;
		            
		        }
		        return Arrays.stream(temp).map(Math::abs).sum() /2; 
		    }
		}
	}
}
