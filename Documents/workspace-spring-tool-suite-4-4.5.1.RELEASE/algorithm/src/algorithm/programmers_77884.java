package algorithm;
import java.util.*;

public class programmers_77884 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        class Solution {
            public int solution(int left, int right) {

                int answer = 0;
                for(int i=left; i<=right;i++){
                    int temp = 1;
                    for (int j=1; j<=i/2;j++){
                        if(i%j==0){
                            temp++;
                        }
                    }
                    answer += temp%2 == 0 ? i : -i;
                }
                return answer;
            }
        }
    }

}
