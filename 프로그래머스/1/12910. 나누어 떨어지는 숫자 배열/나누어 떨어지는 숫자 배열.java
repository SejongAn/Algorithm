import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        //담을 리스트 생성
        ArrayList<Integer> arrList = new ArrayList<>();
        
        //arr안의 값중 divisor로 나누어 떨어지느 것만 arrList에 담기
        for (int i=0;i<arr.length;i++){
            if (arr[i]%divisor==0){
                arrList.add(arr[i]);
            }
        }
        
        //만약 arrList에 아무것도 안담겨 있다면 -1 담아주기
        if (arrList.size()==0){
            arrList.add(-1); 
        }
        
        //자 배열로 전환 드가자~~
        //1. Integer 배열로 전환
        int arrListSize=arrList.size();
        Integer[] ex_answer = arrList.toArray(new Integer[arrListSize]);
        
        //2. int 배열로 전환
        int[] answer = new int[ex_answer.length];
        for (int i=0; i < ex_answer.length;i++){
            answer[i]=ex_answer[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}