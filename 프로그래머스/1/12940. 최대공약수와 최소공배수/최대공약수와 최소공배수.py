
def solution(n, m):
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    g = gcd(n, m)
    l = n * m // g
    return [g, l]
