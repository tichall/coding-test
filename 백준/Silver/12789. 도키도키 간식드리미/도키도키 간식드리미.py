# 도키도키 간식드리미

n = int(input())
stack = []
tmp = 1
order = list(map(int, input().split()))

for i in range(len(order)):
    stack.append(order[i])     
    while stack and stack[-1] == tmp :
        stack.pop()
        tmp += 1
    if len(stack) > 1 and stack[-1] > stack[-2] :
        print("Sad")
        exit()

if stack :
    print("Sad")
else :
    print("Nice")
