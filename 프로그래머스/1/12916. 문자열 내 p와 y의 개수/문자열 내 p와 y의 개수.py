def solution(s):
    answer = True
    
    pCount = 0
    yCount = 0
    
    for i in s:
        if i == 'p' or i == 'P':
            pCount += 1
        elif i == 'y' or i == 'Y':
            yCount += 1
        
    if(yCount != pCount):
        answer = False
    
    return answer