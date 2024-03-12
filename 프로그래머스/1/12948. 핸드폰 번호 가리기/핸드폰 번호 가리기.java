import java.util.*;
class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        
        //1. 전체 길이-4 만큼 별 answer에 넣기
        int strleng = phone_number.length();
        for (int i=0;i<strleng-4;i++){
            answer = answer + "*";
        }
        
        //2. .substring을 사용해서 마지막 4번째 전부터 끝까지 추출해서 answer에 대입
        answer = answer + phone_number.substring(strleng-4,strleng);
        
        return answer;
    }
}