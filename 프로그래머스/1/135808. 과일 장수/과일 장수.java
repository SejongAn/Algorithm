import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score); //배열 오름차순으로 정렬(가장 높은 값 맨뒤)
        //가장 큰 값이 위치하는 맨뒤부터 상자에 담을 갯수인 m개씩 짤라서
        //해당 값 계산 후 answer에 더해주기
        for(int i=score.length-m;i>=0;i-=m){
            answer += score[i]*m; 
        }
        
        return answer;
    }
}
