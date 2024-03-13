class Solution {
    public int solution(String t, String p) {
        long p_num=Long.parseLong(p);
        System.out.println(p_num);
        int p_len=p.length();
        System.out.println(p_len);
        int answer = 0; 
        for (int i =0; i<t.length()-(p_len-1);i++){
            long t_num=Long.parseLong(t.substring(i,i+p_len));
            if(t_num<=p_num){
                System.out.println(t_num);
                answer ++;
            }
        }
        return answer;
    }
}