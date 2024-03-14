class Solution {
    public int[] solution(int n, String[] words) {
        
        int num=0;
        int turn=0;

        loop:
        for(int i=1;i<words.length;i++){ //첫번째 단어에는 문제 생길일이 없기에 2번째 단어 부터 시작
            num = (i+1)%n==0?n:(i+1)%n; //몇번째 사람인지
            turn = i/n+1; //몇번째 차례 인지
            
            //전 단어와 앞뒤가 안맞는 경우 검사
            if(words[i-1].charAt(words[i-1].length()-1) !=words[i].charAt(0)){
                break;
            }
            //words 배열의 기존 부분 i사용해서 그 부분만 검사
            for(int j=0;j<i;j++){
                if(words[j].equals(words[i])){
                    break loop;
                }
            }
            num=0;
            turn=0;
        }

        int[] answer = {num,turn};
        return answer;
    }
}
