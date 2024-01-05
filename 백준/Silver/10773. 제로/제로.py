k = int(input())
stack = [0] * k
sum = 0

for i in range(k):
    num = int(input())
    if num == 0 : 
        stack.pop()
        continue
    stack.append(num)

for i in range(len(stack)):
    sum += stack[i]

print(sum)
