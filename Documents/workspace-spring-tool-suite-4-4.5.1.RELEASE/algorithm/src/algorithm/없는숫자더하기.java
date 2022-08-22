package algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 없는숫자더하기 {
    public static void main(String[] args) {
//		int[] numbers= {1,2,3,4,6,7,8,0};
        int[] numbers= {5,8,4,0,6,7,9};
        System.out.println(new 없는숫자더하기().solution2(numbers));
    }
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i : numbers)answer-=i;
        return answer;
    }
    public int solution2(int[] numbers) {
        return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
}
