package algorithm;

public class 나머지1이되는수찾기 {
    public static void main(String[] args) {
//		int n = 10;
        int n = 12;
        System.out.println(new 나머지1이되는수찾기().solution(n));
    }
    public int solution(int n) {
        for(int i=2;i<=n-1;i++) {
            if((n-1)%i==0) return i;
        }
        return -1;
    }
}
