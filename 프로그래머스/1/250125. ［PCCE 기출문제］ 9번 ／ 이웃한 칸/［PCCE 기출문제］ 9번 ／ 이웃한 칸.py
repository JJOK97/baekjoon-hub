def solution(board, h, w):
    answer = 0
    
    n = len(board)
    dh = [0, 1, -1 ,0]
    dw = [1, 0, 0, -1]
    color = board[h][w]
    
    for i in range(4):
        nh = h + dh[i]
        nw = w + dw[i]
        if(0 <= nh and 0 <= nw and nh < n and nw < n and board[nh][nw] == color):
            answer += 1
            
    
    
    
    return answer