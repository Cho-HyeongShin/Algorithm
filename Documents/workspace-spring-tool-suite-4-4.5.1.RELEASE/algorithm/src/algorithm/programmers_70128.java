package algorithm;
import java.util.*;

public class programmers_77884 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        class Solution {
            public int solution(int[] a, int[] b) {
                int answer = 0;
                for(int i=0; i<a.length; i++){
                    answer += a[i]*b[i];
                }
                return answer;
            }
        }
    }

}

