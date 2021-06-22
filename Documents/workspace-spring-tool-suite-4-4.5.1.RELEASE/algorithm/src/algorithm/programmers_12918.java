package algorithm;

public class programmers_12918 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12918
		class Solution {
		    public boolean solution(String s) {
		        if(!(s.length() == 4 || s.length() == 6)) return false;
				for(int i=0; i<s.length(); i++) {
					if(!((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)) return false;
				}
				
				return true;
		    }
		}
	}

}
