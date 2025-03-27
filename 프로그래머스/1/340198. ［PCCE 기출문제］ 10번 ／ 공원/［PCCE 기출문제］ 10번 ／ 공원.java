import java.util.*;

class Solution {
    
    static boolean[][] visit;
    static int x, y;
    
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        x = park.length;
        y = park[0].length;

        visit = new boolean[x][y];
        
        for(int j = 0; j < x; j++)
            for(int z = 0; z < y; z++)
                if(park[j][z].equals("-1"))
                    visit[j][z] = true;
        
        Arrays.sort(mats);
        
        for(int i = mats.length-1; i >= 0; i--){
            
            for(int j = 0; j < x; j++) {
                for(int z = 0; z < y; z++){
                    if(visit[j][z]) {
                        if(bfs(mats[i], j, z)) {
                            return mats[i];
                        }
                    }
                }
            }
            
        }
        
        return answer;
    }
    
    public static boolean bfs(int n, int X, int Y){
          
        if(X + n <= x && Y + n <= y){
            for(int i = X; i < X + n; i++){
                for(int j = Y; j < Y + n; j++){
                    if(!visit[i][j]){

                        return false;
                    } 
                }
            }   
        } else {
            return false;
        }
        
        return true;
        
    }
}