def solution(left, right):
    answer = 0
    
    for i in range(left, right+1):
        n = find(i)
        if n % 2 == 0:
            answer += i
        else:
            answer -= i
    
    return answer

def find(a):
    count = 0
    for i in range(1, a+1):
        if a % i == 0:
            count += 1
            
    print(count)

    return count
    