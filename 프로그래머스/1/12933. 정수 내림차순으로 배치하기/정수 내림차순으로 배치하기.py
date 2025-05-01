def solution(n):
    digits = list(str(n))
    digits.sort(reverse=True)
    sorted_number = int(''.join(digits))
    return sorted_number