package algorithm;

public class programmers_12951 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12948
		class Solution {
		    public String solution(String s) {
		        String answer = "";
		        int len = s.length();
		        String first = s.charAt(0) + "";
		        s = first.toUpperCase() + s.substring(1);
		        
		        for(int i = 1 ; i < len; i++){
		            if(s.charAt(i) == ' '){
		                continue;
		            }else if(s.charAt(i - 1) == ' '){
		                s = s.substring(0, i) + (s.charAt(i) + "").toUpperCase() + s.substring(i+1);
		            }else {
		                s = s.substring(0, i) + (s.charAt(i) + "").toLowerCase() + s.substring(i+1);
		            }
		        }

		        return s;
		    }
		}
	}
}
