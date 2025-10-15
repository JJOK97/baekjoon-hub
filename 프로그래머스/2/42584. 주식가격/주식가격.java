import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> q = new LinkedList<>();
            
        for(int i = 0; i < answer.length; i++){
            q.offer(prices[i]);
        }
        
        for(int i = 1; i <  answer.length; i++){
            int num = q.poll();
            int count = 0;
            
            for(int j = i; j < answer.length; j++){
                
                if(num <= prices[j]){
                    count++;
                    continue;
                } else {
                    count++;
                    break;
                }
            }
            
            answer[i-1] = count;
            
        }
        
        return answer;
    }
}