class Solution {
    public int[] solution(int n, String[] words) {
        
        int num=0;
        int turn=0;

        loop:
        for(int i=1;i<words.length;i++){
            num = (i+1)%n==0?n:(i+1)%n;
            System.out.println("num: " +num);
            turn = i/n+1;
            System.out.println("turn: "+turn);
            
            //전 단어와 앞뒤가 안맞는 경우
            if(words[i-1].charAt(words[i-1].length()-1) !=words[i].charAt(0)){
                break;
            }
            //words 배열의 기존 부분 i사용해서 그 부분만 검사
            for(int j=0;j<i;j++){
                System.out.println("words[j]:" + words[j]);
                System.out.println("words[i]:" + words[i]);
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