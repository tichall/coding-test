# 2231번 분해합
# 브루트 포스

n = int(input())
tmp = False
for i in range(1, n+1) :
    num = i
    test = str(num)
    for j in range(len(test)) :
        num += int(test[j])
    if n == num :
        print(i)
        break
    if i == n :
        print(0)