package algorithm;

import java.util.ArrayList;

public class 다트게임 {
    public static void main(String[] args) {
        String dartResult="1S2D*3T";

        System.out.println(new l17682().solution(dartResult));
    }
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<dartResult.length();i++){
            if(dartResult.charAt(i)>='0'&&dartResult.charAt(i)<='9'){
                if(dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0'){
                    arr.add(pow(10, dartResult.charAt(i+2)));
                    i+=2;
                }
                else{
                    arr.add(pow(dartResult.charAt(i)-'0', dartResult.charAt(i+1)));
                    i++;
                }
            }
            else if(dartResult.charAt(i)=='*'){
                if(arr.size()!=1){
                    arr.set(arr.size()-2, 2*arr.get(arr.size()-2));
                }
                arr.set(arr.size()-1, 2*arr.get(arr.size()-1));
            }
            else if(dartResult.charAt(i)=='#'){
                arr.set(arr.size()-1, -1*arr.get(arr.size()-1));
            }
        }
        for(int i=0;i<arr.size();i++){
            answer+=arr.get(i);
        }
        return arr.stream().reduce((acc, i)->acc+i).get();
    }
    public int pow(int num, char c){
        switch(c){
            case 'S':
                return (int)Math.pow(num, 1);
            case 'D':
                return (int)Math.pow(num, 2);
            case 'T':
                return (int)Math.pow(num, 3);
        }
        return -1;
    }
}
