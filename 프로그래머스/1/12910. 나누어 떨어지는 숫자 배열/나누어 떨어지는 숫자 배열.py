def solution(arr, divisor):
    filtered = [x for x in arr if x % divisor == 0]
    return sorted(filtered) if filtered else [-1]