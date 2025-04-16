def solution(price, money, count):
    total_cost = price * (count * (count + 1)) // 2
    shortage = total_cost - money
    return shortage if shortage > 0 else 0