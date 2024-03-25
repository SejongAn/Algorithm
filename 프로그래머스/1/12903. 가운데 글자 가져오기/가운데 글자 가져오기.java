class Solution {
    public String solution(String s) {
        String answer;
        if(s.length() % 2 == 1){ //s길이가 홀수
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        else{ //s길이가 짝수
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        
        return answer;
    }
}
