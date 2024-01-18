# 2231번 분해합
# 브루트 포스

n = int(input())
tmp = False
for i in range(1, n) :
    num = i
    test = str(i)
    for j in range(len(test)) :
        num += int(test[j])
    if n == num :
        print(i)
        tmp = True
        break
if tmp == False :
    print(0)