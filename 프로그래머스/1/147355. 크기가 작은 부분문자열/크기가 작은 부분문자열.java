class Solution {
    public int solution(String t, String p) {
        //Integer.parseInt() 그대로 사용하면서 앞만 long으로 바꾸는 바보 짓 함.

        long p_num=Long.parseLong(p); //p -> Long으로 전환
        int p_len=p.length();
        int answer = 0; 
        
        for (int i =0; i<t.length()-(p_len-1);i++){ //p의 자릿수가 여러개일 경우 그 갯수-1만큼 for문을 덜 돌려야함
            long t_num=Long.parseLong(t.substring(i,i+p_len)); //t에서 p의 자릿수에 맞게 부분 문자열 출력 -> 숫자로 전환
            if(t_num<=p_num){ //전환한 숫자 t_num과 p_num 비교
                answer ++;
            }
        }
        return answer;
    }
}
