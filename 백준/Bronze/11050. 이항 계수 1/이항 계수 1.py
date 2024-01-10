# 이항 계수 1

def factorial(num) :
    if num == 0 :
        return 1
    return(num * factorial(num - 1))


n, k = map(int, input().split())

result = factorial(n) // (factorial(n-k) * factorial(k))

print(result)
