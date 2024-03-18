class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(i%2==0){ //홀수면
                //add 박
                answer = answer + '수';
            }
            else{ //짝수면
                //add 수
                answer = answer + '박';
            }
        }

        return answer;
    }
}
