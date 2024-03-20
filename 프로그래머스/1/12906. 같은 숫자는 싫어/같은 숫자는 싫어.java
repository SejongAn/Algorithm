import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> store=new ArrayList<Integer>();
        //배열 첫번째 리스트에 넣기
        store.add(arr[0]);
        //전에 애랑 다른 애만 리스트에 넣기
        for(int i=1;i<arr.length;i++){
           if(arr[i-1]!=arr[i]){
               store.add(arr[i]);
           } 
        }
        int[] answer = new int[store.size()];
        int count=0;
        //리스트를 answer배열로 전환
        for(Integer a: store){
            answer[count++]=a;
        }
        return answer;
    }
}