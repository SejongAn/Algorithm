import java.util.*;

class Solution {
    public int solution(int[][] sizes) {

        int long_w=0;
        int short_w=0;
        for(int[] v:sizes){
           
            Arrays.sort(v); //짧은 길이를 첫번째로, 긴 길이를 2번째로 정렬
            short_w=Math.max(short_w,v[0]); //짧은 길이가 짧은 길이중에서 최대치면 변수에 넣기
            long_w=Math.max(long_w,v[1]); //긴 길이가 긴 길이중에서 최대치면 변수에 넣기
        }
        return short_w*long_w;
    }
}
