class Solution {
    public int solution(int n) {
        int f1=0;
        int f2=1;
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            answer=(f1+f2)%1234567;      
            f1=f2;
            f2=answer;    
        }

        return answer;
    }
}