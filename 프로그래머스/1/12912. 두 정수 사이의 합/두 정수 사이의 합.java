class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a <= b){
            if(a != b){
                for(int i = a; i <= b; i++)
                    answer += i;
            }else {
                answer = a;
            }
        } else {
            if(a != b){
                for(int i = b; i <= a; i++)
                    answer += i;
            }else {
                answer = a;
            }
        }
        
        return answer;
    }
}