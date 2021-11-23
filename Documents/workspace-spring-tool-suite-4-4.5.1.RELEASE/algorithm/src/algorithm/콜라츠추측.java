class Solution {
    public int solution(long num) {
        int answer = 0;

        for(int i = 1; i<=501; i++) {
            if(num == 1) { // 1
                break;
            }

            if(num % 2 == 0) { // 짝수
                num = num / 2;
                answer++;
            } else { // 홀수
                num = (num * 3) + 1;
                answer++;
            }

            if(i == 501) {
                answer = -1;
            }
        }

        return answer;
    }
}