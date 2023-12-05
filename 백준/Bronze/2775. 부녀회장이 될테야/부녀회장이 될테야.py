# 부녀회장이 될테야

t = int(input())

for i in range(t):
    k = int(input())
    n = int(input())
    apt = [i for i in range(1, n+1)]

    for i in range(k):
        for j in range(1, n):
            apt[j] += apt[j-1]
    print(apt[-1])


