class Solution {
    public int solution(int[] number) {
        int answer = 0;
        //for문 3개를 중첩시켜서
        //각 for문 마다 x, y, z를 담당함
        //y는 시작이 x 바로 다음 숫자
        //z는 시작이 y바로 다음 숫자

        for(int i=0;i<number.length -2;i++){
            for(int j=i+1;j<number.length -1;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){answer++;}
                    System.out.println("i+j+k ="+i + j + k);
                }
            }  
        }
        return answer;
    }
}