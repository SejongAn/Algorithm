import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        //String 배열에 s 공백 단위로 쪼개서 넣기
        String[] div_s = s.split(" ");
        
        //그렇게 쪼갠 하나하나를 리스트에 int형식으로 넣기
        for (int i=0;i<div_s.length;i++){
            int num = (int)Integer.parseInt(div_s[i]);  
            arrList.add(num);
        }
        
        //리스트안의 최대값 최소값 추출
        int max =Collections.max(arrList);
        int min = Collections.min(arrList);
        
        //answer 구문 완성
        String answer = min + " " + max;
        return answer;
    }
}