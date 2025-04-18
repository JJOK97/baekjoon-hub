def solution(numbers):
    answer = 0
    arr = [False, False, False, False, False, False, False, False, False, False]
    
    for i in numbers:
        arr[i] = True
        
    for i in range(10):
        if(arr[i] == False):
            answer += i
        
    return answer