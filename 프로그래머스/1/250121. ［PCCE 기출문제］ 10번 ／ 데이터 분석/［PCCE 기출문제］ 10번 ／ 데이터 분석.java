class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        
        int check = -1;
        
        switch(ext){
            case "code" : check = 0;
                break;
            case "date" : check = 1;
                break;
            case "maximum" : check = 2;
                break;
            case "remain" : check = 3;
                break;
        }
        
        int sum = 0;
        for(int i = 0; i < data.length; i++){
        
            if(data[i][check] < val_ext)
                sum++;
            
        }
        
        answer = new int[sum][4];
        boolean[] b = new boolean[data.length];
        
        int check2 = -1;
        
        switch(sort_by){
            case "code" : check2 = 0;
                break;
            case "date" : check2 = 1;
                break;
            case "maximum" : check2 = 2;
                break;
            case "remain" : check2 = 3;
                break;
        }
        
        for(int i = 0; i < sum; i++){
        
            int min = Integer.MAX_VALUE;
            int index = -1;
            
            for(int j = 0; j < data.length; j++){
                
                if(data[j][check] < val_ext && min > data[j][check2] && !b[j]){
                    min = data[j][check2];
                    index = j;
                }
                
            }
            
            b[index] = true;
            
            answer[i][0] = data[index][0];
            answer[i][1] = data[index][1];
            answer[i][2] = data[index][2];
            answer[i][3] = data[index][3];
            
        }
        
        return answer;
    }
}