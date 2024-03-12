class Solution {
    public int solution(int n) {
        //재귀함수로 풀면 안됨..
        //수열을 제일 작은 것 부터 n까지 계산(제일 작은게 문제에서는 2로 주어짐)
        //따라서 for문 2부터 구할 n까지
        int f1=0;
        int f2=1;
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            answer=(f1+f2)%1234567; //나눠주라 해서 나눠줌
            f1=f2;
            f2=answer;    
        }

        return answer;
    }
}
